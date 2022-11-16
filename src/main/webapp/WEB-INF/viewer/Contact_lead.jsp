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
     <h2>List All Contact Leads</h2>
     
     <table>
           <tr>
               <th>FirstName</th>
               <th>LastName</th>
               <th>Email</th>
               <th>Mobile</th>
               <th>Source</th>
               <th>Billing</th>
           </tr>
            <c:forEach var="c" items="${contact}">
                 <tr>
                    <td><a href="findContactById?id=${c.id}">${c.firstName}</a></td>
                    <td>${c.lastName}</td>
                    <td>${c.email}</td>
                    <td>${c.mobile}</td>
                    <td>${c.source}</td>
                    <td><a href="generateBill?id=${c.id}">Generate bill</a></td>
                 </tr>
            </c:forEach>
      </table>
</body>
</html>