class Solution {
    public int missingNumber(int[] nums) {
        //3, 0 , 1
        //

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
        {
            
            
            if (nums[0] != 0)
            {
                return 0;
            }
            if (i+1 < nums.length) {
            if (nums[i]+1 != nums[i+1]) //1 != 2
            {
                return nums[i]+1;
            }
            
            }
            //1 2 3
            //0
        }
        return nums[nums.length - 1]+1;
    }
}
