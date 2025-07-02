package com.xworkz.boutiqueapp.servlet;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;
import com.xworkz.boutiqueapp.service.BoutiqueRegistrationService;
import com.xworkz.boutiqueapp.service.impl.BoutiqueRegistrationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerCustomer")
public class BoutiqueRegistrationServlet extends HttpServlet {

    BoutiqueRegistrationService service;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String password = req.getParameter("password");
        String style = req.getParameter("style");

        BoutiqueDto dto = new BoutiqueDto();
        dto.setFullName(fullName);
        dto.setEmail(email);
        dto.setMobile(mobile);
        dto.setPassword(password);
        dto.setStyle(style);

        service = new BoutiqueRegistrationServiceImpl();
        boolean isValid = service.validateAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write(fullName + "You Have Successfully Registered");


    }
}
