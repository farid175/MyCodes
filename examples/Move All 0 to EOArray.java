
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusunu daxil et:");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == 0 && arr[j] != 0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        
    }
}
