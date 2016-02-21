<%-- 
    Document   : home
    Created on : Feb 6, 2016, 3:48:08 PM
    Author     : Carlos Igreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:url var="maincss" value="/resources/css/main.css" />
        <link rel="stylesheet" type="text/css" href="${maincss}" />
        <title>title</title>
    </head>
    <body>
        ${msg}
        <div id="header">
            Employee Website
        </div>
        <div id="navigation">
            <ul>
                <li><a class="selected" href="">Add Employee</a></li>
                <li><a href="">Get Employee</a></li>
            </ul>
        </div>
        <div style="text-align: center;">
            <div class="divContainer">
                <div class="divHeader">
                    Add Employee
                    <div class="divBody" >
                        <form>
                            <div style="text-align: center;">
                                <table>
                                    <!-- ID -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">ID:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="number" required>
                                        </td>
                                    </tr>
                                    <!-- First Name -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">First Name:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="text" required>
                                        </td>
                                    </tr>
                                    <!-- Last Name -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">Last Name:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="text" required>
                                        </td>
                                    </tr>
                                    <!-- Address -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">Address:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="text" required>
                                        </td>
                                    </tr>
                                    <!-- City: -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">City:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="text" required>
                                        </td>
                                    </tr>
                                    <!-- State: -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">State:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="text" required>
                                        </td>
                                    </tr>
                                    <!-- Zip: -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">Zip:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="number" required>
                                        </td>
                                    </tr>
                                    <!-- Email: -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">Email:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="email" required>
                                        </td>
                                    </tr>
                                    <!-- Phone# -->
                                    <tr>
                                        <td>
                                            <label class="divBodyLabel">Phone#:</label>
                                        </td>
                                        <td>
                                            <input class="divBodyInput" type="tel" required>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <center>
            <div class="divContainer">
                <div class="divHeader">
                    Get Employee
                    <div class="divBody" >
                        <p>asd fafda sdfa</p>
                    </div>
                </div>
            </div>
        </center>
    </body>
</html>
