package DSA_Practice;
public class NearestPrimeNumber {

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        int n=20;

        if(isPrime(n)){
            System.out.println(n);
            return;
        }
        int i=1;
        while(true){
            if(isPrime(n-1)){
                System.out.println(n-i);
                break;
            }
            if(isPrime(n+1)){
                System.out.println(n+i);
                break;
            }
            i++;
        }
    }
}
