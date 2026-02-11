package DSA_Practice;

public class Find_Pair_with_Given_Sum {
    public static void main(String[] args) {
        
        int [] arr = {2,4,7,8};
        int target = 15;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("pair found: " + arr[i]+ ", "+ arr[j]);
                    return;
                }
            }
        }
        System.out.println("no pair found");
    }
}
