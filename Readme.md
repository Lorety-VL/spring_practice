эндпоинт для запросов - localhost:8090/user

название бд - postgres
Название таблицы в бд - users

модель данных:
id = int
first_name - String
last_name - String
age - int

доступно 4 роута

get localhost:8090/user - возвращает всех пользователей.
get localhost:8090/user/{:id} - возвращает пользователя по id.
post localhost:8090/user - создает пользователя, принимает json описанной выше структуры.
put localhost:8090/user/{:id} - изменяет данные пользователя, принимает json той же структуры.
delete localhost:8090/user/{:id} - удаляет пользователя по id.

все роуты возвращают пользователя, кроме put и delete они информируют успешна операция или нет.
