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
    
    <title>编辑系统功能</title>
    
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
				编辑系统功能
			</h1>
		</div>

		<ul class="breadcrumb">
			<li>
				<a href="index.html">系统功能管理</a>
				<span class="divider">/</span>
			</li>
			<li class="active">
				编辑系统功能
			</li>
		</ul>

		<div class="container-fluid">
			<div class="row-fluid">
				<form method="post" action="<%=basePath%>sys/fun?cmd=edit">
					<div class="btn-toolbar">
						<input type="submit" class="btn btn-primary" value="保存 ">
						<a href="<%=basePath%>sys/fun?cmd=list" class="btn">取消</a>

					</div>

					<div class="well">
						<div class="tab-pane active in">
							<label>
								父功能名称：
							</label>
							<input type="hidden" name="funid" value="${item.funid}" />
							<input type="hidden" name="funpid" value="${item.funpid}" />
							<input type="text" name="funpname" value="${item.funpname}"
								readonly="readonly">
							<label>
								功能名称：
							</label>
							<input type="text" name="funname" maxlength="10"
								value="${item.funname}">
							<label>
								功能地址：
							</label>
							<input type="text" name="funurl" value="${item.funurl}"
								maxlength="100">
							<label>
								功能状态：
							</label>
							<select name="funstate">
								<c:choose>
									<c:when test="${item.funstate==\"1\"}">
									<option value="1" selected="selected">正常</option>
									<option value="0">锁定</option>		
									</c:when>
									<c:otherwise>
									<option value="1">正常</option>
									<option value="0" selected="selected">锁定</option>	
									</c:otherwise>
								</c:choose>
								
							</select>
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
