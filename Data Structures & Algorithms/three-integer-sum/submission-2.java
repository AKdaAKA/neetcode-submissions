class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> resultList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length; j++)
            {
                for (int k = j; k < nums.length; k++)
                {
                    if (nums[i] + nums[j] + nums[k] == 0 && (i!=j) && (j!=k) && (i!=k))
                    {
                        if (!(resultList.contains(List.of(nums[i],nums[j],nums[k])) || 
                        resultList.contains(List.of(nums[j],nums[i],nums[k])) ||
                        resultList.contains(List.of(nums[i],nums[k],nums[j])) ||
                        resultList.contains(List.of(nums[k],nums[i],nums[j])) ||
                        resultList.contains(List.of(nums[i],nums[j],nums[k])) ||
                        resultList.contains(List.of(nums[j],nums[k],nums[i]))))
                            resultList.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                        
                    }
                }
            }
        }
        return resultList;
    }
}
