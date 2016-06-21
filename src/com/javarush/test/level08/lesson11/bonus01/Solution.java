package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String >();
        hashMap.put("January","1");
        hashMap.put("February","2");
        hashMap.put("March","3");
        hashMap.put("April","4");
        hashMap.put("May","5");
        hashMap.put("June","6");
        hashMap.put("July","7");
        hashMap.put("August","8");
        hashMap.put("September","9");
        hashMap.put("October","10");
        hashMap.put("November","11");
        hashMap.put("December","12");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String search = reader.readLine();
        for (Map.Entry<String,String> map : hashMap.entrySet()){
            if (map.getKey().equals(search))System.out.printf("%s is %s month\n", map.getKey(),map.getValue());
        }


    }

}
