package com.xworkz.svit.servlet;

import com.xworkz.svit.dto.StudentDto;
import com.xworkz.svit.service.StudentDetailsService;
import com.xworkz.svit.service.impl.StudentDetailsServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/studentDetails")
public class StudentDetailsServlet extends HttpServlet {

    StudentDetailsService studentDetailsService;

    public StudentDetailsServlet(){
        studentDetailsService = new StudentDetailsServiceImpl();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDto[] dtos = studentDetailsService.fetchAllDetails();

        String userName = null;
        for (StudentDto dto : dtos){
            userName = dto.getFullName();
            break;
        }
        req.setAttribute("uName",userName);
        req.setAttribute("listOfStudents",dtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentDetails.jsp");
        requestDispatcher.forward(req,resp);
    }
}
