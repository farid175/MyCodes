import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Random;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rnd =  new Random();
        int count = 0;
        System.out.print("Enter Size of Array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int pos = 0;
        for(int i = 0; i < arr.length;i++){
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int largest = arr[0];
        int secondlargest = arr[0];

        for(int i = 0;i < arr.length;i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];

            }else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
                pos = i;
            }
        }

        System.out.println("Second Largest number:" +secondlargest + " Position:" +pos);



    }
}
