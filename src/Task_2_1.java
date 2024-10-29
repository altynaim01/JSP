import models.Item;
import service.DBConnector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/task-2-1")
public class Task_2_1 extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {

    }



    @Override

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Item> items = DBConnector.getItems();
        request.setAttribute("items",items);

        request.getRequestDispatcher("/task_2_1.jsp").forward(request,response);

    }

}
