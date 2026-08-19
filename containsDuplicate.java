import java.util.Arrays;
public class containsDuplicate {
    public static boolean containsduplicate(int [] nums)
    {
        Arrays.sort(nums);
        int left =0;
        int right =1;

        while(right<nums.length)
        {
            if(nums[left]==nums[right])
            {
                return true;

            }
            left ++;
            right++;

        }
        return false;
}
public static void main(String[] args)
{
    int nums[] = {1,2,3,4,5,5,6,7,8,9,10};
    System.out.println(containsduplicate(nums));
}
}