package com.javarush.test.level08.lesson08.task05;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext();){
                Map.Entry<String, String> entry = it.next();
                if (pair.getValue().equals(entry.getValue()) && !pair.getKey().equals(entry.getKey())){
                    it.remove();

                }

            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }


}
