package DSA_Practice;

public class RotateString {

    public static boolean rotateString(String s, String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).indexOf(goal)>=0;
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String g1 = "cdeab";

        String s2 = "abcde";
        String g2 = "abced";

        System.out.println("Input: " + s1 + ", " + g1 + " → " + rotateString(s1, g1));
        System.out.println("Input: " + s2 + ", " + g2 + " → " + rotateString(s2, g2));
}
}