import java.util.Random;


public class Calculator {
    public static void main(String[] args){
        Random rnd =  new Random();
        int[] student = new int[100];
        int milk = 200;
        int count = 1;
        int max = 100;
        int min = 10;

        for(int i = 0;i < student.length;i++) {
            student[i] = rnd.nextInt((max - min) + 1) + min;
            if(student[i] <= 30){
                count++;
            }
        }

        int glasses = 200*count;

        int packets = glasses / 900;

        if(glasses > 900){
            packets++;
        }

        System.out.println("Cekisi 30 kq dan az olanlarin sayi:" +count+ "  Sud paketi:" + packets + "  Bulka sayi:" + count);

    }
}
