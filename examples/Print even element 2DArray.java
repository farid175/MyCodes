import java.util.Scanner;

public class Array3DMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Setir:");
        int n = scan.nextInt();
        System.out.println("Sutun:");
        int m = scan.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 100);
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2 == 0){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
