<html>
<body>
<h2>test!</h2>
<button id="click">click</button>
</body>
<script src="https://cdn.bootcss.com/jquery/2.2.2/jquery.js"></script>
<script type="text/javascript">
    $(function() {
        console.log("abc");
        $.ajax({url:"http://localhost:8080/login/4",success:function(result){
            console.log(result);
            var ws = new WebSocket("ws://localhost:8080/myHandler")
            ws.onopen = function () {
                console.log("onpen");
                ws.send("{}");
            }
            ws.onclose = function () {
                console.log("onclose");
            }

            ws.onmessage = function (msg) {
                console.log(msg.data);
            }
        }});
    })
</script>
</html>
