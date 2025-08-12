## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Decorator Pattern

Есть интерфейс Command с методом run() и простая реализация MoveCommand, позволяющая
перемещаться в определённом направлении. Также есть абстрактный класс декоратор
MacroCommand, на основе которого сделана команада LongMoveCommand, позволяющая
переместиться на определённую дистанцию
