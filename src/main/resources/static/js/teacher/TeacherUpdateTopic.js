function getInfo() {
    var topicJson = localStorage.getItem("topicJson");
    if (topicJson != null) {
        topicJson = JSON.parse(topicJson);
        console.log(topicJson);
        $("input[name=seminarName]").val(topicJson.name);
        $("#desc").val(topicJson.description);
        $("input[name=groupLimit]").val(topicJson.groupLimit);
        $("input[name=groupMemberLimit]").val(topicJson.groupMemberLimit);
        $("#serial").text(topicJson.serial);
    }
}
$(function () {
    var topicId = localStorage.getItem("topicId");
    // console.log(topicId);

    var courseJson = localStorage.getItem("courseJson");
    if (courseJson != null) {
        courseJson = JSON.parse(courseJson);
        $(".courseName").text(courseJson.name);
        $(".courseIntroduction").text(courseJson.description);
    }

    getInfo();

    //点击了提交按钮
    $(".submit").click(function () {
        var topicInfo = {
            serial:$("#serial").text(),
            groupLimit: $("input[name=groupLimit]").val(),
            name:$("input[name=seminarName]").val(),
            groupMemberLimit:$("input[name=groupMemberLimit]").val(),
            description:$("#desc").val(),
        }
        console.log(topicInfo);
        $.ajax({
            url:"/topic/"+topicId,
            type:"PUT",
            contentType: "application/json",
            data: JSON.stringify(topicInfo),
            success:function () {
                alert("修改成功");
                window.location.href = "/teacher/topicCheck"
            },
            error:function () {
                alert("修改失败");
            }
        })
    })

    //点击了重置按钮后
    $(".reset").click(function () {
        getInfo();
    })

    //返回上一页
    $(".returnButton").click(function () {
        window.history.back();
    })
})