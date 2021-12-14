package ru.job4j.condition;

public class ChessBoard {
        private static boolean isPositiveAndIsLessThan8(int num) {
            return num >= 0 && num < 8;
        }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isPositiveAndIsLessThan8(x1) && isPositiveAndIsLessThan8(y1) && isPositiveAndIsLessThan8(x2) && isPositiveAndIsLessThan8(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x2 - x1);
            }
        }
            return rsl;
        }

        public static void main(String[]args) {
            System.out.println(ChessBoard.way(7, 7, 0, 0));
        }
    }