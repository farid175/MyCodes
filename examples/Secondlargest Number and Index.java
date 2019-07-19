import java.util.Random;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd =  new Random();
        int count = 0;
        System.out.print("Enter Size of Array:");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length;i++){
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        int secondlargest = 0;
        int pos = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != largest && (pos == -1 || arr[i] > secondlargest)){
                secondlargest = arr[i];
                pos = i;
            }
        }

        System.out.println("Second Largest number:" +secondlargest + " Position:" + pos);
    }

}
