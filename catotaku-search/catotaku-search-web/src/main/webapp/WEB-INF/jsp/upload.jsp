<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>上传测试</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/layui.css">
</head>
<body>
<form method="post" action="uploading" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>
<br/>
<button class="layui-btn layui-btn-radius" id="up">上传索引库</button>
${filepath}
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/layui.js"></script>
<script>
    $(function () {
        $("#up").on('click',function () {
            $.ajax({
                url:"${pageContext.request.contextPath}/uploadindex",
                type:"post",
                data:"",
                datatype:"json",
                success:function(rec){
                    alert(rec);
                    // layui.use(['layer'],function () {
                    //     let layer = layui.layer;
                    //     layer.alert(rec);
                    // });
                }
            });
        });
    });
</script>
</body>
</html>
