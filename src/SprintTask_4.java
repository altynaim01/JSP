import models.Task;
import service.DBConnector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/tasks")
public class SprintTask_4 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        ArrayList<Task> tasks = DBConnector.getAllTasks();
        request.setAttribute("tasks", tasks);

        request.getRequestDispatcher("/tasks.jsp").forward(request,response);
    }

    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        int taskId = Integer.parseInt(request.getParameter("taskId"));
        DBConnector.deleteTask(taskId);

        response.sendRedirect("/tasks");
    }
}
