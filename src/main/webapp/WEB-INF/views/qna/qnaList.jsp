<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../layout/bootStrap.jsp"/>
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<c:import url="../layout/nav.jsp" />

	<div class= "container">
	<h1>Q & A Page</h1>
	<div>
		<form id="frm" action="./qnaList">
			<input type ="hidden" id="curPage" value="1" name ="curPage">
			<select name = "kind">
				<option id="kt" value = "kt">Title</option>
				<option id="kc" value = "kc">Contents</option>
				<option id="kw" value = "kw">Writer</option>
			</select>
			
			<input type="text" name = "search" value="${pager.search}">
			<button>검색</button>
		</form>
	</div>

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
			<span id ="${pager.startNum-1}" class ="list">[이전]</span>
			<%-- <a href="./qnaList?curPage=${pager.startNum-1}">[이전]</a> --%>
		</c:if>
		<c:forEach begin="${pager.startNum}" end ="${pager.lastNum}" var="i">
			<span id ="${i}" class ="list">${i}</span>
			<%-- <a href ="./qnaList?curPage=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a> --%>
		</c:forEach>
		<c:if test="${pager.curBlock lt pager.totalBlock }">
			<span id ="${pager.lastNum+1}" class ="list">[다음]</span>
			<%-- <a href ="./qnaList?curPage=${pager.lastNum+1}">[다음]</a> --%>
		</c:if>
	</div>
	
	<script type="text/javascript">
		var kind = '${pager.kind}'
		
		if(kind==''){
			kind ="kt";
		}
		
		$("#"+kind).prop("selected",true);
		$(".list").click(function(){
			$("#curPage").val($(this).attr("id"));
			$("#frm").submit();
		});
		
		
	</script>
	
</body>
</html>