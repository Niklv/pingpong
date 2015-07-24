package ru.lvov.controller;

import ru.lvov.service.CounterSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.inject.Inject;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/"})
public class CounterServlet extends HttpServlet {
    @Inject
    private CounterSingleton counter;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        String pongs = counter.ping();
        out.println(pongs);
    }
}
