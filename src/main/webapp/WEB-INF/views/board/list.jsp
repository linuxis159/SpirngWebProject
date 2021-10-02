<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List " %>
<%@ page import="com.community.japanese.vo.Post" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<div class="col-8">
<table class="table" >

  <thead>
    <tr>
      <th scope="col">title</th>
      <th scope="col">ID</th>
      <th scope="col">view</th>
      <th scope="col">created</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${postList}">
    <tr>
      <td>${item.getPostIdNum()}</td>
      <td><a href="/board/view?postId=${item.getPostIdNum()}">${item.getPostTitle()}</a></td>
      <td>${item.getPostRagDate()}</td>
      <td>${item.getPostView()}</td>
<%--       <td>${status.count}</td> --%>
    </tr>
    </c:forEach>

  </tbody>
</table>
</div>