<%@ page import="models.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <%@include file="links.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

<div>
    <table class="table table-success table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Amount</th>
        </tr>
        </thead>
        <tbody>

        <%
            ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("items");
            if (items != null) {
                for (Item item : items) {
        %>
        <tr onclick="window.location.href='newTablePage.jsp?id=<%= item.getId() %>';">
            <th scope="row"><%= item.getId() %></th>
            <td><%= item.getName() %></td>
            <td><%= item.getPrice() %></td>
            <td><%= item.getAmount() %></td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="4">No items found.</td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
