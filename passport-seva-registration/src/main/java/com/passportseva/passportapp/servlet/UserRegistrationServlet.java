package com.passportseva.passportapp.servlet;

import com.passportseva.passportapp.dto.UserRegistrationDto;
import com.passportseva.passportapp.service.UserRegistrationService;
import com.passportseva.passportapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userRegistration")
public class UserRegistrationServlet extends HttpServlet {

        UserRegistrationService userRegistrationService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String passportOffice = req.getParameter("passportOffice");
        String givenName = req.getParameter("givenName");
        String surname = req.getParameter("surname");
        String dob = req.getParameter("dob");
        String email = req.getParameter("email");
        String loginId = req.getParameter("loginId");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");


        UserRegistrationDto dto = new UserRegistrationDto();
        dto.setPassportOffice(passportOffice);
        dto.setGivenName(givenName);
        dto.setSurname(surname);
        dto.setDob(dob);
        dto.setEmail(email);
        dto.setLoginId(loginId);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);




        userRegistrationService= new UserRegistrationServiceImpl();
        boolean isValid = userRegistrationService.validateAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you "+ givenName + " for Registering");


    }
}
