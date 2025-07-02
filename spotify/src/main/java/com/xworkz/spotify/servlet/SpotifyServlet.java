package com.xworkz.spotify.servlet;

import com.xworkz.spotify.dto.UserDto;
import com.xworkz.spotify.service.SpotifyService;
import com.xworkz.spotify.service.impl.SpotifyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userRegister")
public class SpotifyServlet extends HttpServlet {

    SpotifyService spotifyService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("pass");
        String cPassword = req.getParameter("cpass");

        UserDto userDto = new UserDto();
        userDto.setFullName(name);
        userDto.setEmail(email);
        userDto.setPassword(password);
        userDto.setConfirmPassword(cPassword);

        spotifyService = new SpotifyServiceImpl();
        spotifyService.userValid(userDto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thanks "+name+" for registering");

    }
}
