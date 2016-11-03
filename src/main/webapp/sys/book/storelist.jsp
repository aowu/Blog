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
    
    <title>My JSP 'storelist.jsp' starting page</title>
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
		 <div>
		  <c:forEach items="${pager.list}" var="item">
		    <div class="container-fluid">
			<div class="row-fluid">
				<div class="span3">
					<img alt="140x140" src="<%=basePath%>${item.bookpic}" />
				</div>
				<div class="span9">
					<dl>
						<dt>
							书名：${item.bookname}
						</dt>
						<dt>
							作者：${item.bookauthor}
						</dt>
						<dt>
							出版社：${item.bookpress}
						</dt>
						<dt>
							出版时间：${item.booktime}
						</dt>
						<dt>
							书籍概述：
						</dt>
						<dd>
							${item.bookdep}
						</dd>
					</dl>
				</div>
			</div>
		</div>
		</c:forEach>
	</div>
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
