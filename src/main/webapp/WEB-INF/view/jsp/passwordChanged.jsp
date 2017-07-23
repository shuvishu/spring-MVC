<%--
  Created by IntelliJ IDEA.
  User: hackerfreak
  Date: 22/7/17
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%@include file="index.jsp"
   %>
    <script>
        alert("password has been successfully changed for user"+${username});
    </script>
</body>
</html>
