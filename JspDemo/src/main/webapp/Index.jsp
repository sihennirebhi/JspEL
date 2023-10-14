<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!--jakarta.servlet.jsp.jstl-api-2.0.0.jar  jakarta.servlet.jsp.jstl-2.0.0 (1).jar--> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%-- <%
		String name = (String) request.getAttribute("label");
		out.println(name);
	
	%> --%>
	
	
	<!-- using EL -->
	<!--${label}-->
	
	<c:out value="label" />
	
	
		
</body>
</html>