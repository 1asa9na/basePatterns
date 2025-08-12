## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Facade Pattern

Контроллер ImageController является фасадом, который скрывает в себе логику
ImageRepository и ImageView, таким образом предоставляя пользователю лишь два метода:

- addImage(id, image)
- removeImage(id)