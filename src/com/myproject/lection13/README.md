## Занятие 13. Строки.

* [stringBuilderVSString(String str1, String str2, int numberOfIteration)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String, 
второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.

* [1. strReplace(String string, String oldSubstring, String newSubstring)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) <p>
 [2. String strReplaceRegEx(String string)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) <p>
Заменить все грустные смайлы :( в строке на весёлые :)

* [ifStringStartAndFinishWord(String string, String world)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.

* [personFIO(String string)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
    в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.

* [countWordsInString(String string)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.

* [removeDuplicate(String string)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
   Пример: aaabbcdeef ->abcdef

* [1. longToStringFilledByZero01(long number)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) <p> 
[2. intToStringFilledByZero02(long number)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java)  <p>
[3 .intToStringFilledByZero03(long number)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/UtilsString.java) <p> Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями. Если число выходит за размер 10 символов вернуть все нули. 
Пример getString(22) -> 0000000022
Найти 3 способа решения задачи и определить наиболее быстрый способ.