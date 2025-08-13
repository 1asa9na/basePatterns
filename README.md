## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Iterator Pattern

+-----------+    +----------------------------+    +-----------------------+
| Playlist  | -> | Iterable<T>                |    | Iterator<T>           |
+-----------+    +----------------------------+    +-----------------------+
                 | - items : String[]         |    | + hasNext() : boolean |
                 | + iterator() : Iterator<T> |    | + next() : T          |
                 +----------------------------+    +-----------------------+

Клиент может пройтись по плейлисту с помощью итератора, т.к. плейлист расширяет класс Iterable.