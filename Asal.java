public class Asal {
    public static void main(String[] args){

        int i = 0;
        int num = 0;

        String asal = "";

        for(i = 1; i <= 100;i++){
            int counter = 0;
            for(num = i; num >=1; num--){
                if(i % num == 0){
                    counter += 1;
                }
            }
            if(counter == 2){
                asal = asal + i + " ";
            }
        }
        System.out.println(asal);
    }
}
