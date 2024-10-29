<%@ page import="java.util.ArrayList" %>
<%@ page import="models.Task" %><%--
  Created by IntelliJ IDEA.
  User: Altynaim
  Date: 29.10.2024
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="links.jsp" %>
</head>
<body>
<%@include file="navbar_sprint.jsp" %>
<button style="background-color:  #0a53be;color: white;width: max-content;border: 1px solid black;margin-left: 5px;"
        data-bs-toggle="modal"
        data-bs-target="#addTaskModal">+
    Add task
</button>
<table class="table table-hover" style="margin-top: 5px">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Description</th>
        <th scope="col">Deadline Date</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <%
        ArrayList<Task> tasks = (ArrayList<Task>) request.getAttribute("tasks");
        for (Task t : tasks) {
    %>
    <tr>
        <th scope="row"><%=t.getId()%>
        </th>
        <td><%=t.getName()%>
        </td>
        <td><%=t.getDescription()%>
        </td>
        <td><%=t.getDeadlineDate()%>
        </td>
        <td>
            <form action="/tasks" method="post" style="display: inline;">
                <input type="hidden" name="taskId" value="<%= t.getId() %>"/>
                <button type="submit" class="btn btn-danger">Delete</button>
            </form>
        </td>
    </tr>
    <%}%>
    </tbody>
</table>


<div class="modal fade" id="addTaskModal" tabindex="-1" aria-labelledby="addTaskModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="addTaskModalLabel">Add New Task</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form id="addTaskForm" method="post" action="/tasks-add">
                    <div class="mb-3">
                        <label class="form-label">Task Name</label>
                        <input type="text" class="form-control" name="name" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Description</label>
                        <textarea class="form-control" name="description" rows="3" required></textarea>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Deadline</label>
                        <input type="date" class="form-control" name="deadlineDate" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Save Task</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
