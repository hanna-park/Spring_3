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
	

		
			<div class="container">
			<h1> Notice Write Page</h1>
			<form action="./noticeWrite" method ="post">
		    <div class="form-group">
		      <label for="writer">writer</label>
		      <input type="text" class="form-control" id="writer" value= "writer" name="writer" readonly="readonly">
		    </div>
		    <div class="form-group">
		      <label for="title">title</label>
		      <input type="text" class="form-control" id="title" name="title" >
		    </div>
		    <div class="form-group">
		      <label for="contents">contents</label>
		      <textarea class="form-control" id="contents" name="contents"></textarea>
		    </div>
		    
		    <button type="submit" class= "btn btn-default">확인</button>   
			</form>
		    </div>
	
</body>
</html>