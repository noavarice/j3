package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.function.Consumer;

import static java.nio.file.Files.lines;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException,
            IOException
    {
        final PrintWriter writer = resp.getWriter();
        lines(Paths.get("/home/alexrazinkov/Projects/Java/servlet_file")).forEach(new Consumer<String>() {
            public void accept(String s) {
                writer.write(s);
            }
        });
    }
}
