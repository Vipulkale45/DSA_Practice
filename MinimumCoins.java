package DSA_Practice;

public class MinimumCoins {

    public static int minCoins(int amount){
        if(amount<=0){
            return 0;
        }

        if(amount==1 || amount==3){
            return -1;
        }

        int coinsOF5 = amount/5;
        int remainder = amount%5;


        if(remainder%2==0){
            int coinsOF2 = remainder/2;
            return coinsOF5+coinsOF2;
        }
        else{
            if(coinsOF5>0){
                coinsOF5--;
                remainder+=5;
                int coinsOF2 = remainder/2;
                return coinsOF5+coinsOF2;
            }else{
                return-1;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println(minCoins(11));;
    }
}
