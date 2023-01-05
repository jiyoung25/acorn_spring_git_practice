<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/webapp/WEB-INF/home.jsp</title>
</head>
<body>
	<div class="container">
		<h1>HOME</h1>
		<h3>공지사항</h3>
		<ul>
			<c:forEach var="tmp" items="${noticeList }">
				<li>${tmp }</li>
			</c:forEach>
		</ul>
		<h3> 진현승입니다 </h3>
		<h3> 권도희 입니다</h3>
		<h3> 신우철 입니다.</h3>
		<h3> 이지영입니다.</h3>
	</div>
</body>
</html>