public class maximumSubarray {
    public static int maxSubArray(int[] nums)
    {
        int currentsum = nums[0];
        int maxSum = nums[0];
        for(int i =1;i<nums.length;i++)
        {
            currentsum = Math.max(nums[i],currentsum + nums[i]);
            maxSum = Math.max(maxSum, currentsum);


        }
        return maxSum;
    } 
    public static void main(String[] args)
    {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    
}
