## Занятие 06. Дженерики. Аннотации.

*  Создать класс [Pair](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/Pair.java), параметризованный двумя параметрами K и V. Класс должен 
хранить две переменные типов K и V соответственно. У класса должен быть конструктор,
 принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.
* Создать статический обобщённый метод swap в final классе [PairUtil](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/PairUtil.java). Метод должен принимать
 объект класса [Pair](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/Pair.java  ) и возвращать пару, в которой элементы поменяны местами. 
* Дан класс Solution, параметризированный T. Ограничьте параметр T. 
T должен быть наследником класса [ClassForGenerics](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/ClassForGenerics.java) и одновременно реализовывать интерфейс 
[InterfaceForGenerics](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/InterfaceForGenerics.java). Менять можно только класс
 [Solution](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/Solution.java).
*  Из задания 5.3 реализовать класс вычислитель для вещественных и целых типов данных,
 используя параметризацию классов.
*  Задание Аннотации. Реализовать аннотацию [Transaction](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/Transaction.java) и анализатор данной транзакции. 
Смысл данной аннотации заключается в том, что если метод помечен данной аннотацией, значит
 он вызывается в рамках транзакции. В рамках транзакции
 - когда выводится на консоль два сообщения: “Transaction is started”; “Transaction is ended”.
*  Создать класс-анализатор [ClassAnalyzer](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/ClassAnalyzer.java). Класс имеет перегруженный метод analyze(), 
принимающий объект типа Class или объект, отличный от него. Реализовать методы, которые 
анализируют структуру класса на предмет полей, методов, конструкторов и аннотаций всех 
типов для класса. Отчет выводится в консоль.сс-анализатор [ClassAnalyzer](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection06/ClassAnalyzer.java). Класс имеет 
перегруженный метод analyze(), принимающий объект типа Class или объект, отличный от 
него. Реализовать методы, которые анализируют структуру класса на предмет полей, методов, 
конструкторов и аннотаций всех типов для класса. Отчет выводится в консоль.