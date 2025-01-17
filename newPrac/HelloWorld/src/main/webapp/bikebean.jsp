<%@ page import="beans.BikeBean" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="bike" class="beans.BikeBean" scope="page"/>

<html>
<head>
    <title>Bike Details</title>
</head>
<body>
    <h2>Bike Details</h2>
    
    <jsp:setProperty name="bike" property="model" value="Model XYZ" />
    <jsp:setProperty name="bike" property="makeYear" value="2023" />
    <jsp:setProperty name="bike" property="price" value="2500.00" />
    
    <table border="1">
        <tr>
            <th>Model</th>
            <td><jsp:getProperty name="bike" property="model" /></td>
        </tr>
        <tr>
            <th>Make Year</th>
            <td><jsp:getProperty name="bike" property="makeYear" /></td>
        </tr>
        <tr>
            <th>Price</th>
            <td>$ <jsp:getProperty name="bike" property="price" /></td>
        </tr>
    </table>
    
</body>
</html>
