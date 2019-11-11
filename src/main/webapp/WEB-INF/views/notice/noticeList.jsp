<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../layout/bootStrap.jsp"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="../layout/nav.jsp" />
	<div class= "container">
	<h1>Notice List Page</h1>
	<table class="table">
	<thead>
	<tr>
		<td>num</td>
		<td>title</td>
		<td>writer</td>
		<td>contents</td>
		<td>date</td>
		<td>hit</td>
	</tr>
	</thead>
	<c:forEach items="${list}" var="dto">
	<tr>
		<td>${dto.num}</td>
		<td><a href="noticeSelect?num=${dto.num}">${dto.title }</a></td>
		<td>${dto.writer}</td>
		<td>${dto.contents }</td>
		<td>${dto.reg_date }</td>
		<td>${dto.hit}</td>
	</tr>
	</c:forEach>
	</table>
	
	<a href = "./noticeWrite">Write</a>
	
	<div>
		<ul class="pagination">
		<c:forEach begin ="1" end="${totalPage}" var = "i">
			  <li><a href="./noticeList?curPage=${i}">${i}</a></li>
		</c:forEach>
		</ul>
	
	</div>
	
	</div>
</body>
</html>