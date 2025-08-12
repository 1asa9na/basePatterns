## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Prototype Pattern

Есть интерфейс Prototypeable с целевым методом copy(), и интерфейс Shape, расширяющий
Prototypeable. Его реализуют классы Circle с полем radius и Rectangle с полями width и
length. С помощью фабрики ShapeFactory можно получить копию любого объекта Shape, если
передать в него прототип объекта.