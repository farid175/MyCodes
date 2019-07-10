import java.util.Scanner;

public class twodimensionalArr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of Array:");
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int k = 1;

        arr[0][0] = k++;
        int a,b;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < 1; j++) {
                arr[i][j] = k++;
                a = i;
                b = j;

                while(b < i){
                    arr[--a][++b] = k++;
                }
            }
            if(i == n - 1){
                for (int j = 1; j < n; j++) {
                    int y = i;
                    for (int l = j; l < n; l++) {
                        arr[y--][l] = k++;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
