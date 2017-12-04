$(function () {
    $.ajax({
        url: "/school/province",
        type: "GET",
        success: function (data) {
            for(var i = 0;i<data.length;i++)
                $("#province").append(
                    "<option value=\"" + data[i] + "\">" + data[i] + "</option>"
                );
            $.ajax({
                url: "/school/city?province=" + $("#province option:selected").attr("value"),
                type: "GET",
                success: function (data) {
                    for(var i = 0;i<data.length;i++)
                        $("#city").append(
                            "<option value=\"" + data[i] + "\">" + data[i] + "</option>"
                        );
                    $.ajax({
                        url: "/school?city=" + $("#city option:selected").attr("value"),
                        type: "GET",
                        success: function (data) {
                            for(var i = 0;i<data.length;i++)
                                $("#school").append(
                                    "<option value=\"" + data[i].name + "\">" + data[i].name + "</option>"
                                );
                        }
                    });
                }
            });
        }
    });

    $("#submit").on("click", function() {
        teacherInfo = {
            name: $("#name").val(),
            phone: $("#phoneNum").val(),
            password: $("#password").val(),
            gender: $("input[name=gender]:checked").val() == "男" ? "male" : "female",
            number: $("#stuffNum").val(),
            email: $("#eMail").val(),
            school: {
                province: $("#province option:selected").attr("value"),
                city: $("#city option:selected").attr("value"),
                name: $("#school option:selected").attr("value")
            }
        };
        $.ajax({
            url: "/me",
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify(teacherInfo),
            success: function () {

            }
        });
    });
})