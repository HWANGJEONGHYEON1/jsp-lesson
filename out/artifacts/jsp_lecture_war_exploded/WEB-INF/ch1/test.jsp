<%--
  Created by IntelliJ IDEA.
  User: we
  Date: 2022/01/24
  Time: 11:47 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>서블릿 테스트하기</h2>
<!-- submit시 servletBlog1 서블릿 페이지로 정보를 전송한다. -->
<!-- 전송 방식을 설정하지 않으면 기본 GET방식으로 작동한다. -->
<form action="servletBlog1">
    <p>이름 입력 후 버튼을 눌러 서블릿 페이지로 이름 전송</p>
    <input type="text" name="name">
    <input type="submit" value="버튼">
</form>
</body>
</html>
