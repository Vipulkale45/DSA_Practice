package DSA_Practice;

import java.util.Arrays;

public class MoveAllZeroEnd {
    public static void main(String[] args) {
         int[] a = {5,8,0,6,0,9,7,0,2};

        int j = 0;   // non-zero position

        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(a));
        
    }
}
