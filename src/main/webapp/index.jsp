<html>
<body>

<%--<jsp:forward page="/dashboard"/>--%>

<%
    String dashboard = "http://localhost:8080/dashboard";
    response.sendRedirect(dashboard);
%>

</body>
</html>
