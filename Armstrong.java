import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        int n;
        int sum = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        n = inp.nextInt();

        while(n >= 1){
            sum += (n % 10);
            n = n / 10; 
        }
        System.out.println("Toplam: " + sum);


    }
    
}
