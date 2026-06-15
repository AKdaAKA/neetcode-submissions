class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tempIterator = 0;
        int temp = nums[tempIterator];
        
        int[] arr = new int[2]; 

   for (int j =0; j < nums.length; j++) {
        for (int i =0; i < nums.length; i++)
        {
            temp = nums[tempIterator];
            if ((temp+nums[i]) == target && (i != tempIterator)) 
            {
                arr[0] = tempIterator;
                
                arr[1] = i;
                return arr;
            }      
        }
        System.out.println(tempIterator);
        tempIterator++;
    }
return arr;
 }
  
}
