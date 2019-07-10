import java.util.Scanner;

public class twodimensionalArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusu:n");
        int n = scan.nextInt();
        int[][] array = new int[n][n];
        int k = (n+1)/2;
        int minSetir = 0;
        int maxSetir = n - 1;
        int minSutun = 0;
        int maxSutun = n - 1;

        while(k > 0){
            for (int i = minSutun; i <= maxSutun; i++) {
                array[minSetir][i] = k;
            }
            for (int i = minSetir+1; i <= maxSetir; i++) {
                array[i][maxSutun] = k;
            }
            for (int i = maxSutun-1; i >= minSutun ; i--) {
                array[maxSetir][i] = k;
            }
            for(int i = maxSetir-1;i >= minSetir+1;i--){
                array[i][minSutun] = k;
            }
            minSetir++;
            minSutun++;
            maxSetir--;
            maxSutun--;
            k--;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
