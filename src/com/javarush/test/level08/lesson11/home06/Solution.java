package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human d1 = new Human("kolija", true, 70);
        Human d2 = new Human("Tolja", true, 75);

        Human b1 = new Human("Paraska", false, 69);
        Human b2 = new Human("Sofa", false, 72);

        Human ch1 = new Human("Ch1", true, 2);
        Human ch2 =  new Human("ch2", true, 7);
        Human ch3 = new Human("ch3", true, 15);

        Human f1 = new Human("Tatom", true, 25, ch1, ch2, ch3 );
        Human m1 = new Human("mama", true, 22, ch1, ch2, ch3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(f1);
        System.out.println(m1);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        Human (String name, Boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }
        Human(String name, Boolean sex, int age, Human ...childs){
            this(name, sex, age);
            for (Human child: childs)
            this.children.add(child);

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
