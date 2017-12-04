(function(){
    window.onload = function() {
        $.ajax({
            type: "get",
            // url: "http://rap2api.taobao.org/app/mock/933/GET/me",
            url: "/me",
            success: function(data) {
                //alert(data.id);
                //document.getElementById("photo").innerHTML = data.avatar;
                document.getElementById("username").innerHTML = data.phone;
                document.getElementById("number").value = data.number;
                document.getElementById("name").value = data.name;
                document.getElementById("gender").value = data.gender == "male"? "nan" : "nv";
                document.getElementById("school").value = data.school.name;
                document.getElementById("title").value = data.title;
                document.getElementById("email").value = data.email;
                document.getElementById("phone").value = data.phone;
            }
        });
    }

    $('#submit').on('click',function(){
        data = {
            phone: $("#phone").val(),
            email: $("#email").val(),
            number: $("#number").val(),
            school: {
                name: $("#school").val()
            },
            name: $("#name").val(),
            gender: $("#gender").val(),
            title: $("#title").val()
        };

        $.ajax({
            url: "/me",
            type: "POST",
            // url: "http://rap2api.taobao.org/app/mock/933/POST/me",
            headers: {
                "Content-Type": "application/json",
                "X-HTTP-Method-Override": "PUT"
            },
            data: JSON.stringify(data),
            success: function () {
                console.log("success!");
            }
        });
    });
})();

