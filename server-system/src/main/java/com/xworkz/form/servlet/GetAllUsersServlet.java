package com.xworkz.form.servlet;

import com.xworkz.form.dto.UserDto;
import com.xworkz.form.service.GetAllUsersService;
import com.xworkz.form.service.impl.GetAllUsersServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getAllUsers")
public class GetAllUsersServlet extends HttpServlet {

    GetAllUsersService getAllUsersService;

    public GetAllUsersServlet(){
        getAllUsersService = new GetAllUsersServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDto[] userDtos = getAllUsersService.getAllUsers();
        for (UserDto dto : userDtos) {
            System.out.println(dto);
        }

        req.setAttribute("listOfUsers",userDtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUsers.jsp");
        requestDispatcher.forward(req,resp);
    }
}