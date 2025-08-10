## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Singleton

Класс BankAccount имеет методы с флагом synchronized, что значит что доступ к ним синхронизован
и пользователи всегда будут иметь консистентный доступ к данным этого класса. Также реализован
метод getBankAccount(), возвращающий единственный созданный экземпляр класса и предотвращающий
создание новых экземпляров.