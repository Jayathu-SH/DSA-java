public class Demo
{
  public static void main(String[] args)
   {
     int nums[] = new int[1000];
     int target = 900;

     int result1 = linearSearch(nums, target);
     int result2 = binarySearch(nums, target, 0, nums.length-1);

     if(result1 != -1)
       System.out.println("Element found at index (linear search): " + result1);
     else
       System.out.println("Element not found in linear search");

     if(result2 != -1)
       System.out.println("Element found at index (binary search): " + result2);
     else
       System.out.println("Element not found in binary search");
   } 
   
   public static int linearSearch(int[] nums, int target){
     int steps = 0;

     for (int i = 0; i < nums.length; i++) {
       steps++;
       if(nums[i] == target){
         System.out.println("Steps taken by linear search: " + steps);
         return i;
       }
     }
     System.out.println("Steps taken by linear search: " + steps);
     return -1;
   }

   public static int binarySearch(int[] nums, int target, int left, int right){
     int steps = 0;
    // int left = 0;
    // int right = nums.length - 1;



    if(left <= right){
        int mid = (left + right) / 2;
        if(nums[mid] == target) 
            return mid;
           else if(nums[mid] < target) 
            return binarySearch(nums, target, mid+1, right);
           else 
          return binarySearch(nums, target, left, mid-1);
    }









    /*  while (left <= right) { 
       steps++;
       int mid = (left + right) / 2;

       if(nums[mid] == target) {
         System.out.println("Steps taken by binary search: " + steps);
         return mid;
       } else if(nums[mid] < target) {
         left = mid + 1;
       } else {
         right = mid - 1;
       }
     }
     System.out.println("Steps taken by binary search: " + steps);*/
     return -1;
   }
}
