<%--
  Created by IntelliJ IDEA.
  User: 25603
  Date: 2020/6/11
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
	<title>图书列表</title>
	<style>
		#bdiv{
			width: 500px;
			height: 600px;
			margin: 0 auto;
		}
	</style>
	<script src="js/jquery-3.3.1.js"></script>
	<script>
		function  del(id) {
			var  cm=confirm("是否删除？");
			if (cm==true){
				$.getJSON("del","id="+id,function (date) {
						if (date=="1"){
						alert("删除成功");
						window.location="list";
						}
				})
			}
		}
		function cx() {
			var bname=$("#bname").val();
			var  tid=$("#tname").val();
			if (tid==0){
				window.location="list?bname="+bname;
			}else {
				window.location = "list?tid=" + tid + "&bname=" + bname;
			}
		}
	</script>
	<script>
		if ("${err_msg}"!=""){
			alert("${err_msg}");
		}
	</script>
</head>
<body>
			<div id="bdiv" >
					<table  border="3" style="text-align: center; border: black solid 1px" cellspacing="0">
						<thead><tr><td colspan="2">图书名：<input type="text" id="bname" name="bname" value="${map.bname[0]}"></td><td colspan="2">图类型：<select id="tname" name="tid">
							<option value="0">默认</option>
						<c:forEach items="${tlist}" var="t">
							<c:if test="${t.tid==map.tid[0]}">
							<option value="${t.tid}" selected="selected">${t.tname}</option>
						</c:if>
							<c:if test="${t.tid!=map.tid[0]}">
							<option value="${t.tid}">${t.tname}</option>
						</c:if>
						</c:forEach>
						</select></td><td><input type="button" value="查询" onclick="cx()"></td></tr></thead>
						<thead><tr><td>&nbsp;ID&nbsp;</td><td>&nbsp;图书名&nbsp;</td><td>&nbsp;图书价格&nbsp;</td><td>&nbsp;图书类型&nbsp;</td><td>&nbsp;操作&nbsp;</td></tr></thead>
						<tbody id="tb">
								<c:forEach  items="${blist}" var="b">
									<tr>
										<td>${b.bid}</td>
										<td>${b.bname}</td>
										<td>${b.price}</td>
										<c:forEach items="${tlist}" var="t">
											<c:if test="${b.tid==t.tid}">
										<td>${t.tname}</td>
										</c:if>
										</c:forEach>
										<td><a href="update?id=${b.bid}&opr=tlist">修改</a>&nbsp;<a href="javascript:del('${b.bid}')">删除</a></td>
									</tr>
								</c:forEach>
								<a href="add?opr=tlist">新增图书信息</a>
						</tbody>
					</table>
			</div>
</body>
</html>
