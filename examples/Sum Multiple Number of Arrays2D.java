import java.util.Scanner;

public class Array2DMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusu:n,m,k");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][k];
        int[][] C = new int[n][k];

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    C[i][j] += (A[i][l] * B[l][j]);
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
