class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();

        if (s1Len > s2Len)
        {
            return false;
        }

        int[] s1Count = new int[26];
        int[] partCount = new int[26];

        for (int i = 0; i < s1Len; i++) //check the first 3 letters
        {
            s1Count[s1.charAt(i) - 'a']++; //increase counts 
            partCount[s2.charAt(i) - 'a']++;
        }
        //check if they match that PART of permutation
        if (Arrays.equals(s1Count, partCount)) 
            return true;
            
         for (int i = s1Len; i < s2Len; i++) {
            partCount[s2.charAt(i) - 'a']++;    //move count by increasing by one       
            partCount[s2.charAt(i - s1Len) - 'a']--;      //moving starting of partCount right

            if (Arrays.equals(s1Count, partCount)) return true;
        }

        return false;    

    }
}
