## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Memento Pattern

Реализована коллекция History с итератором, который может передвигаться в двух направлениях.
History хранит состояния документа, тем самым мы можем производить Undo и Redo операции
внутри документа.