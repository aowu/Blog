<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <base href="<%=basePath%>">
    <base target="main" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
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
	<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<table class="table">
				<thead>
					<tr>
						<th>
							文章名
						</th>
						<th>
							发布者
						</th>
						<th>
							文章概述
						</th>
						<th>
							发布时间
						</th>
						<th>
							文章状态
						</th>
						<th>
							修改属性
						</th>
						<th>
							修改文章
						</th>
						<th>
							删除文章
						</th>
					</tr>
				</thead>
				<tbody >
				<c:forEach items="${pi.list}" var="pi">
					<tr>
						<td>
							${pi.esyname}
						</td>
						<td>
							${pi.userid}
						</td>
						<td>
							${pi.esysummary}
						</td>
						<td>
							${pi.esytime}
						</td>
						<td>
							${pi.esysta}
						</td>
						<td>
							<a href="${userid}/${pi.esyid}/essay/updateessay">编辑</a>
						</td>
						<td>
							<a href="${userid}/${pi.esyid}/essay/updateesyinfo">编辑</a>
						</td>
						<td>
							<a href="">删除</a>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="pagination">
				<div class="page-info">
					<span>当前第${pi.current }页/共${pi.count }条/${pi.total }页</span>
					
					<c:if test="${pi.current gt 1 }">
						<a href="/${userid}/essay?current=1"">首页</a>
						<a href="/${userid}/essay?current=${pi.current - 1 }">上一页</a>
					</c:if>
					
					<c:if test="${pi.current lt pi.total }">
						<a href="/${userid}/essay?current=${pi.current + 1 }">下一页</a>
						<a href="/${userid}/essay?current=${pi.total }">尾页</a>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>
	</div>
</div>

</body>
</html>