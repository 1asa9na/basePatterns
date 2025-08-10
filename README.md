## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Factory Pattern

Для реализации паттерна Factory были созданы классы 

- Developer
- Designer
- Administrator

реализующие интерфейс Employee с методом getSpecialty(). Также были созданы классы соответствующих фабрик,
реализующие интерфейс EmployeeFactory с методом createEmployee().

Создание фабрики происходит с помощью статичного метода createEmployeeFactory(int query), где query --
порядковый номер фабрики.