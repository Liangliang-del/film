<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
<title>会员登录</title>
<link rel="stylesheet" href="back/bootstrop/css/bootstrap.min.css" type="text/css" />
<script src="back/bootstrop/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="back/bootstrop/js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="back/bootstrop/css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

.container .row div {
	/* position:relative;
				 float:left; */
	
}

font {
	color: #666;
	font-size: 22px;
	font-weight: normal;
	padding-right: 17px;
}
</style>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	String username = "";
	//String userpwd = "";
	if(null!=cookies){
		for(Cookie c:cookies){
			if("remeberCookie".equals(c.getName())){
				username = c.getValue();
			}
			/* else if("u_pwd".equals(c.getName())){
				userpwd = c.getValue();
			} */
		}
	}
		
%>

	<div class="login-boxtitle">
			<a href="#"><img alt="logo" src="back/bootstrop/img/logobig.png" /></a>
	</div>

	<div class="container"
		style="width: 100%; height: 460px; background: #fd7a72 url(back/bootstrop/img/big.jpg) no-repeat;">
		<div class="row">
			<div class="col-md-7">
				<!--<img src="./image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录">-->
			</div>

			<div class="col-md-5">
				<div
					style="width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 60px; background: #fff;">
					<font>会员登录</font>USER LOGIN
					<div>&nbsp;</div>
					<form class="form-horizontal">
						<div class="form-group">
							<label for="username" class="col-sm-2 control-label" >用户名</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="username" name="email"
									value="<%=username %>" placeholder="请输入用户名/手机/email">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="inputPassword3" name="password"
									placeholder="请输入密码">
							</div>
						</div>
						<div class="form-group">
							<label for="yzm" class="col-sm-2 control-label">验证码</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="yzm"
									placeholder="请输入验证码">
							</div>
							<div class="col-sm-3">
								<img id="imgId" src="checkImgServlet" />
								<a href="javascript:void(0)" onClick="changeImg()">换一张</a>
								<script type="text/javascript">
									function changeImg(){
										$("#imgId").attr("src","checkImgServlet?t="+new Date());
									}
								</script>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label> <input type="checkbox" name="autoLogin" value="autoLogin" ${not empty cookie.cookie_username? "checked='checked'":"" }> 自动登录
									</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label> <input
										type="checkbox" name="remeberme" value="reg" ${not empty cookie.remeberCookie? "checked='checked'":"" }> 记住用户名
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="button" width="100" value="登录" name="submit" id="userLogin"
									style="background: url('back/bootstrop/img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div class="footer">
    	<div class="foot_link">
        	<a href="#">关于我们</a> <span> | </span>
            <a href="#">联系我们</a> <span> | </span>
            <a href="#">招聘广告</a> <span> | </span>
            <a href="#">友情链接</a>
        </div>
    	<p>CopyRight &copy; 2019 衡阳市源辰信息科技有限公司 All Rights Reserverd</p>
        <p>电话：0734-8355998 湘ICP备16015987号</p>
    </div>
</body>
<script type="text/javascript">
	$('#userLogin').click(function(){
		var name = $('input[name="email"]').val();
		var pwd = $('input[name="password"]').val();
		var yzm = $('#yzm').val();
		var autoLogin = $('input[name="autoLogin"]').val();
		var remeber = '';
		
		if($('input[name="remeberme"]').prop('checked')){
			remeber = $('input[name="remeberme"]').val();
		}
		
		
		var regEmail = /^\w+@[a-zA-Z0-9]{2,10}(?:\.[a-z]{2,4}){1,3}$/;
		var regTel = /^1[3-9]\d{9}$/;
		var regName = /^\w{2,8}$/;
		
		if(regEmail.test(name)){
			$.post('member.action',{op:'login',email:name,pwd:pwd,yzm:yzm,autoLogin:autoLogin,remeber:remeber},function(data){
				if(data==1){
					window.location.href='home/home.jsp';
				}else if(2==data){
					$("#imgId").attr("src","checkImgServlet?t="+new Date());
					alert("验证码不正确!!!");
				}
			});
		}else if(regTel.test(name)){
			$.post('member.action',{op:'login',tel:name,pwd:pwd,yzm:yzm,autoLogin:autoLogin,remeber:remeber},function(data){
				if(data==1){
					window.location.href='home/home.jsp';
				}else if(2==data){
					$("#imgId").attr("src","checkImgServlet?t="+new Date());
					alert("验证码不正确!!!");
				}
			});
		}else if(regName.test(name)){
			$.post('member.action',{op:'login',nickname:name,pwd:pwd,yzm:yzm,autoLogin:autoLogin,remeber:remeber},function(data){
				if(data==1){
					window.location.href='home/home.jsp';
				}else if(2==data){
					$("#imgId").attr("src","checkImgServlet?t="+new Date());
					alert("验证码不正确!!!");
				}
			});
		}
	});
</script>
</html>