import java.util.Scanner;

public class Array2DMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
        System.out.println("Left or Right?");
        String istiqamet = scan.next();
        if(istiqamet.equalsIgnoreCase("right")){
            for (int i = 0; i < m; i++) {
                for (int j = n-1;j >= 0;j--) {
                    System.out.print(array[j][i] + " ");
                }
                System.out.println();
            }
        }else if(istiqamet.equalsIgnoreCase("left")){
            for (int i = m-1; i >=0 ; i--) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[j][i] +" ");
                }
                System.out.println();
            }
        }
    }
}
