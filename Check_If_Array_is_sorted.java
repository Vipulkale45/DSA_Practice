package DSA_Practice;

public class Check_If_Array_is_sorted {

    public static boolean isSorted(int[] arr ){
        if(arr==null || arr.length<=1){
            return true;
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,1,2,3,4};
        System.out.println("arr1 is sorted " + isSorted(arr1));
    }
}
