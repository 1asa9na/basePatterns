## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Composite Pattern

Классы Playlist и Track расширяют абстрактный класс Record, реализующий интерфейс
Playable с методом play(). Playlist в свою очередь является коллекцией объектов Track,
и при вызове play() на Playlist также вызываются методы play() на всех объектах Track,
находящихся в коллекции.