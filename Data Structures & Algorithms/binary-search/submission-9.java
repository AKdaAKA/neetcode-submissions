class Solution {
    public int search(int[] nums, int target) {

        int middle = nums.length/2;

        int middleNum = nums[nums.length/2];

        int low = 0;

        int lowNum = nums[0];

        int high = nums.length-1;

        int highNum = nums[nums.length-1];

        int i = 0;
 
        while (low <= high) {
        if (middleNum<target)
        {
            if (middle+1 < nums.length) {
                low = middle+1;
                lowNum = nums[middle+1];
            }
            else
            {
                return -1;
            }
            

            if (((high+low)/2) == 0)
            {
                if (lowNum == target)
                {
                    return low;
                }
                if (highNum == target)
                {
                    return high;
                }
                else
                {
                    return -1;
                }
            }
            else {
                middleNum = nums[(high+low)/2];
                middle = (high+low)/2;
            }
        }
        else if (middleNum>target)
        {
           
            if (middle < 0) {
                high = middle-1;
                highNum = nums[middle-1];
            }
            else
            {
                high = middle;
                highNum = nums[middle];
            }

            if (((high - low)/2) == 0)
            {
                if (lowNum == target)
                {
                    return low;
                }
                if (highNum == target)
                {
                    return high;
                }
                else
                {
                    return -1;
                }
            }
            else {
                middleNum = nums[(high+low)/2];
                middle = (high+low)/2;
            }
        }
        if (nums[middle] == target)
        {
            return middle;
        }
        
        }
        return -1;
    }
    
}
