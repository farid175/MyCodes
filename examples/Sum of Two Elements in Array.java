import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusunu daxil et:");
        int N = scan.nextInt();
        System.out.println("Cemi olacaq reqemi daxil et:");
        int K = scan.nextInt();

        int[] arr = new int[N];

        System.out.println("Massivi doldur:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Netice:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] + arr[j] == K && i != j) {
                    System.out.print("{" + arr[i] + " " + arr[j] + "}");
                }
            }
        }

    }
}

