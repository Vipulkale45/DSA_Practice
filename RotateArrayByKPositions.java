package DSA_Practice;

import java.util.Arrays;

public class RotateArrayByKPositions {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int k=2;
        for(int i=0; i<k; i++){
            int temp=a[0];
            for(int j=1; j<a.length; j++){
                a[j-1] = a[j];
            }
            a[a.length-1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
