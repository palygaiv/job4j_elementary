package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(190);
        System.out.println("Man 190 is " + man + " weight");
        double woman = Fit.womanWeight(173);
        System.out.println("Woman 173 is " + woman + " weight");
    }
}
