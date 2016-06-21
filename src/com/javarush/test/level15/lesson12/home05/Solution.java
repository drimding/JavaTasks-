package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    protected Solution (String a){}
    protected Solution (String a, String b){}
    protected Solution (String a, String b, String c){}
     Solution(Integer b){}
     Solution(Integer a, Integer b){}
     Solution(Integer a, Integer b, Integer c){}
    public Solution(Double a){}
    public Solution(Double a, Double  b){}
    public Solution(Double a, Double b, Double c){}
    private Solution(Boolean B){}
    private Solution(boolean b){}
    private Solution(String s, boolean b){}
}

