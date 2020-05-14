## Занятие 08. Коллекции. Set. Map.

* [Unique](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection08/Unique.java) 
Написать метод countUnique [countUnique(Collection<Integer> numbersList)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection08/Unique.java) , 
который принимает целочисленный список в качестве параметра и возвращает количество уникальных целых чисел в этом списке.
При получении пустого списка метод должен возвращать 0.
Пример: [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.

* [Unique](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection08/Unique.java) Написать метод 
isUnique [isUnique(Map<String, String> map)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection08/Unique.java), который принимает Map<String, String> и возвращает true,
если два различных ключа не соответствуют двум одинаковым значениям.
Например, в данном случае вернётся true:  {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
А в данном - false: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins} 

* [Polynomial](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection08/Polynomial.java) Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
Ключ: номер степени
Значение: значение множителя
Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8

* [BlackBox](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection08/BlackBox.java) Реализовать структуру «Черный ящик» хранящую целые числа. Структура должна поддерживать операции добавления числа и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.