<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2>답변성공</h2>
<%=request.getParameter("no") %>
<%=request.getParameter("p_no") %>
<%response.sendRedirect("list.do?p_no="+request.getParameter("p_no")); %>


</body>
</html>