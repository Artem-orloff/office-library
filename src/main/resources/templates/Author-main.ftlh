<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <title th:text="${title}"/>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
<header th:insert="hf/header.html :: header"></header>
<div class="container mt-5">
  <h1>Author</h1>
</div>
<footer th:insert="hf/footer.html :: footer"></footer>
</body>
</html>