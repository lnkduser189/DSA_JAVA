public class LinearSearch {
    public static void main(String[] arrgs)
    {
        int [] arr={1,2,3,4,5,6};
        int target = 3;
        boolean found = false;

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                found = true ;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element found in the array");
        }
        else
        {
            System.out.println("Element not found in the array");
        }
    }
    
}
