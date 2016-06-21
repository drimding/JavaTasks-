package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] numBig = new int[20];
        int[] numSmall1 = new  int[10];
        int[] numSmall2 = new  int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<numBig.length; i++)
            numBig[i]=Integer.parseInt(reader.readLine());
        int j =0;
        for (int i=0; i<numBig.length; i++) {
            if (i < 10){ numSmall1[i] = numBig[i];}
            else {numSmall2[j]=numBig[i]; j++;}
        }

        for (int i =0; i<numSmall2.length; i++)
            System.out.println(numSmall2[i]);

    }
}
