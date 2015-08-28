<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="static/js/jquery-2.1.3.js"></script>
    <script type="text/javascript" src="static/js/jquery-2.1.3.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Insert title here</title>
    <script type="text/javascript">
        function ajaxTest(){
            $.ajax({
                data:"name="+$("#name").val(),
                type:"GET",
                dataType: 'json',
                url:"login.do",
                error:function(data){
                    alert("出错了！！:"+data.msg);
                },
                success:function(data){
                    for(var i =0;i<data.list.length;i++){
                        $("ul").append("<li>"+data.list[i]+"</li>");
                    }
//                    $("#result1").html(data.msg1) ;
                }
            });
        }
    </script>
</head>
<body>
<input type="text" name="name" id="name"/>
<input type="submit" value="搜索" onclick="ajaxTest();"/>
<div>账号：</div>
<div id="username">
    <ul style="list-style-type: none">
    </ul>
</div>
<%--<div>密码：</div>--%>
<%--<div id="result1"></div>--%>
</body>
</html>
