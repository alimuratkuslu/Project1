import java.util.Scanner;

public class VKD {

    public static void main(String[] args){
        double boy;
        int kilo;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuz giriniz: ");
        boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextInt();

        double vki = kilo / (boy*boy);

        System.out.println("Vücut Kütle İndeksiniz: " + vki);


    }
    
}
