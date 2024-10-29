import models.Item;
import service.DBConnector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-item")
public class AddItem extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.sendRedirect("/add-item.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        int amount = Integer.parseInt(request.getParameter("amount"));

        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        item.setAmount(amount);

        DBConnector.addItem(item);

        response.sendRedirect("/task-2-1");
    }
}
