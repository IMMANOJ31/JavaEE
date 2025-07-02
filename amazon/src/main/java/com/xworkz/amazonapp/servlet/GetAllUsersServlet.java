package com.xworkz.amazonapp.servlet;

import com.xworkz.amazonapp.dto.UserDto;
import com.xworkz.amazonapp.service.GetAllUsersService;
import com.xworkz.amazonapp.service.impl.GetAllUsersServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userDetails")
public class GetAllUsersServlet extends HttpServlet {
    GetAllUsersService getAllUsersService;

    public GetAllUsersServlet(){
            getAllUsersService = new GetAllUsersServiceImpl();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDto[] dtos =getAllUsersService.getAllUser();

        for (UserDto dto : dtos){
            System.out.println(dto);
        }
        req.setAttribute("listOfUsers",dtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("userDetails.jsp");
        requestDispatcher.forward(req,resp);
    }
}
