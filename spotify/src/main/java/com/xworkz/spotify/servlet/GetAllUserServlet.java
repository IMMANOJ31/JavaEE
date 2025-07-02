package com.xworkz.spotify.servlet;

import com.xworkz.spotify.dto.UserDto;
import com.xworkz.spotify.service.SpotifyUsers;
import com.xworkz.spotify.service.impl.SpotifyUsersImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getAllUsers")
public class GetAllUserServlet extends HttpServlet {
    SpotifyUsers spotifyUsers;

    public GetAllUserServlet(){
        spotifyUsers = new SpotifyUsersImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDto[] dtos = spotifyUsers.getAllUsersDetails();

        for (UserDto dto : dtos){
            System.out.println(dto);
        }
        req.setAttribute("ListOfUsers",dtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUsers.jsp");
        requestDispatcher.forward(req,resp);
    }
}
