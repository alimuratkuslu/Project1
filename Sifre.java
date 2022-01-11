import java.util.Scanner;
public class Sifre {
    public static void main(String[] args){

        String username, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        username = inp.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız! ");
        }
        else{
            String degistir;
            System.out.println("Şifrenizi yenilemek ister misiniz ? ");
            degistir = inp.nextLine();

            if(degistir.equals("evet")){
                System.out.println("Yeni şifreyi giriniz: ");
                password = inp.nextLine();
                System.out.println("Yeni şifre oluşturuldu! ");
            }

        }


    }
}
