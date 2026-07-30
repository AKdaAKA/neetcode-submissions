class Solution {
    public int lengthOfLongestSubstring(String s) {
        int numUnique = 0;
        int longest = 0;
        String letters = "abcdefghijklmnopqrstuvwxyz1234567890!@#ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        int[] lettersFind = new int[66];
        int start = 0;
        if (s.equals(""))
        {
            return 0;
        }
        
        // if (s.contains(" "))
        // {
        //     numUnique++;
        //     longest++;
        // }

        
    for (int k = 0; k < s.length(); k++) {
        
        for (int j = k; j < s.length(); j++) {
            for (int i = 0; i < lettersFind.length; i++)
            {
                if (letters.charAt(i) == s.charAt(j))
                {
                    // System.out.println(letters.charAt(i) + " " + s.charAt(j));

                    lettersFind[i]++;
                    
                    
                    if (lettersFind[i] == 2)
                    {
                        numUnique = 0;
                        i=0;
                        lettersFind = new int[66];    
                        
                    }
                    if (lettersFind[i] == 1)
                    {
                        numUnique++;
                    }
                    
                    // System.out.println(s.charAt(j));
                    // System.out.println("");
                    
                    if (numUnique>longest)
                        longest = numUnique;
                      
                }
            }
        }
        // System.out.println("");
        //             System.out.println("");
                    numUnique = 0;
                        
                        lettersFind = new int[66];    
                        
    }
        return longest;
    }
}
