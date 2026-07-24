class Solution {
    public int longestConsecutive(int[] nums) {
        //take num
        int streak = 1;
        int longestStreak = 0;
         HashSet<Integer> alreadyStreak = new HashSet<>();
        //find smallest num
        if (nums.length == 0)
        {
            return 0;
        }
        int smallestNum = 9999;
        for (int num :nums)
        {
            if (num < smallestNum)
            {
                smallestNum = num;
            }
    
        }
       
        
        alreadyStreak.add(smallestNum);

   //loop for each num
    boolean isStreak = false; 

    do {
    for (int i = 0; i < nums.length; i++) {
        //find num to continue streak
        for (int num : nums)    
        {
            // System.out.println(num + " " + (smallestNum+0));
            if (num == smallestNum+1) //smallest num is current streak
            {
                smallestNum = num;
                alreadyStreak.add(num);
                streak++;
            }
            else if (num == smallestNum+1)
            {
                smallestNum = num;
                alreadyStreak.add(num);
                streak++;
            }
            
        isStreak = false;
            
        }
        if (streak > longestStreak)
            longestStreak = streak;
    }
    streak = 1; 
    smallestNum = 999;   
   
         
    for (int n : nums) {
        if (n < smallestNum && !(alreadyStreak.contains(n)))
            {
                isStreak = true;
                smallestNum = n;
                alreadyStreak.add(smallestNum);
            }
        }
    System.out.println(smallestNum);
        
       
    }
    while (isStreak);

    //start anew
    // smallestNum = 999;       
    // for (int n : nums) {
    //     if (n < smallestNum && !(alreadyStreak.contains(n)))
    //         {
    //             smallestNum = n;
                
    //         }
    //     }
    //     System.out.println(smallestNum);

    return longestStreak;

}

      
    
        
    }  


