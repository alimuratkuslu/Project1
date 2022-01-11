import java.util.Scanner;

public interface Faktoriyel {

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int totaln = 1;
        int totalr = 1;
        int totalm = 1;
        int n;
        int r;

        System.out.println("n sayısını giriniz: ");
        n = inp.nextInt();

        for(int i = 1; i <= n;i++){
            totaln = totaln * i;
        }
        System.out.println("r sayısını giriniz: ");
        r = inp.nextInt();

        for(int i = 1; i<=r;i++){
            totalr = totalr * i;
        }
        for(int i = 1; i <= n-r;i++){
            totalm = totalm *i;
        }

        int kombinasyon = totaln / (totalr * (totalm));

        System.out.println("Cevap: "+ kombinasyon);


    }
    
}
