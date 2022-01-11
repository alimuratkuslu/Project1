import java.util.Scanner;

public class For {
    public static void main(String[] args){
        int n,k;
        int total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        n = inp.nextInt();
        System.out.println("Üst olacak sayı: ");
        k = inp.nextInt();

        for(int i = 1; i < k+1; i++){
            total = total * n;
        }

        System.out.println("Total: " + total);


    }
}
