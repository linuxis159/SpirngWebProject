<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/resources/css/style.css" rel="stylesheet" type="text/css">
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>

<tiles:insertAttribute name="header"/>

<div class="container">
  <div class="row">
  	<tiles:insertAttribute name="aside"/>
	<tiles:insertAttribute name="article"/>	
  </div>
</div>








<script src="/resources/bootstrap/js/bootstrap.js"></script> 
</body>
</html>