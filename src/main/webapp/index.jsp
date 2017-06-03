<%@ page import="java.nio.file.Files" %>
<%@ page import="java.nio.file.Paths" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.util.function.Consumer" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    private static String getText() throws
            IOException
    {
        final StringBuilder b = new StringBuilder();
        Files.lines(Paths.get("/home/alexrazinkov/Projects/Java/jsp_file")).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                b.append(s);
            }
        });
        return b.toString();
    }
%>

<html>
    <body>
        <%= getText() %>
        <br>
        <a href="servlet">Click here to see servlet</a>
    </body>
</html>
