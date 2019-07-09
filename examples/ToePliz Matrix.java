import java.util.Scanner;

public class twodimensionalArr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of Array:");
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        if(checkToePliz(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean checkToePliz(int[][] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if(arr[i][j] != arr[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
