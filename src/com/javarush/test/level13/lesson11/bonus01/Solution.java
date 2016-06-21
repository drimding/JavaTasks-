package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream file;
        List<Integer> list = new ArrayList<>();
        String data ="";
        Scanner scanner;
        try {
            file = new FileInputStream(reader.readLine());
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                Integer line = Integer.parseInt(scanner.nextLine());
                if(line%2==0)list.add(line);
            }
            scanner.close();
            //file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        for (Integer l : list) {
            System.out.println(l);
        }

    }
}
