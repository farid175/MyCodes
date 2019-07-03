import org.omg.Messaging.SYNC_WITH_TRANSPORT;

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

        int l = 0,r = arr.length - 1,temp;

        while(l < r){
            if(arr[l]%2 == 0){
                l++;
            }else{
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
