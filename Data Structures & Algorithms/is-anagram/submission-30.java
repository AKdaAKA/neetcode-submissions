class Solution {
    char temp;
    public boolean isAnagram(String s, String t) {
    
     String letters = "abcdefghijklmnopqrstuvwxyz";

        int[] charCountersS = new int[26];
        int[] charCountersT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++){
                //a
            if(letters.charAt(j) == s.charAt(i))
            {
                charCountersS[j]++; 
            } 
         }
        }
        for (int i = 0; i < t.length(); i++) {//for each char
            for (int j = 0; j < 26; j++){ //all 26 chars
           if(letters.charAt(j) == t.charAt(i))
           {
             charCountersT[j]++; 
           } 
         }
        }
        if (Arrays.equals(charCountersS, charCountersT))
        {
               System.out.println("charCountersS: " + Arrays.toString(charCountersS));
System.out.println("charCountersT: " + Arrays.toString(charCountersT));
            return true;
        }
        System.out.println("charCountersS: " + Arrays.toString(charCountersS));
System.out.println("charCountersT: " + Arrays.toString(charCountersT));
        return false;


    
    }
}
