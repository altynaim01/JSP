import models.Task;
import service.DBConnector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tasks-add")
public class TaskAdder extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        Task task = new Task();
        task.setName(request.getParameter("name"));
        task.setDescription(request.getParameter("description"));
        task.setDeadlineDate(request.getParameter("deadlineDate"));

        DBConnector.addTask(task);
        response.sendRedirect("/tasks");
    }
}
