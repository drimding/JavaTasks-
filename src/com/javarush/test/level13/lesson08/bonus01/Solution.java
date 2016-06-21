package com.javarush.test.level13.lesson08.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            String m = "d:\\mm.ttt";
            InputStream in = new FileInputStream(m);

        } catch (Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            String[] m = new String[2];
            System.out.print(m[3]);

        } catch (Exception e)
        {
            exceptions.add(e);

        }

        try
        {
            int[] m = new int[2];
            m[1]=Integer.parseInt("sdf");

        } catch (Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            throw new RuntimeException();

        } catch (Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            throw new NullPointerException();

        } catch (Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            throw new IllegalThreadStateException();

        } catch (Exception e)
        {
            exceptions.add(e);

        }   try
    {
        throw new InterruptedException();

    } catch (Exception e)
    {
        exceptions.add(e);

    }   try
    {
        throw new NegativeArraySizeException();

    } catch (Exception e)
    {
        exceptions.add(e);

    }   try
    {
        throw new UnsupportedOperationException();

    } catch (Exception e)
    {
        exceptions.add(e);

    }
    }
}
