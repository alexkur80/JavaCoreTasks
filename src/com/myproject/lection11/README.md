## Занятие 11. Исключения.

* [ExceptionTesting](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection11/ExceptionTesting.java) Объявите переменную со значением null. Вызовите метод у этой переменной.
Отловите возникшее исключение.
* [ownWrittenArrayIndexOutOfBoundsException()](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection11/UtilsException.java) Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
* [MyDefaultException](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection11/MyDefaultException.java) Создать собственный класс-исключение - наследник класса Exception. Создать метод, выбрасывающий это исключение.
Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
* [IsZeroRuntimeException](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection11/IsZeroRuntimeException.java) Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
Добавить вконструктор своего класса возможность указания сообщения.
* [reCatchException()](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection11/UtilsException.java) Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав в качестве причины отловленное.
* [randomThrowsException()](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection11/UtilsException.java) Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
* [percent50Exception()](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection11/UtilsException.java) Написать метод, который в 50% случаев бросает исключение.
Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally. 