<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file = "Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Information</title>
</head>
<body>
       <h2>Lead Information Here...</h2>
    
    Lead Id :${lead.id}<br/>
    First Name: ${lead.firstName}<br/>
    Last Name : ${lead.lastName}<br/>
    Email : ${lead.email}<br/>
    Mobile :${lead.mobile}<br/>
    
    <form action="composeEmail" method="post">
        <input type="hidden" name="email" value="${lead.email}"/>
        <input type="submit" value="Sendemail"/> 
    </form>
    
    <form action="convertLead" method="post">
        <input type="hidden" name="id" value="${lead.id}"/>
        <input type="submit" value="Convert"/> 
    </form>
</body>
</html>