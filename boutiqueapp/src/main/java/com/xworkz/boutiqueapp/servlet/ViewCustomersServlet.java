package com.xworkz.boutiqueapp.servlet;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;
import com.xworkz.boutiqueapp.service.ViewCustomersService;
import com.xworkz.boutiqueapp.service.impl.ViewCustomersServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/viewCustomers")
public class ViewCustomersServlet extends HttpServlet {

    ViewCustomersService viewCustomersService;
    public ViewCustomersServlet(){
        viewCustomersService = new ViewCustomersServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BoutiqueDto[] customers = viewCustomersService.viewCustomers();
        for(BoutiqueDto boutiqueDto :customers){
            System.out.println(boutiqueDto);
        }

        req.setAttribute("customerList",customers);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewCustomers.jsp");
        requestDispatcher.forward(req,resp);
    }
}
