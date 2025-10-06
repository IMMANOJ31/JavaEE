package com.xworkz.amazonapp.servlet;

import com.xworkz.amazonapp.dto.UserDto;
import com.xworkz.amazonapp.service.AmazonService;
import com.xworkz.amazonapp.service.impl.AmazonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class AmazonServlet extends HttpServlet {

    AmazonService amazonService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        Long phoneNumber = Long.valueOf(req.getParameter("phone"));
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");

        UserDto userDto = new UserDto();
        userDto.setFirstName(firstName);
        userDto.setLastName(lastName);
        userDto.setGender(gender);
        userDto.setPhoneNumber(phoneNumber);
        userDto.setEmail(email);

        amazonService = new AmazonServiceImpl();
        amazonService.isUserValid(userDto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thanks "+ firstName +" for registering");

    }
}
