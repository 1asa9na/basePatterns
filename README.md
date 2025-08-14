## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Mediator Pattern

Игроки взаимодействуют с игровым полем через медиатор, и поле отправляет своё состояние
игрокам также через медиатор. Медиатор определяет, кому придёт уведомление об изменении
состояния игрового поля: всем, всем кроме либо только одному игроку. 
