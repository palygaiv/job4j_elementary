package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                 matrix[size][size] = i + j;
            }
        }
        return matrix;
    }
}
