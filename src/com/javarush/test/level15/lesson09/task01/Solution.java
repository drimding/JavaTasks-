package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
static{
    labels.put(1.2,"qw");
    labels.put(2.2,"err");
    labels.put(3.2,"wer");
    labels.put(4.2,"dd");
    labels.put(5.2,"cxx");
}

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
