package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id=0;
        String name="";
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>() {
        };
do {
        String input1= reader.readLine();
        if(input1.isEmpty())break;
        String input2= reader.readLine();

        id = Integer.parseInt(input1);
        name = input2;
        hashMap.put(name,id);
}while(true);
        for (Map.Entry<String,Integer> pair:hashMap.entrySet())
        {
        System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}
