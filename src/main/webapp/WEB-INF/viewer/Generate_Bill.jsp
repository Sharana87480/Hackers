<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file = "Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead page</title>
</head>
<body>
      <h2>Enter The Bill Details Here.... </h2>
        <form action="saveBill" method="post">
            <pre>
                FirstName<input type="text" name="firstName" value="${c.firstName}"/>
                LastName<input type="text" name="lastName" value="${c.lastName}"/>
                Email<input type="email" name="email" value="${c.email}"/>
                Mobile<input type="number" name="mobile" value="${c.mobile}"/>
                Product<input type="text" name="product"/>
                Amount <input type="text" name="amount"/>
                
                       <input type="submit" value="generate Bill"/>
            </pre>
        </form>
</body>
</html>