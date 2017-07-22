<%--
  Created by IntelliJ IDEA.
  User: hackerfreak
  Date: 20/7/17
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/ResetPassword" method="post">
        <input type="text" name="usernameOrEmail" readonly value="<%=request.getParameter("username")%>">
        <input type="password" name="password" placeholder="New Password">
        <input type="submit" value="Change Password">

    </form>
<div>

</div>
</body>
</html>
