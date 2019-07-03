import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusunu daxil et:");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Massivi doldur:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i+1; j < arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    break;
                }
            }
            if(j == arr.length){
                System.out.println(arr[i] + " ");
            }
        }

    }
}
