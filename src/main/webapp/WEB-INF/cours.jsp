<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste de cours</title>
</head>
<body>
	<h1>Liste de cours</h1>
	<ul>
	<c:forEach items="${listeCours }" var="current">
		<li>${current.titre }</li>
	</c:forEach>
	</ul>
	
	<form method="POST" action="cours">
		<input type="text" name="libelle" placeholder="libellé du cours..." />
		<input type="submit" value="Ajouter"/>
	</form>
</body>
</html>