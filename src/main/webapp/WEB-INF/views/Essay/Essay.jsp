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
					</tr>
				</thead>
				<tbody >
				<c:forEach items="${pi.list}" var="w">
					<tr>
						<td>
							${w.esyname}
						</td>
						<td>
							${w.userid}
						</td>
						<td>
							${w.esysummary}
						</td>
						<td>
							${w.esytime}
						</td>
						<td>
							${w.esysta}
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>