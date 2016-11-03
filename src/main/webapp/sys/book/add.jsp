<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新增书籍</title>
    
	<link rel="stylesheet" type="text/css"
			href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>css/theme.css">
		<link rel="stylesheet"
			href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
		<script src="<%=basePath%>jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>

  </head>
  
  <body class="content1">
    <div class="header">
			<h1 class="page-title">
				新增书籍
			</h1>
		</div>

		<ul class="breadcrumb">
			<li>
				<a href="index.html">书籍管理</a>
				<span class="divider">/</span>
			</li>
			<li class="active">
				新增书籍
			</li>
		</ul>

		<div class="container-fluid">
			<div class="row-fluid">
				<form method="post" action="<%=basePath%>sys/book?cmd=add">
					<div class="btn-toolbar">
						<input type="submit" class="btn btn-primary" value="保存 ">
						<a href="<%=basePath%>sys/book?cmd=list" class="btn">取消</a>

					</div>

					<div class="well">
						<div class="tab-pane active in">
							<label>
								封面图片：
							</label>
							<a href="<%=basePath%>upload.jsp">上传</a>
							<!-- <iframe name="upload" height="70px" width="100%" scrolling="auto"
								frameborder="0" src="">

							</iframe> -->
							<input type="hidden" name="bookpic" maxlength="50" value="/upload/${name}">
							<label>
								书籍类型：
							</label>
							<input type="text" name="typeid" maxlength="40">
							<label>
								书名：
							</label>
							<input type="text" name="bookname" maxlength="40">
							<label>
								作者：
							</label>
							<input type="text" name="bookauthor" maxlength="20">
							<label>
								出版社：
							</label>
							<input type="text" name="bookpress" maxlength="20">
							<label>
								出版时间：
							</label>
							<input type="text" name="booktime" maxlength="20">
							<!-- <label>
								角色状态：
							</label>
							<select name="booksta">
								<option value="-1">
									未评审
								</option>
								<option value="1">
									上架
								</option>
							</select> -->
							
							
							<label>
								书籍概述：
							</label>
							<input type="text" name="bookdep" maxlength="500">
							
							
							
							<div style="color: red">
								${msg}
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
  </body>
</html>
