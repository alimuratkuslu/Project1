import java.util.Scanner;

public class Min {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int kac;
        int sayi;

        System.out.println("Kaç tane sayı giriceksiniz: ");
        kac = inp.nextInt();
        int[] arr = new int[kac];

        for(int i = 1; i < kac+1;i++){
            System.out.println(i + ". sayıyı giriniz: ");
            sayi = inp.nextInt();
            arr[i-1] = sayi;


        }
        int min = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j+1] < arr[j]){
                    min = arr[j+1];
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length;j++){
                if(arr[j] > arr[i]){
                    max = arr[j];
                }
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


    }
    
}
