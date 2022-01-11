import java.util.Scanner;

public class Dongu {
    public static void main(String[] args){

        int n;
        int sum = 0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.println("Sayı giriniz: ");
            n = inp.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                sum += n;
            }
        }while(n % 2 == 0);
        
        System.out.println("Toplam: " + sum);


    }
    
}
