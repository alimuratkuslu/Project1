import java.util.Scanner;
public class Manav {

    public static void main(String[] args){

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.0;

        int armuta, elmaa, domatesa, muza, patlıcana;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız ? ");
        armuta = inp.nextInt();
        System.out.println("Kaç kilo elma aldınız ? ");
        elmaa = inp.nextInt();
        System.out.println("Kaç kilo domates aldınız ? ");
        domatesa = inp.nextInt();
        System.out.println("Kaç kilo muz aldınız ? ");
        muza = inp.nextInt();
        System.out.println("Kaç kilo patlıcan aldınız ? ");
        patlıcana = inp.nextInt();

        double toplam = (armut * armuta) + (elma * elmaa) + (domates * domatesa) + (muz * muza) + (patlıcan * patlıcana);

        System.out.println("Toplam tutar: " + toplam);






        
    }
    
}
