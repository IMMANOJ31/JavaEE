package com.passportseva.passportapp.servlet;

import com.passportseva.passportapp.dto.UserRegistrationDto;
import com.passportseva.passportapp.service.GetAllUsersService;
import com.passportseva.passportapp.service.impl.GetAllUsersServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getUsers")
public class GetAllUsersServlet extends HttpServlet {

    GetAllUsersService getAllUsersService;

    public GetAllUsersServlet(){
        getAllUsersService = new GetAllUsersServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserRegistrationDto[] userDtos = getAllUsersService.getAllUsers();
        for (UserRegistrationDto dto : userDtos) {
            System.out.println(dto);
        }

        req.setAttribute("listOfUsers",userDtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUsers.jsp");
        requestDispatcher.forward(req,resp);
    }
}


