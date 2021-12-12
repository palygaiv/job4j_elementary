package ru.job4j.condition;

public class And {
    public static void main(String[] args) {
        boolean first = true;
        boolean second = true;
        boolean join = first && second;
        System.out.println(join);
        first = false;
        second = true;
        join = first && second;
        System.out.println(join);
        first = true;
        second = false;
        join = first && second;
        System.out.println(join);
        first = false;
        second = false;
        join = first && second;
        System.out.println(join);
    }
}

