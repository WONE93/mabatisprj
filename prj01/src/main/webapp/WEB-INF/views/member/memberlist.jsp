<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>회원목록</h1>
<c:forEach var="vo" items ="${member }">
	아이디: ${vo.id } &nbsp;&nbsp;
	이름 : ${vo.name } &nbsp;&nbsp;
	비밀번호 : ${vo.pwd } &nbsp;&nbsp;
	취미 : ${vo.hobby } &nbsp;&nbsp; <br/>
</c:forEach>
</body>
</html>