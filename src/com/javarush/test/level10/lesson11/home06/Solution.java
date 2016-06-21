package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String country;
        private String address;
        private Human father;
        private Human mother;

        Human(String name)
        {
            this.name=name;
        }
        Human(String name, int age)
        {
            this(name);
            this.age=age;

        }
        Human(String name, int age, String country)
        {
            this(name, age);
            this.country=country;
        }
        Human(String name, int age, String country, String address)
        {
            this(name, age, country);
            this.address=address;
        }
        Human(String name, int age, String country, String address, Human father)
        {
            this(name, age, country, address);
            this.father=father;
        }
        Human(String name, int age, String country, String address,Human father, Human mother)
        {
            this(name, age, country, address);
            this.mother=mother;
            this.father=father;
        }
        Human(String name, int age, Human father)
        {
            this(name, age);
            this.father=father;
        }
        Human(String name, int age, Human father, Human mother)
        {
            this(name, age);
            this.mother=mother;
            this.father=father;

        }
        Human(String name, Human father, Human mother)
        {
            this(name);
            this.mother=mother;
            this.father=father;
        }
        Human(String name, int age, String country, Human father, Human mother)
        {
            this(name, age, country);
            this.mother=mother;
            this.father=father;

        }
    }
}
