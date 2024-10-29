<%@ page import="java.util.ArrayList" %>
<%@ page import="models.News" %>
<%@ page import="service.DBConnector" %><%--
  Created by IntelliJ IDEA.
  User: Altynaim
  Date: 29.10.2024
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="links.jsp" %>
</head>
<body>
<%@include file="navbar2-3.jsp" %>
<div style="display: flex;flex-direction: column">
    <% String category = request.getParameter("category");
        ArrayList<News> news = (ArrayList<News>) DBConnector.getNewsByCategory(category);
        for (News n : news) {
    %>
    <div class="card" style="
    width:50%;
    margin-top: 10px;
    background-color: azure;
">
        <div class="card-header">
            <%=n.getAuthor()%>
        </div>
        <div class="card-body">
            <h5 class="card-title"><%=n.getTitle()%>
            </h5>
            <p class="card-text"><%=n.getContent()%>
            </p>
        </div>
    </div>
    <%}%>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
