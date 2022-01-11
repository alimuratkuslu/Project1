import java.util.Scanner;

public class hava {

    public static void main(String[] args){
        int sicaklik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sıcaklığı giriniz: ");
        sicaklik = inp.nextInt();
        int i = 0;

        if(sicaklik < 5.0){
            i = 0;
        }
        if(sicaklik < 15.0 && sicaklik > 5.0){
            i = 1;
        }
        if(sicaklik > 15.0 && sicaklik < 25.0){
            i = 2;
        }
        if(sicaklik > 25.0){
            i = 3;
        }
        

        switch(i){
            case 0:
                System.out.println("Kayak");
                break;
            case 1:
                System.out.println("Sinema");
                break;
            case 2:
                System.out.println("Piknik");
                break;
            case 3:
                System.out.println("Yüzme");
                break;
        }

    }
    
}
