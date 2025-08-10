## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Abstract Factory

На основе имеющихся реализаций интерфейсов

- Employee
- Office
- Computer

Были созданы фабрики DesignerWorkspaceFactory и DeveloperWorkspaceFactory, имеющие
разные сочетания наследников Employee, Office и Computer и наследуемые от одной
абстрактной фабрики WorkspaceFactory.