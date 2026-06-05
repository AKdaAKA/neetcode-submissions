class Solution {
    public boolean hasDuplicate(int[] nums) {
        int temp = 0;
        for (int i = 0; i<nums.length; i++)
        {
            temp = i;
            System.out.println(nums[temp]);
             for (int j = 0; j<nums.length; j++)
                {
                    if (nums[temp] == nums[j] && temp != j)
                    {
                        return true;
                    }
                }
        }
        return false;
    }
}