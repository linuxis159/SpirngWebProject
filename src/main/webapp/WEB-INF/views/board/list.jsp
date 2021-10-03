<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<style>
	#a${pDto.getPage()}{
		color:red;
	
	}
</style>

<div class="col-8">
<table class="table" >

  <thead>
    <tr>
      <th scope="col">postId</th>
      <th scope="col">title</th>
      <th scope="col">ragDate</th>
      <th scope="col">view</th>
      <th scope="col">like</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${postList}">
    <tr>
      <td>${item.getPostIdNum()}</td>
      <td><a href="/board/view?postId=${item.getPostIdNum()}">${item.getPostTitle()}</a></td>
      <td>${item.getPostRagDate()}</td>
      <td>${item.getPostView()}</td>
      <td>${item.getLikePost()}</td>
<%--       <td>${status.count}</td> --%>
    </tr>

    
    </c:forEach>

  </tbody>
</table>
<div style="text-align : center">
	<c:choose>
		<c:when test="${pDto.getPage() > 1}">
			<button type="button" onClick="location.href='/board/list?boardId=${pDto.getBoardIdNum()}&page=${pDto.getPage()-1}&'+document.location.href.split('&')[2]"><<</button>
		</c:when>
		<c:when test="${pDto.getPage() <= 1 }">
			<button type="button">처음</button>
		</c:when>
	</c:choose>
  	<c:forEach var="i" begin="${pDto.getStartPage()}" end="${pDto.getEndPage()}">
    	<a id="a${i}" href="/board/list?boardId=${pDto.getBoardIdNum()}&page=${i}&sort=${pDto.getSort()}"><c:out value="${i}"></c:out></a>
  	</c:forEach>
  	<c:choose>
  		<c:when test="${pDto.getPage() < pDto.getMaxPage()}">
			<button type="button" value="다음" onClick="location.href='/board/list?boardId=${pDto.getBoardIdNum()}&page=${pDto.getPage()+1}&'+document.location.href.split('&')[2]">>></button>
		</c:when>
		<c:when test="${pDto.getPage() >= pDto.getMaxPage()}">
			<button type="button">마지막</button>
		</c:when>
		
	</c:choose>
</div>		
	

<div></div>
	<a class="sort" href="?boardId=${pDto.getBoardIdNum()}&page=1&sort=1">최신</a>
	<a class="sort" href="?boardId=${pDto.getBoardIdNum()}&page=1&sort=2">조회수</a>
	<a class="sort" href="?boardId=${pDto.getBoardIdNum()}&page=1&sort=3">추천수</a>
</div>


<script>

/* 	para = document.location.href.split("&");
	for(var i = 1; i<4; i++){
		url = para[0]+'&'+para[1]+'&'+'sort='+i;
		console.log(url);
		sortUrlSetting = document.getElementsByClassName("sort");
		sortUrlSetting[i-1].href = url;
	} */

</script> 