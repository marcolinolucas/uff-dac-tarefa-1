<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da soma</title>
    </head>
    <body>
        <jsp:useBean id="myBean" class="hello.MessageBean"/>
        <h1>SayHello.jsp</h1>
        <% String lang = request.getParameter("lang"); %>
        <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
        <jsp:getProperty name="myBean" property="msg"/>, <%=request.getParameter("nome")%>!
    </body>
</html>
