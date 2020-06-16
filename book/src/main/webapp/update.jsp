<%--
  Created by IntelliJ IDEA.
  User: 25603
  Date: 2020/6/11
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
	<title>修改</title>
</head>
<body>
<form action="update" method="post">
	<div id="adiv">
		<input value="${book.bid}" type="hidden" name="bid">
		<p>书名：<input type="text" name="bname" id="bname" value="${book.bname}"></p>
		<p>价格：<input type="text" name="price" id="price" value="${book.price}"></p>
		<p>类型：<select name="tid" id="tid">
			<c:forEach items="${tlist}" var="t">
				<c:if test="${t.tid==book.tid}">
					<option value="${t.tid}" selected="selected">${t.tname}</option>
				</c:if>
				<c:if test="${t.tid!=book.tid}">
					<option value="${t.tid}">${t.tname}</option>
				</c:if>
			</c:forEach>
		</select></p>
		<input type="submit" value="提交">
	</div>
</form>
</body>
</html>
