package com.xworkz.form.servlet;

import com.xworkz.form.dto.UserDto;
import com.xworkz.form.service.RegisterUserService;
import com.xworkz.form.service.impl.RegisterUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet {

    RegisterUserService registerUserService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String firstName = req.getParameter("firstName");

        String lastName = req.getParameter("lastName");

        String gender = req.getParameter("gender");

        String dob = req.getParameter("dob");

        String password = req.getParameter("password");

        String confirmPassword = req.getParameter("confirmPassword");

        UserDto dto = new UserDto();
        dto.setFirstName(firstName);
        dto.setLastName(lastName);
        dto.setGender(gender);
        dto.setDob(dob);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);

        registerUserService = new RegisterUserServiceImpl();
        registerUserService.validateAndSaveUser(dto);

        PrintWriter printWriter =  resp.getWriter();
        printWriter.write("Thank You " +firstName+" "+lastName + " for registeration..." );
    }
}
