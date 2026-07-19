class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      

        
        int[] arrayLongest = new int[nums.length];
        int[] finalValues = new int[k];
        //for arrayGreat to j
        for (int j = 0; j < arrayLongest.length; j++) {
            //for to num i
            for (int i = 0; i < nums.length; i++){
                // nums at j is temp
                if (nums[j] == nums[i])
                {
                    
                    arrayLongest[j]++;
                   
                }
                // if nums at j  found at nums at i
                    // arrayLongest[j]++;
            }
        }
    //for finalValues to j
        //for arrayLongest to i
        int temp = 0;
        int anodaTemp;
   for (int i = 0; i < k; i++) {   //each k final value   
        
       for (int j = 0; j < arrayLongest.length; j++) { //find greatest value compared to temp
            if (arrayLongest[temp] < arrayLongest[j]) {
                temp = j; //this is where greatest vlaue is
            }
       }
       finalValues[i] = nums[temp]; //set for first value greatest
       arrayLongest[temp] = 0;
        for (int j = 0; j < arrayLongest.length; j++) {
            
            if (nums[j] == nums[temp]) {
                
                arrayLongest[j] = 0;
                
            }
            System.out.println(arrayLongest[j]);
        }
        // System.out.println(Arrays.toString(arrayLongest));
    //     temp = arrayLongest[0];
    //     for (int j = 0; j < arrayLongest.length; j++) {
    //         if (temp < arrayLongest[j]) {
    //             temp = arrayLongest[j];
    //         }
    //    }
    //     finalValues[1] = nums[temp];
   }
        return finalValues;
    }
}
