function login() {



    //ajax异步提交

    var userName = $("#username").val();
    var password = $("#password").val();
    $.ajax(
        {
            type:"get",
            url:"/login" ,

            datattype:"text",
            success:function(rs) {
                if(rs.code ==0){
                                         //跳到登录页面
                    var errMsg = rs.msg;

                    $("#div1").html(errMsg);

                    $("#div1").html(rs.code);
               }else{

                    alert("登录成功");
                    var value=$("#username").val();
                    alert(value);
                    alert(rs.code);
               }
            },
            error:function(er){
                alert("失败")
                var errMsg = rs.msg;
                $("#div1").html(errMsg);
            }

        }
    )


    // $.ajax(
    //     {
    //         type: "get",   //提交方式
    //         url: "/login",
    //         //url: "/login?username=" + userName + "&password=" + password,  //提交的地址
    //         // data:                      //请求数据
    //         dataType: "json",//后端返回的数据格式
    //         success: function (rs) {    //请求发送成功，执行success rs后台返回的数据
    //
    //             if (rs.code == 0) {
    //                 //跳到登录页面
    //                 alert("登录成功");
    //                 window.open("zengshangai.jsp");
    //
    //             } else {
    //                 var errMsg = rs.msg;
    //                 $("#div1").html(errMsg);
    //
    //             }
    //          return;
    //         },
    //         error: function (er) {
    //             //alert(er)
    //             alert("用户名或密码错误")
    //         }
    //
    //     }
    // )
}