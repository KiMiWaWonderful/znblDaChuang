<%--
  Created by IntelliJ IDEA.
  User: 57120
  Date: 2018/11/20
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>AddBook</title>
    <%
        pageContext.setAttribute("path", request.getContextPath());
    %>
</head>
<body>
<form action="${path }/topic/addTopic" method="post">

    <fieldset>
        <p>
            <%--@declare id="category"--%><label for="category">Category:</label>
            <%-- <select id="category" value="category.id" items="${ categories}" itemLabel="name" itemValue="id"></select>--%>
            <select name="c_id">
                <c:forEach items="${categories }" var="category">
                    <option  value="${category.id }">${category.category_name }</option>
                </c:forEach>
            </select>
        </p>
        <p>
            <%--@declare id="title"--%><label for="title">Title:</label>
            <input name="title"  type="text" value="${param.title}"></input>
        </p>
        <%--
        <p>
            <label for="author">Author:</label>
            <input name="author"  type="text" value="${param.author}"></input>
        </p>
        --%>
        <p>
            <%--@declare id="content"--%><label for="content">content:</label>
            <input name="content"  type="text" value="${param.content}"></input>
        </p>

        <p id="buttons">
            <input id="reset" type="reset" tabindex="4" ></input>
            <input id="submit" type="submit" tabindex="5"  value="Add Topic"></input>
        </p>
    </fieldset>
</form>
</body>
</html>
