package DSA_Practice;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,5,20,8};

        int l = 0;
        int sl = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }else if(sl<arr[i]&&arr[i]!=l){
                sl=arr[i];
            }
        }
        System.out.println(l);
        System.out.println(sl);
         
    }
}
