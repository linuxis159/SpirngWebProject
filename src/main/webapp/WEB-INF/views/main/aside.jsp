<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List " %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<aside id="aside-line" class="col-2">

	


<table class="table">

  <thead>
    <tr>
      <th scope="col">게시판</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${boardList}">
    <tr>
      <td><a href="/board/list?boardId=${item.getBoardIdNum()}&page=1&sort=1">${item.getBoardName()}</a></td>
    </tr>
  </c:forEach>

    
  </tbody>
</table>
</aside>