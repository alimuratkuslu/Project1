import java.util.Scanner;

public class Daire {

    public static void main(String[] args){
        int r;
        double pi = 3.14;
        int aci;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();
        System.out.println("Açıyı giriniz: ");
        aci = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double alan2 = (pi * (r*r) * aci);

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin a ölçülü alanı: " + alan2);
    }
    
}
