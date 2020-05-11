## Занятие 7. Наследование. Полиморфизм. Задачи.

* Создать класс [Hero](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Hero.java), представляющий собой героя и содержащий поле name.
    Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
    Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.

* Создать классы [Warrior](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Warrior.java), 
[Mage](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Mage.java) и 
[Archer](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Archer.java), представляющие собой наследников класса Hero.
  Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.

* Создать класс [Enemy](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Enemy.java), представляющий собой врага и содержащий поле health (количество здоровья).
   Добавить конструктор, принимающий количество здоровья, а также сеттер и геттер. 
 Добавить метод takeDamage(int damage), который уменьшает количество здоровья в соответствии с полученным уроном.

* Переписать метод attackEnemy класса [Hero](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Hero.java), добавив ему параметр типа Enemy.
    Метод должен вызывать у врага метод takeDamage и передавать в него определённое количество урона.
Переопределить метод в подклассах [Warrior](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Warrior.java), 
[Mage](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Mage.java) и
 [Archer](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Archer.java) так, чтобы каждый герой наносил врагу разное количество урона.
    
* Сделать класс [Hero](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Hero.java) и его метод attackEnemy абстрактными.

* Создать интерфейс [Mortal](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Mage.java) содержащий метод isAlive().
    Сделать так, чтобы класс [Enemy](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Enemy.java) реализовывал интерфейс 
[Mortal](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/Mortal.java). 
    Определить метод isAlive в классе Enemy так, чтобы тот возвращал true, если количество здоровья врага больше 0.
    
* Создать класс [BattleGround](https://github.com/alexkur80/PVTCourse2020/blob/master/src/com/myproject/lection07/BattleGround.java) с методом main, в котором создать симуляцию героя, атакующего врага.
