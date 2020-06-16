<%--
  Created by IntelliJ IDEA.
  User: 25603
  Date: 2020/6/11
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
	<title>新增书籍</title>
</head>
<body>
<form action="add" method="post"enctype="">
			<div id="adiv">
				<p>书名：<input type="text" name="bname" id="bname"></p>
				<p>价格：<input type="text" name="price" id="price"></p>
					<p>类型：<select name="tid" id="tid">
						<c:forEach items="${tlist}" var="t">
								<option value="${t.tid}">${t.tname}</option>
						</c:forEach>
					</select></p>
				<input type="submit" value="提交">
			</div>
</form>
</body>
</html>
