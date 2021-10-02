<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<link href="/resources/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1 style="text-align:center; margin-top:50px"><a href="/main">MAIN</a></h1>

<div id="login-form" class="center-horizontal center-vertical">
  <div class="mb-3">
    <input type="text" class="form-control" id="id" name="userId"placeholder="ID" maxlength="20">
  </div>
  <div class="mb-3">
    <input type="password" class="form-control" id="password" name="userPassword" placeholder="password" maxlength="25">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button onclick="send()" type="submit" class="btn btn-primary">Submit</button>
</div>

<script>

function send(){
	var userId = document.getElementsByName('userId')[0].value;
	var userPassword = document.getElementsByName('userPassword')[0].value;
	var loginDto = {
			//  userId , userPassword  == LoginDTO variable
			userId : userId,
			userPassword : userPassword
	}
	$.ajax({
		url: 'http://localhost:8080/login/process', 
		type:'post', 
		data: JSON.stringify(loginDto),
		dataType: "text",
		contentType: "application/json",
		success : function(result){
			if(result == 0){
				alert("자리수 초과");
			} 
			else if(result == 1){
				alert("아이디 및 비밀번호를 다시 확인해주세요");
			} 
			else {
				window.location.href = "/main";
			}
		},
		error: function(errorThrown){
			alert(errorThrown.statusText);
		},
		
	});
}
</script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="/resources/bootstrap/js/bootstrap.js"></script>
</body>
</html>
