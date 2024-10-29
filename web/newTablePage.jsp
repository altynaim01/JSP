<%@ page import="service.DBConnector" %>
<%@ page import="models.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <%@include file="links.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div style="display: flex;flex-direction: column;width: 30%;margin-left: 35%">
  <%
    String id = request.getParameter("id");
    Item item = DBConnector.getItemById(Integer.parseInt(id));

  %>
  <label>Name:</label>
  <p><%= item.getName() %></p>
  <label>Price:</label>
  <p><%= item.getPrice() %></p>
  <label>Amount:</label>
  <p><%= item.getAmount() %></p>
</div>
</body>
</html>
