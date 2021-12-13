package ru.job4j.condition;

public class ChessBoard {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isLessThan8(int num) {
        return num < 8;
    }

    public static boolean isPositiveAndIsLessThan8(int num) {
        return isPositive(num) && isLessThan8(num);
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isPositiveAndIsLessThan8(x1) && isPositiveAndIsLessThan8(y1) && isPositiveAndIsLessThan8(x2) && isPositiveAndIsLessThan8(y2)) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(7, 7, 0, 0));
    }
}