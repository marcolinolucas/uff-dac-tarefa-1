<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado soma</title>
    </head>
    <body>
        <jsp:useBean id="calculatorBean" class="calculator.CalculatorBean"/>
        
        <% String x = request.getParameter("x"); %>
        <% String y = request.getParameter("y"); %>
        <jsp:setProperty name="calculatorBean" property="x" value="<%=x%>"/>
        <jsp:setProperty name="calculatorBean" property="y" value="<%=y%>"/>
        <h1>A soma é <jsp:getProperty name="calculatorBean" property="sum"/></h1>
    </body>
</html>
