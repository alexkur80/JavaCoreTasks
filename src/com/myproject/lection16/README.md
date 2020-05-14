## Занятие 16. Потоки ввода-вывода. Часть 2
* Сравнить скорость чтения и записи 5 МБ символов при использовании классов
 буфиризированого [bufferedReaderBenchmark(String filePath](FileReadingBenchmark) и не буфиризированого [fileReaderBenchmark(String filePath)](FileReadingBenchmark) символьного ввода вывода.

* Создать класс [Computer](). Добавить ему несколько полей, создать объект
 этого класса, сериализовать [serialization(Object computer, String filePath)](SerializationDeserializationUtils) в файл.
Десериализовать [deserialization(String filePath)](SerializationDeserializationUtils) объект из того же файла, вывести значения полей в консоль.

* Создать класс [Notebook]() - наследник [Computer](). В этом классе должно быть поле типа 
Touchpad - также созданного класса со своими полями. 
Добавить в класс [Notebook]() transient-поле. Создать объект класса [Notebook](), сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.