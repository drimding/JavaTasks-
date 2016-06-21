package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("Pupkin", "Roman");
        hashMap.put("kopiv", "Kostia");
        hashMap.put("Kupkin", "Oksana");
        hashMap.put("Kropiv", "Roman");
        hashMap.put("Rupkin", "Roman");
        hashMap.put("Nupkin", "Anton");
        hashMap.put("Kapkin", "Irina");
        hashMap.put("Rom", "Anton");
        hashMap.put("Naumov", "Roman");
        hashMap.put("Oliog", "Roman");

    return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String,String> pair :  map.entrySet()){
            if(pair.getValue().equals(name))count++;
        }


    return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String,String> pair :  map.entrySet())
        {
            if(pair.getKey().equals(lastName))count++;

        }
        return count;
    }

}
