package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("OCTOBER 3 1988"));
        map.put("Ilarrion", new Date("JUNE 2 1912"));
        map.put("Antonov", new Date("JUNE 1 1952"));
        map.put("Romanov", new Date("OCTOBER 1 1980"));
        map.put("Korbin", new Date("JUNE 12 1990"));
        map.put("Rojer", new Date("OCTOBER 11 1989"));
        map.put("Shvarc", new Date("JUNE 18 1986"));
        map.put("Terminator", new Date("JUNE 28 1932"));
        map.put("Pokemon", new Date("NOVEMBER 22 1956"));
        map.put("Tetris", new Date("JUNE 26 1980"));

        //напишите тут ваш код

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for(Iterator<Map.Entry<String,Date>> it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry<String, Date> entry = it.next();
            if (entry.getValue().getMonth()+1 >=6  && entry.getValue().getMonth()+1 <=8 ) {
                it.remove();
            }
        }
    }

}
