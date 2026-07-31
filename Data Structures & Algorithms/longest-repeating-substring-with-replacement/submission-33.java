class Solution {
    public int characterReplacement(String s, int k) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] lettersFound = new int[26];
        ArrayList<Character> possibleChars = new ArrayList<>();
        int streak = 0;
        int maxStreak = 0;
        int kComp = k;
        
        //find possible chars
        for (int i = 0; i < s.length(); i++)
        {
            if (!possibleChars.contains(s.charAt(i))) {
                possibleChars.add(s.charAt(i));
                
            }

        }
        for (int j = 0; j < possibleChars.size(); j++){
            streak = 0;
                        kComp = k;
            for (int i = 0; i < s.length(); i++)
            {
               
                // System.out.println(s.charAt(i) + " == " + possibleChars.get(j));
                // System.out.println(streak);
                // System.out.println("max " + maxStreak);
                if (s.charAt(i) == possibleChars.get(j))
                {
                    streak++;
                    
                }
                else 
                {
// System.out.println(kComp);
// System.out.println(streak);
                    if (kComp > 0) 
                    {
//                         System.out.println(kComp);
// System.out.println(maxStreak);
                     kComp--;
                     streak++;
                    }
                    else {
                        
                        while (kComp == 0) {
                            if (s.charAt(i - streak) != possibleChars.get(j)) {
                                kComp++; 
                            }
                            streak--;
                        }
                        streak++;
                        kComp--;
                    }
                    
                }
                // System.out.println(streak);
                if (streak > maxStreak)
                {
                    maxStreak = streak;
                }
            }
            
            // System.out.println("");
        }
        return maxStreak;
    }
}
