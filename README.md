## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Template Method Pattern

DatabaseReal расширяет абстрактный класс TemplateDatabase и реализует абстрактный метод
manipulate. Чтение и запись в БД реализованый в шаблонном методе manipulateData.
