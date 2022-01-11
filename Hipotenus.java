import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args){

        int a,b;
        double c;

        Scanner inp = new Scanner(System.in);
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextDouble();

        double u = (a + b + c) / 2;

        double alan;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı: " + alan);

    }
    
}
