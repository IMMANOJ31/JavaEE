package com.xworkz.travel.servlet;

import com.xworkz.travel.dto.TravellerDto;
import com.xworkz.travel.repo.TravellerRepo;
import com.xworkz.travel.repo.impl.TravellerRepoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/User")
public class TravellerServlet extends HttpServlet {
    TravellerRepo travellerRepo;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String email = req.getParameter("email");
        String origin = req.getParameter("origin");
        String destination = req.getParameter("destination");

        TravellerDto dto = new TravellerDto();
        dto.setFullName(name);
        dto.setAge(age);
        dto.setGender(gender);
        dto.setEmail(email);
        dto.setOrigin(origin);
        dto.setDestination(destination);

        travellerRepo = new TravellerRepoImpl();
        travellerRepo.saveTravellerDetails(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thanks "+ name +" for showing interest");

    }
}
