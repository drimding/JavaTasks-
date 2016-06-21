package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream fiel = null;
        try {
            fiel = new FileOutputStream(reader.readLine());


            do {
                String l = reader.readLine();

                for (int i=0; i<l.length();i++){
                    fiel.write(l.charAt(i));
                }
                fiel.write('\n');

                if (l.equals("exit"))break;
            }while (true);


            fiel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
