package com.xworkz.svit.servlet;

import com.xworkz.svit.dto.StudentDto;
import com.xworkz.svit.service.StudentService;
import com.xworkz.svit.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class StudentRegisterServlet extends HttpServlet {
   StudentService studentService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fullname");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String course = req.getParameter("course");
        String dob = req.getParameter("dob");
        String address = req.getParameter("address");

        StudentDto studentDto = new StudentDto();
        studentDto.setFullName(name);
        studentDto.setEmailId(email);
        studentDto.setPhoneNumber(phone);
        studentDto.setCourse(course);
        studentDto.setDob(dob);
        studentDto.setAddress(address);

        studentService = new StudentServiceImpl();
        studentService.isStudentValid(studentDto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thanks "+name+" for registering");
    }
}
