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
  		<h2>QNA Page</h2>
  		<form action="" method= "post">
    	<div class="form-group">
     	 <label for="writer">writer</label>
     	 <input type="text" class="form-control" id="writer" name="writer" readonly value="${dto.writer}">
    	</div>
    	<div class="form-group">
     	 <label for="title">title</label>
      	<input type="text" class="form-control" id="title" name="title" readonly value="${dto.title }">
	    </div>
	    <div class="form-group">
	      <label for="contents">contents</label>
	      <textarea class="form-control" id="contents"readonly>${dto.contents}</textarea>
	    </div>
	    
	    <a href="./qnaReply?num=${dto.num}">답글</a>

	     </form>
		</div>
	    
		
		
</body>
</html>