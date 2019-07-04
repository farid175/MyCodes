import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massivin olcusunu daxil et:");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        int e=0,o=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2 == 0){
                even[e] = arr[i];
                e++;
            }else if(arr[i]%2 != 0){
                odd[o] =arr[i];
                o++;
            }
        }

        for (int i = 0; i < e; i++) {
            arr[i] = even[i];
        }
        for (int i = 0; i < o; i++) {
            arr[e+i] = odd[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
