<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Вход в Аккаунт</title>
</head>
<body>


    <form method="post" action="/login">

            <input type="text" name="name" value="user" placeholder="Имя пользователя">
            <input type="password" name="password" value="1234" placeholder="Пароль">

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <button type="submit">Войти</button>
    </form>


</body></html>