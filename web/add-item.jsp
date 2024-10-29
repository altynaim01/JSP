
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <%@include file="links.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<form style="display: flex;flex-direction: column;width: 30%;margin-left: 35%" method="post" action="/add-item">
  <label>Name:</label>
  <input type="text" name="name">
  <label>Price:</label>
  <input type="number" name="price">
  <label>Amount:</label>
  <input type="number" name="amount"><br>
  <button>Add Item</button>
</form>
</body>
</html>
