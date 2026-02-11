package DSA_Practice;

public class Fibonacci_checker_code {

    public static boolean isFibonacci (int n){
        if(n<0){
            return false;
        }
        if(n==0||n==1){
            return true;
        }

        int a=0;
        int b=1;

        while(b<n){
            int temp = a+b;
            a=b;
            b=temp;
        }
        return b==n;
    }
    public static void main(String[] args) {
        System.out.println(isFibonacci(5));
    }
}
