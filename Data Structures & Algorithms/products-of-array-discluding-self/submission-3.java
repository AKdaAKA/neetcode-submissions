class Solution {
    public int[] productExceptSelf(int[] nums) {
            //sum = 0
            int[] sums = new int[nums.length];
            int notNum = nums[0];
            int index = 0;
                //not notNum is 24
            //for i till sums.length 
            for (int i = 0; i < sums.length; i++) {      
              
                // if ((i+1) != nums.length-1) { //avoid index i but dont overflow
                //     index = i+1;
                // }
                // else {
                //     index = 0;
                // }
              
                for (int j = 0; j < nums.length; j++) // at each index
                {
                    if (j == 0) {
                        sums[i] = 1;
                        
                    }
                    if (j != i) {
                        //index nums to multiply System.out.println("index nums" + j);
                       
                      
                        
                        sums[i]*=nums[j];    
                       
                    }

                    
                }
                 
        }
        return sums; 
    }
}

