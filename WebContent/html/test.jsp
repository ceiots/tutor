<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>login test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="login test">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">
        function login() {
            $.ajax({
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "http://47.107.77.126:8080/tutor/getStudentListService",//url
                data: $('#form1').serialize(),
                success: function (result) {
                	    alert("success:"+result);
                        window.location.href = "success.html";
                },
                error: function () {
                    alert("异常！");
                } 
            });
        }

    </script>
</head>
<body>
<div id="form-div">
    <form id="form1" action="" method="post">
        <p><input type="button" onclick="javascript:login();" value="findStudents"/></p>
    </form>
</div>
</body>
</html>