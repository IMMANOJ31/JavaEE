package com.xworkz.travel.servlet;

import com.xworkz.travel.dto.TravellerDto;
import com.xworkz.travel.service.TravellerDetailsService;
import com.xworkz.travel.service.impl.TravellerDetailsServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class TravellerDetailsServlet extends HttpServlet {
    TravellerDetailsService travellerDetailsService;

    public TravellerDetailsServlet(){
        travellerDetailsService = new TravellerDetailsServiceImpl();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TravellerDto[] travellerDtos = travellerDetailsService.getTravellerDetails();

        req.setAttribute("listOfTravellers",travellerDtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("users.jsp");
        requestDispatcher.forward(req,resp);
    }
}
