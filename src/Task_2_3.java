import models.News;
import service.DBConnector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/news")
public class Task_2_3 extends HttpServlet {

    @Override
    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        ArrayList<News> news  = DBConnector.getAllNews();
        request.setAttribute("news", news);
        request.getRequestDispatcher("/news.jsp").forward(request,response);
    }
}
