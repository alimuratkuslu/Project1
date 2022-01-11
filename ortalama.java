import java.util.Scanner;

public class ortalama{
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik;
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notu: ");
        mat = inp.nextInt();

        System.out.println("Fizik Notu: ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notu: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notu: ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notu: ");
        tarih = inp.nextInt();
        
        System.out.println("Muzik Notu: ");
        muzik = inp.nextInt();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;

        System.out.println("Ortalamanız: " + ort);
        System.out.println(ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");





        




    }
}