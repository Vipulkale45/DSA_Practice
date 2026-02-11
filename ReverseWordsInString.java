package DSA_Practice;

public class ReverseWordsInString {

    public static String reverseWords(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            ans.append(words[i]).append(" ");
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        String test1 = "the sky is blue";
        String test2 = "  hello world  ";
        String test3 = "a good   example";

        System.out.println("Input: \"" + test1 + "\" → \"" + reverseWords(test1) + "\"");
        System.out.println("Input: \"" + test2 + "\" → \"" + reverseWords(test2) + "\"");
        System.out.println("Input: \"" + test3 + "\" → \"" + reverseWords(test3) + "\"");
        
    }
}
