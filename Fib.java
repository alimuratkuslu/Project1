public class Fib {

    static int fib(int x){
        if(x == 0 || x== 1){
            return 1;
        }
        return fib(x - 1) + fib(x-2);
    }
    public static void main(String[] args){
        System.out.println(fib(8));
    }
}
