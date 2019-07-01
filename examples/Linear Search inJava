import java.util.Random;
import java.util.Scanner;


public class Query {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rnd =  new Random();
        int count = 0;
        System.out.print("Enter Size of Array:");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length;i++){
            arr[i] = rnd.nextInt(10);
            System.out.println(arr[i]);
        }
        System.out.print("Enter Query:");
        int query = scan.nextInt();

        for(int i = 0;i < arr.length;i++){
            if(query == arr[i]){
                count++;
            }
        }

        if(count > 0){
            System.out.println("Count:" +count);
        }else{
            System.out.println("Query is not found");
        }



    }
}
