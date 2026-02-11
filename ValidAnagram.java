package DSA_Practice;
import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t){
        
        char[] sChar = s.toCharArray();
        char[] tChar = s.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 ="nagaram";
        System.out.println(isAnagram(s1, t1));
    }
}
