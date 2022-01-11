import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int sayi;

        System.out.println("Sayı giriniz: ");
        sayi = inp.nextInt();

        for(int i = 1; i < sayi;i*=4){
            if(i < sayi){
                System.out.println(i);
            }
        }
        for(int i = 1; i < sayi;i*=5){
            if(i < sayi){
                System.out.println(i);
            }
        }
    }
    
}
