package com.taskmanager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateTaskServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String taskTitle = request.getParameter("taskTitle");
        String taskDescription = request.getParameter("taskDescription");
        String dueDate = request.getParameter("dueDate");
        String priority = request.getParameter("priority");

        if(taskTitle == null || taskDescription == null || dueDate == null || priority == null || 
           taskTitle.isEmpty() || taskDescription.isEmpty() || dueDate.isEmpty() || priority.isEmpty()) {
            response.sendRedirect("error.jsp");
        } else {
            // Here you would typically save the task to a database
            // For simplicity, we'll just redirect to the success page
            response.sendRedirect("success.jsp");
        }
    }
}
