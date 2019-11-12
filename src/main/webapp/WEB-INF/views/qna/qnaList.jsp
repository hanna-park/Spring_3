<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../layout/bootStrap.jsp"/>
<title>Insert title here</title>
</head>
<body>
<c:import url="../layout/nav.jsp" />

	<div class= "container">
	<h1>Q & A Page</h1>
	<table class="table">
		<tr>
			<td>num</td>
			<td>title</td>
			<td>writer</td>
			<td>date</td>
			<td>hit</td>

		</tr>
		<c:forEach items ="${list}" var = "dto">
		<tr>
			<td>${dto.num}</td>
			<td><a href="./qnaSelect?num=${dto.title}">${dto.title}</a></td>
			<td>${dto.writer}</td>
			<td>${dto.reg_date}</td>
			<td>${dto.hit}</td>	
		</tr>
		</c:forEach>
	</table>
		<c:if test ="${pager.curBlock gt 1}">
			<a href="./qnaList?curPage=${pager.startNum-1}">[이전]</a>
		</c:if>
		<c:forEach begin="${pager.startNum}" end ="${pager.lastNum}" var="i">
			<a href ="./qnaList?curPage=${i}">${i}</a>
		</c:forEach>
		<c:if test="${pager.curBlock lt pager.totalBlock }">
			<a href ="./qnaList?curPage=${pager.lastNum+1}">[다음]</a>
		</c:if>
	</div>
	
	
</body>
</html>