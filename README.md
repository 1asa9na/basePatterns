## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## State Pattern

Несколько потоков влияют на состояние счётчика, и в зависимости от состояния (счёта)
меняется размер инкремента/декремента.
