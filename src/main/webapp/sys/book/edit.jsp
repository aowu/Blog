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
    
    <title>编辑书籍</title>
    
	<link rel="stylesheet" type="text/css"
			href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>css/theme.css">
		<link rel="stylesheet"
			href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
		<script src="<%=basePath%>jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>

  </head>
  
  <body>
    <div class="header">
			<h1 class="page-title">
				编辑书籍
			</h1>
		</div>

		<ul class="breadcrumb">
			<li>
				<a href="index.html">书籍管理</a>
				<span class="divider">/</span>
			</li>
			<li class="active">
				编辑书籍
			</li>
		</ul>

		<div class="container-fluid">
			<div class="row-fluid">
				<form method="post" action="<%=basePath%>sys/book?cmd=edit">
					<div class="btn-toolbar">
						<input type="submit" class="btn btn-primary" value="保存 ">
						<a href="<%=basePath%>sys/book?cmd=list" class="btn">取消</a>

					</div>

					<div class="well">
						<div class="tab-pane active in">
							<label>
								类型：
							</label>
							<input type="hidden" name="bookid" value="${item.bookid}" />
							<input type="text" name="typeid" value="${item.typeid}"
								readonly="readonly">
							<label>
								书名：
							</label>
							<input type="text" name="bookname" maxlength="30"
								value="${item.bookname}">
							<label>
								作者：
							</label>
							<input type="text" name="bookauthor" value="${item.bookauthor}"
								maxlength="10">
							<label>
								出版社：
							</label>
							<input type="text" name="bookpress" value="${item.bookpress}"
								maxlength="20">
							<label>
								出版时间：
							</label>
							<input type="text" name="booktime" value="${item.booktime}"
								maxlength="10">	
							<label>
								功能状态：
							</label>
							<select name="booksta">
								<c:choose>
									<c:when test="${item.booksta==\"-1\"}">
									<option value="-1" selected="selected">未评审</option>
									<option value="-2">未通过</option>
									<option value="1">上架</option>	
									<option value="-2">热卖</option>	
									</c:when>
									<c:when test="${item.booksta==\"-2\"}">
									<option value="-2" selected="selected">未通过</option>
									<option value="-1">未评审</option>
									<option value="1">上架</option>	
									<option value="2">热卖</option>	
									</c:when>
									<c:when test="${item.booksta==\"1\"}">
									<option value="1" selected="selected">上架</option>
									<option value="-2">未通过</option>
									<option value="-1">未评审</option>	
									<option value="-2">热卖</option>	
									</c:when>
									<c:when test="${item.booksta==\"2\"}">
									<option value="2" selected="selected">热卖</option>
									<option value="-2">未通过</option>
									<option value="1">上架</option>	
									<option value="-1">未评审</option>	
									</c:when>
									<c:otherwise>
									<option value="0" selected="selected">锁定</option>
									<option value="-1">未评审</option>
									<option value="-2">未通过</option>
									<option value="1">上架</option>	
									<option value="2">热卖</option>	
									</c:otherwise>
								</c:choose>
								
							</select>
							<label>
								封面图片：
							</label>
							
							<input type="text" name="bookpic" value="${item.bookpic}"
								maxlength="100">
							<label>
								书籍概述：
							</label>
							<input type="text" name="bookdep" value="${item.bookdep}"
								maxlength="1000">
							<label>
								评审人：
							</label>
							<input type="text" name="bookaudit" value="${item.bookaudit}"
								maxlength="10">
							<label>
								评审说明：
							</label>
							<input type="text" name="auditinfo" value="${item.auditinfo}"
								maxlength="1000">
							
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
