import java.util.Scanner;
public class Ucak {

    public static void main(String[]args){

        Scanner inp = new Scanner(System.in);

        int yas, tip;
        double mesafe;

        System.out.println("Mesafeyi giriniz: ");
        mesafe = inp.nextDouble();
        System.out.println("Yaşı giriniz: ");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz:\n1- Tek Yön\n2- Gidiş-Dönüş");
        tip = inp.nextInt();


        double ntutar = mesafe * 0.1;
        double yasindirimi;
        double gdindirimi;

        if(yas < 12){
            yasindirimi = ntutar * 0.5;
            ntutar = ntutar - yasindirimi;
            if(tip == 2){
                gdindirimi = ntutar * 0.2;
                ntutar = ntutar - gdindirimi;
                ntutar = ntutar*2;
            }
        }
        if(yas > 12 && yas < 24){
            yasindirimi = ntutar * 0.1;
            ntutar = ntutar - yasindirimi;
            if(tip == 2){
                gdindirimi = ntutar * 0.2;
                ntutar = ntutar - gdindirimi;
                ntutar = ntutar*2;
            }
        }
        if(yas > 65){
            yasindirimi = ntutar * 0.3;
            ntutar = ntutar - yasindirimi;
            if(tip == 2){
                gdindirimi = ntutar * 0.2;
                ntutar = ntutar - gdindirimi;
                ntutar = ntutar*2;
            }
        }
        

        System.out.println("Toplam Tutar: " + ntutar);


    }
    
}
