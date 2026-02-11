package DSA_Practice;

public class ReverseString {

    public static void reverseString(char[]s){
        int left =0, right = s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] arr ={'h','e','l','l','o'};
        reverseString(arr);
        System.out.println("reverse string");
        for(char c:arr){
            System.out.println(c);
        }
    }
}
