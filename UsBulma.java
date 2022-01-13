import java.util.Scanner;

public class UsBulma {

    static int usbulma(int sayi, int us){
        if(us < 1){
            return 1;
        }
        else{
            return sayi * usbulma(sayi,us-1);
        }
    }
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        int sayi, us;

        System.out.println("Taban giriniz: ");
        sayi = inp.nextInt();
        System.out.println("Üs giriniz: ");
        us = inp.nextInt();

        System.out.println(usbulma(sayi,us));

    }
}
