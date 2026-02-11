package DSA_Practice;

public class InsertPosition {

     public static int insertUnsorted(int[] arr, int target) {
        return arr.length;
    }

    public static int searchInsert(int[] arr, int target){
        int left = 0;
        int right = arr.length;

        while(left<right){
            int mid = left+(right-left)/2;

            if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,8};
        System.out.println(searchInsert(arr, 2));
        System.out.println(insertUnsorted(arr, 4));
    }
}
