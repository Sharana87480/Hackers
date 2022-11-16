<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Leads</title>
</head>
<body>
<a href="viewCreateLeadPage">Create new Lead</a>
     <h2>List All Leads</h2>
     
     <table>
           <tr>
               <th>FirstName</th>
               <th>LastName</th>
               <th>Email</th>
               <th>Mobile</th>
               <th>Source</th>
               
           </tr>
            <c:forEach var="l" items="${leads}">
                 <tr>
                    <td> <a href="findLeadById?id=${l.id}">${l.firstName}</a></td>
                    <td>${l.lastName}</td>
                    <td>${l.email}</td>
                    <td>${l.mobile}</td>
                    <td>${l.source}</td>
                 </tr>
            </c:forEach>
      </table>
</body>
</html>