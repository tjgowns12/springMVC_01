<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>result.jsp<br>
<h1>객체로 넘어온 값</h1>
name:${mem.name }<br>
age:${mem.getAge() }<br><!-- getAge()나 age나 무엇을 써도 상관없다-->
addr:${mem.addr }<br>

</body>
</html>