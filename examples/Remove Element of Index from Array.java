import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Random;
import java.util.Scanner;


public class Remove {
    public static void main(String[] args){
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
        System.out.print("Remove Element of Index:");
        int index = scan.nextInt();

        for(int i = 0;i < arr.length;i++) {
            if (index == i) {
                for(int j = i;j < arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
            }
        }
        for(int i = 0;i < arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }



    }
}
