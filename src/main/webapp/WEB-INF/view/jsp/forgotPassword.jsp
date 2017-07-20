<%--
  Created by IntelliJ IDEA.
  User: hackerfreak
  Date: 20/7/17
  Time: 1:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <div class="container-fluid" id="main-wrapper">
        <div class="row">
            <div class="col-lg-3"></div>
            <div class="col-lg-6">


                <form action="/validateAndSendmail" method="post">
                    <input type="text" name="username" id="uname" placeholder="Enter your username or Email">
                    <input type="submit" name="submit">
                </form>

            </div>
            <div class="col-lg-3"></div>
        </div>
    </div>
</body>
</html>
