<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 23.03.19
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
</head>
<body>

<ul id="navbar">
    <li>
        <a href="<c:url value="/dashboard.jsp"/>">Home</a>
    </li>
    <li>
        <a href="<c:url value="/addPost.jsp"/>">Add post</a>
    </li>
</ul>

<section>
    <header>Blog posts</header>

    <c:forEach var="post" items="${posts}">
        <article>
            <header>
                <h4>${post.getTitle()}</h4>
                Created at: ${post.getCreatedAt()}
            </header>
            <p>
                    ${post.getContent()}
            </p>
            <hr>
        </article>
    </c:forEach>
</section>

</body>
</html>
