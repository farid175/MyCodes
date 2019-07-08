import java.util.Scanner;

public class Array2DMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusu:n");
        int n = scan.nextInt();
        int[][] array = new int[n][n];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
