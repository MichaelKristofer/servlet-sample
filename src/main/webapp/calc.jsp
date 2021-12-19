<%--
  Created by IntelliJ IDEA.
  User: Dadddddy
  Date: 08.10.2021
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form action="/test" method="post">
    <div class="mb-3">
        <label for="1-st" class="form-label">1st</label>
        <input type="text" class="form-control" id="1-st" name="num1">
    </div>
    <div class="mb-3">
        <label for="2-nd" class="form-label">2nd</label>
        <input type="text" class="form-control" id="2-nd" name="num2">
    </div>
    <div class="mb-3">
        <label for="operation" class="form-label">Operation</label>
        <input type="text" class="form-control" id="operation" name="operation" placeholder="sum, sub, mul, div">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<p>${requestScope.message}</p>
<p>${param.name}</p>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
