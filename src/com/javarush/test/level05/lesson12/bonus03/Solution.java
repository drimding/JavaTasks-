package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Throwable
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length;
        int max;
        length=Integer.parseInt(reader.readLine());
        if (length<=0){}
        else {
            max = Integer.parseInt(reader.readLine());
            int Num;
            for (int i = 0; i < length - 1; i++) {
                Num = Integer.parseInt(reader.readLine());
                if (Num > max) max = Num;
            }
            System.out.println(max);
        }

    }
}