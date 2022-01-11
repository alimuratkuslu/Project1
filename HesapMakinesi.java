import java.util.Scanner;
public class HesapMakinesi {

    public static void main(String[]args){
        int n1,n2;

        Scanner inp = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz nedir ? ");
        int select = inp.nextInt();

        switch(select){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(Math.abs(n1-n2));
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
        }


    }
    
}
