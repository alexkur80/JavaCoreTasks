## Занятие 14. Потоки ввода-вывода. Часть 2
* Сравнить скорость чтения и записи 5 МБ символов при использовании классов
 буфиризированого [bufferedReaderBenchmark(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/FileReadingBenchmark.java) и не буфиризированого [fileReaderBenchmark(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/FileReadingBenchmark.java) символьного ввода вывода.

* Создать класс [Computer](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/Computer.java). Добавить ему несколько полей, создать объект
 этого класса, сериализовать [serialization(Object computer, String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/SerializationDeserializationUtils.java) в файл.
Десериализовать [deserialization(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/SerializationDeserializationUtils.java) объект из того же файла, вывести значения полей в консоль.

* Создать класс [Notebook](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/Notebook.java) - наследник [Computer](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/Computer.java). В этом классе должно быть поле типа 
TouchPad - также созданного класса со своими полями. 
Добавить в класс [Notebook](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/Notebook.java) transient-поле. Создать объект класса [Notebook](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection16/Notebook.java), сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.