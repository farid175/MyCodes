
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusunu daxil et:");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Suruwdurme sayi:");
        int k = scan.nextInt();
        System.out.println("left or right?:");
        String istiqamet = scan.next();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        if(istiqamet.equals("right")){
            Shiftright(arr,k);
            System.out.println("Netice:");
            PrintArray(arr);
        }else if(istiqamet.equals("left")){
            Shiftleft(arr,k);
            System.out.println("Netice:");
            PrintArray(arr);

        }




    }

    public static void Shiftleft(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            int b;
            for (b = 0; b < arr.length - 1; b++) {
                arr[b] = arr[b + 1];
            }
            arr[b] = temp;
        }
    }

    public static void Shiftright(int[] arr, int k) {
        for (int j = 0; j < k; j++) {
            int temp = arr[arr.length - 1];
            int i;
            for (i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = temp;
        }
    }

    public static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

