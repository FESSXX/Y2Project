<%--
  Created by IntelliJ IDEA.
  User: 25603
  Date: 2020/6/10
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <p>省份：<select id="province"></select></p>
  <script src="js/jquery-3.3.1.js"></script>
  <script>
        $(function () {
                $.getJSON("index","",function (date) {
                      for (var  i=0;i<date.length;i++){
                        $("#province").append("<option value="+date[i].id+">"+date[i].name+"</option>")
                      }
                });
        })
  </script>
  </body>
</html>
