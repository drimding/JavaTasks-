package com.javarush.test.level15.lesson12.home01;


import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.sun.org.apache.xpath.internal.operations.Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value;
        do {
             value = reader.readLine();
            if ( value.equals("exit")) break;
            else
            try {
                if (value.contains(".")) print(Double.parseDouble(value));
                else
                if (Integer.parseInt(value)>0 && Integer.parseInt(value)<128) print((short) Integer.parseInt(value));
                else
                if (Integer.parseInt(value)>=128)print(Integer.parseInt(value));
            }catch (NumberFormatException x){
                print(value);
            }

        }while (true);
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
