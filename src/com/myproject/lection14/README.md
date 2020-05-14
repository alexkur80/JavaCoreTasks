## Занятие 14. Регулярные выражения. Задачи.


* [emailValidator(String emailToValidate)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection14/UtilsRegExp.java) Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
Возможные домены верхнего уровня: .org .com

* [hexValidator(String hexToValidate)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection14/UtilsRegExp.java) Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу.

* [tegReplacement(String tegToReplace, String replacementTemplate)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection14/UtilsRegExp.java) Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например <p id ="p1">,
и замену их на простые теги абзацев <p>.

* [phoneValidator(String phoneNumToValidate)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection14/UtilsRegExp.java) Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
X - код оператора
Y - номер телефона
* [ipV4Validator(String ipv4ToValidate)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection14/UtilsRegExp.java) Написать метод, который проверяет, является ли строка адресом IPv4.
    * Пример корректных IPv4 <p>
0.0.0.0  <p>
0.0.1.0 <p>
255.0.0.1 <p>
255.55.255.255 <p>
192.168.0.1 <p>

    * Не корректный <p>
001.0.0.0 <p>
256.1.1.1 <p>
1.1.1.1. <p>
-1.0.-1.1  <p>