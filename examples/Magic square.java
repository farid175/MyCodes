package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of Array:");
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int i = n/2;
        int j = n - 1;

        for(int say = 1; say <= n*n; ){
            if(i == -1 && j == n){
                j = n - 2;
                i = 0;
            }else {
                if(j == n){
                    j = 0;
                }if(i < 0){
                    i = n - 1;
                }
            }
            if(arr[i][j] != 0){
                j -= 2;
                i++;
                continue;
            }else {
                arr[i][j] = say++;
            }
            j++;
            i--;
        }
        System.out.println("Sum:" + n*((n*n) + 1)/2);
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
