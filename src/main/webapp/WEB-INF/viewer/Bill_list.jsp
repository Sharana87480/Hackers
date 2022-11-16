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
               <th>Products</th>
               <th>Amounts</th>
               
               
           </tr>
            <c:forEach var="b" items="${Bills}">
                 <tr>
                    <td><a href="findContactById?id=${b.id}">${b.firstName}</a></td>
                    <td>${b.lastName}</td>
                    <td>${b.email}</td>
                    <td>${b.mobile}</td>
                    <td>${b.source}</td>
                     <td>${b.product}</td>
                      <td>${b.amount}</td>
                    
                 </tr>
            </c:forEach>
      </table>
</body>
</html>