<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 23.03.19
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="addPost" method="post">
    Title: <br>
    <input type="text" name="title"/><br>
    Content:<br>
    <textarea name="content"></textarea>
    <input type="submit" value="Add post">
</form>

</body>
</html>
