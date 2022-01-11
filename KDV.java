import java.util.Scanner;

public class KDV{
    public static void main(String[] args){
        double tutar, kdvOran;

        Scanner input = new Scanner(System.in);

        System.out.println("Tutarı giriniz: ");
        tutar = input.nextDouble();

        if(tutar < 1000){
            kdvOran = 0.18;

            double kdvTutar = tutar * kdvOran;
            double toplam = tutar + kdvTutar;

            System.out.println("Toplam tutar: " + toplam);
        }
        else if(tutar > 1000){
            kdvOran = 0.08;

            double kdvTutar = tutar * kdvOran;
            double toplam = tutar + kdvTutar;
            System.out.println("Toplam tutar: " + toplam);
        }
       

    }
}