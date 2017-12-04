$(function () {
    $(".submit").click(function () {
        //读取男女很用户类型
        var sex = $("input[name=gender]:checked").val();
        var pgender = sex=="男"?"male":"female";
        var perInfo = {
            //phone:$("input[name=phoneNum]").val(),
            name: $("input[name=name]").val(),
            number: $("input[name=number]").val(),
            email: $("input[name=eMail]").val(),
            //school: $("input[name=school]").val(),
            gender:pgender,
            //头像的URL,目前并没有
            avatar: "",
            title:"",
        }
        //console.log(perInfo);
        $.ajax({
            // url:"http://rap2api.taobao.org/app/mock/933/PUT/me ",
            url: "/me",
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify(perInfo),
            success: function () {
                console.log(perInfo);
            }
        });
    })
})