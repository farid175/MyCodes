import java.util.Scanner;

public class twodimensionalArr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of Array:");
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int k = 1;
            for (int i = arr.length-1; i >= 0; i--) {
                    for(int j = arr[i].length-1;j >= 0;j--){
                        arr[i][j] = k;
                        k++;
                    }
                }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
