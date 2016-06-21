package com.javarush.test.level14.lesson06.home01;

/**
 * Created by drimcatcher on 05.04.2016.
 */
public class UkrainianHen extends Hen{
    @Override
    public String getDescription(){
        return super.getDescription()+"Моя страна - Ukraine. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }
}