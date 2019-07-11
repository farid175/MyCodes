package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give an odd number: ");
        int n = scanner.nextInt();
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (row == 0 && column == n - 1) {
                column = n - 1;
                row += 1;
            } else if (magicSquare[row][column] != 0) {
                row += 1;
            }
        }

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }

}
