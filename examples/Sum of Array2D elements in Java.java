import java.util.Scanner;

public class Array2DMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusu:");
        int n = scan.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        System.out.println("A doldur:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scan.nextInt();
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("B doldur");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = scan.nextInt();
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Cemi:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
