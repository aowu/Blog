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
    
    <title>书籍列表</title>
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
				书籍列表
			</h1>
		</div>
		<ul class="breadcrumb">
			<li>
				<a href="index.html">Home</a>
				<span class="divider">/</span>
			</li>
			<li class="active">
				书籍列表
			</li>
		</ul>
		<div class="container-fluid">
			<div class="row-fluid">
				<form class="form-inline" method="post"
					action="<%=basePath%>sys/book?cmd=list">
					<input class="input-xlarge" placeholder="书籍名称..." name="sname"
						type="text" value="${param.sname}">
					<input class="btn icon-search" type="submit" value="查询" />
					
				</form>

				<div class="well">
					<table class="table">
						<thead>
							<tr>
								<th>
									书名
								</th>
								<th>
									作者
								</th>
								<th>
									出版社
								</th>
								<th>
									出版时间
								</th>
								<th>
									书籍状态
								</th>
								<th>
									书籍图片
								</th>
								<th>
									书籍简介
								</th>
								
								<th style="width: 90px;">
									购买
								</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pager.list}" var="item">
							<c:if test="${item.booksta>\"-1\"}">
								<tr>
									<td>
										${item.bookname}
									</td>
									<td>
										${item.bookauthor}
									</td>
									<td>
										${item.bookpress}
									</td>
									<td>
										${item.booktime }
									</td>
									<td>
										<c:choose>
											<c:when test="${item.booksta==\"1\"}">
												上架		
											</c:when>
											<c:when test="${item.booksta==\"2\"}">
												热卖
											</c:when>
											<c:when test="${item.booksta==\"-1\"}">
												未评审
											</c:when>
											<c:when test="${item.booksta==\"-2\"}">
												评审未通过
											</c:when>
											<c:otherwise>锁定</c:otherwise>
										</c:choose>
									</td>
									<td>
										${item.bookpic}
									</td>
									<td>
										${item.bookdep}
									</td>
									
									<td>
										<a href="#">购买还没写好</a>
										&ensp;
								</tr>
								</c:if>
							</c:forEach>
						</tbody>
					</table>
					<div class="pagination pagination-right">
						<ul>
							<li>
								<a>共计：${pager.pagectrl.pagecount}页/${pager.pagectrl.rscount}条记录</a>
							</li>

							<li>
								<c:if test="${pager.pagectrl.currentindex==1}" var="fp">
									<a style="disabled: true">上一页</a>
								</c:if>
								<c:if test="${!fp}">
									<a
										href="<%=basePath%>sys/fun?cmd=list&index=${pager.pagectrl.currentindex-1}">上一页</a>
								</c:if>
							</li>

							<c:forEach begin="${pager.pagectrl.minpage}" step="1"
								end="${pager.pagectrl.maxpage}" var="index">
								<li>
									<c:if test="${pager.pagectrl.currentindex==index}" var="t">
										<a style="color: red; background-color: #bbb">${index}</a>
									</c:if>
									<c:if test="${!t}">
										<a href="<%=basePath%>sys/fun?cmd=list&index=${index}">${index}</a>
									</c:if>
								</li>
							</c:forEach>

							<li>
								<c:if
									test="${pager.pagectrl.currentindex==pager.pagectrl.pagecount}"
									var="fp">
									<a style="disabled: true">下一页</a>
								</c:if>
								<c:if test="${!fp}">
									<a
										href="<%=basePath%>sys/fun?cmd=list&index=${pager.pagectrl.currentindex+1}">下一页</a>
								</c:if>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
  </body>
</html>
