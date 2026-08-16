class Solution {
    public int singleNumber(int[] nums) {

        
        int total = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[i] == nums[j] && i!=j) //
                {
                    found = true;
                }
            }
            if (!found)
            {
                return nums[i];
            }
            found = false;
        }
        return -1;
    }
}
