import java.util.Scanner;

public class ders {
    public static void main(String[] args){

        int mat,fizik,turkce,kimya,muzik;
        int gecmenotu = 55;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        double average = 0;

        if(mat < 0 || mat > 100){
            average = (fizik + turkce + kimya + muzik) / 4;
        }
        if(fizik < 0 || fizik > 100){
            average = (mat + turkce + kimya + muzik) / 4;
        }
        if(turkce < 0 || turkce > 100){
            average = (mat + fizik + kimya + muzik) / 4;
        }
        if(kimya < 0 || kimya > 100){
            average = (mat + turkce + fizik + muzik) / 4;
        }
        if(muzik < 0 || muzik > 100){
            average = (mat + turkce + kimya + fizik) / 4;
        }

        if(average <= gecmenotu){
            System.out.println("Sınıfta kaldınız");
            System.out.println(average);
        }
        else{
            System.out.println("Sınıfı geçtiniz ");
            System.out.println(average);
        }

        

        

        
    }
    
}
