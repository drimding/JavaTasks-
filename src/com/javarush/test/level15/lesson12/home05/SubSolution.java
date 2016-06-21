package com.javarush.test.level15.lesson12.home05;

/**
 * Created by drimcatcher on 11.05.2016.
 */
public class SubSolution extends Solution {


    protected SubSolution(String a) {
        super(a);
    }

    protected SubSolution(String a, String b) {
        super(a, b);
    }

    protected SubSolution(String a, String b, String c) {
        super(a, b, c);
    }

    SubSolution(Integer b) {
        super(b);
    }

    SubSolution(Integer a, Integer b) {
        super(a, b);
    }

    SubSolution(Integer a, Integer b, Integer c) {
        super(a, b, c);
    }

    public SubSolution(Double a) {
        super(a);
    }

    public SubSolution(Double a, Double b) {
        super(a, b);
    }

    public SubSolution(Double a, Double b, Double c) {
        super(a, b, c);
    }
    private SubSolution(Boolean B){
        super(String.valueOf(B));
    }
    private SubSolution(boolean b){
        super(String.valueOf(b));
    }
    private SubSolution(String s, boolean b){
        super(String.valueOf(s), String.valueOf(b));
    }

}
