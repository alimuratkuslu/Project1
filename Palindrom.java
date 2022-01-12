public class Palindrom {

    static boolean isPalindrom(int x){
        int temp = x, reverseNumber = 0, lastNumber;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }

        if(x == reverseNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        System.out.println(isPalindrom(247));
        System.out.println(isPalindrom(101));
        System.out.println(isPalindrom(99));


    }
}
