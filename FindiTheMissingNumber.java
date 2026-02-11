package DSA_Practice;

public class FindiTheMissingNumber {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,6};
        int n = a.length+1;
        int total_Sum = n*(n+1)/2;

        int sum = 0;
        for(int i=0; i<a.length; i++)
        {
            sum = sum+a[i];
        }
        System.out.println("Missing number in array :" + (total_Sum - sum));
    }
}
