package DSA_Practice;

public class MaximumSubArraySum {
    
    public static int maxSubArray(int [] nums){
        int sum=0;
        int max_Sum = nums[0];

        for(int i=0; i<nums.length; i++){
            sum =sum+nums[i];

            if(sum>max_Sum){
                max_Sum = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max_Sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
        
    }
}
