package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Woman w1 = new Woman("Оксана", 30, "Львів");
        Woman w2 = new Woman("Roxie", 30, "Poland");

        w1.showAll();
        w2.showAll();

        Man m1 = new Man ("Rj", 22, "Kiev");
        Man m2 = new Man ("Rod", 30, "Lviv");
        m1.showAll();
        m2.showAll();

        //выведи их на экран тут
    }

    public static class Man
    {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address)
        {
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public void showAll()
        {
            System.out.printf("%s %d %s\n", this.name, this.age, this.address);

        }

    }
    public static class Woman
    {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address)
        {
            this.name=name;
            this.age=age;
            this.address=address;
        }

        public void showAll()
        {
            System.out.printf("%s %d %s\n", this.name, this.age, this.address);

        }

    }
    //добавьте тут ваши классы
}
