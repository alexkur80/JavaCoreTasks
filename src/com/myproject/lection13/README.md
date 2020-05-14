## Занятие 13. Потоки ввода-вывода. Часть 1.
* [outputLinesFromFileToConsole(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/FileUtils.java) Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.

* [wordsFirstVowelLetter(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/FileUtils.java) Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.

* [allWordsLastLetterNextFirstLetterEqual(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/FileUtils.java) Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова

* [doublesDigits(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/FileUtils.java) Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.

* [writeIntOwnRealization(List\<Integer> list, String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/FileUtils.java) Записать в двоичный файл 20 случайных чисел типа int со значением больше 255. Прочитать записанный файл, распечатать числа и их среднее арифметическое. DataOutputStream.writeInt - ну
но это нельзя испольщзовать, нужно самому написать со смещением и маской
* [dirFileListRecursive(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/FileUtils.java) Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев. Для этого использовать рекурсию (пример рекурсии тут и тут).
* [doReverseFileCopy(String filePath)](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection13/FileUtils.java) Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки. 