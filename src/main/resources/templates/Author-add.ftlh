<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <title>Добавление автора</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
<header th:insert="hf/header.html :: header"></header>
<div class="container mt-5 mb-5">
  <h1>Добавление автора</h1>
  <form action="/library/author/add" method="post">
    <input type="text" name="fullName" placeholder="Введите полное имя" class="form-control">
    <input type="text" name="birth" placeholder="Введите дату рождения" class="form-control">
    <textarea name="biography" placeholder="Введите биографию" class="form-control"></textarea>
    <button type="submit" class="btn btn-success">Добавить автора</button>
  </form>
</div>
<footer th:insert="hf/footer.html :: footer"></footer>
</body>
</html>