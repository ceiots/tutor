<!DOCTYPE input PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head></head>
<body>
<input type="file" id="myImage" name="myImage"/>  
<script type="text/javascript">  
    $("#myImage").bind("change",function(){
        uploadFile($(this));
    });

    //通过onChange直接获取base64数据
q   function uploadFile(file){
        var f = file.files[0];

        var reader = new FileReader();

        reader.onload = function(){
            var data = e.target.result;
            if (data.lastIndexOf('data:base64') != -1) {
                  data = data.replace('data:base64', 'data:image/jpeg;base64');
            } else if (data.lastIndexOf('data:,') != -1) {
                  data = data.replace('data:,', 'data:image/jpeg;base64,');
            }

            if(isCanvasSupported()){

            }else{
                alert("您的浏览器不支持");
            }

        };

        reader.onerror = function(){
            console.log("上传失败了 ");
        }

        reader.readAsDataURL(f);
    }

    //ajax异步上传
    function ajaxUploadBase64File(base64Data){
        var url = "http://localhost:8080/jiajiao/upload/uploadPhoto";
        $.ajax({
            url:url,
            type:"post",
            data:{base64Data:base64Data},
            dataType:"json",
            success:function(data){
                if(data.success == true){
                    console.log("上传成功");
                }else{
                    console.log("上传失败");
                }
            },
            error:function(){
                console.log("上传失败");
            }
        });
    }; 


    //是否支持canvas
    function isCanvasSupported(){
        var elem = document.createElement('canvas');
        return !!(elem.getContext && elem.getContext('2d'));
    };

</script>  
</body>