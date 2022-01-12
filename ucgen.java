import java.util.Scanner;

public class ucgen {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size;
        Character c;

        System.out.println("Basamak Sayısı : ");
        size = sc.nextInt();

        int i, j, k;

        for (i = size; i > 0; i--) {
            for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
