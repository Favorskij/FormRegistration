<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Привет мир!!!</title>
</head>

<body>

Это юзер
<br>
<br>

<form method="post" action="/logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <button type="submit">Выход</button>
</form>

<br>
<br>

<a href="/"><button type="submit" >Главная</button></a>

</body>
</html>