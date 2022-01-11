import java.util.Scanner;

public class Artikyil {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int yil;

        System.out.println("Yılı giriniz: ");
        yil = inp.nextInt();

        if(yil % 100 == 0 && yil % 400 == 0){
            System.out.println(yil + "\nbir artık yıldır ");
        }
        else if(yil % 4 == 0 && yil % 100 != 0){
            System.out.println(yil + "\nbir artık yıldır ");
        }
        else{
            System.out.println(yil + "\nbir artık yıl değildir ");
        }
    }
    
}
