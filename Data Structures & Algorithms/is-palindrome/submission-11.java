class Solution {
    public boolean isPalindrome(String s) {
        char[] palindromeNorm = new char[s.length()];
        char[] palindromeStuff = new char[s.length()];
        int iterator = 0;
        int otherIterator = 0;
        for (int i = 0; i < s.length(); i++)
        {
            
            if (!(s.charAt(i) == ':' || s.charAt(i) == '\'' || s.charAt(i) == ' ' || s.charAt(i) == '!' || s.charAt(i) == '?'|| s.charAt(i) == '.'|| s.charAt(i) == ','))
            {
                palindromeNorm[otherIterator] = s.charAt(i);
                otherIterator++;
            }
        }
        for (int i = s.length()-1; i >= 0; i--)
        {
            
            if (!(s.charAt(i) == ':' || s.charAt(i) == '\'' || s.charAt(i) == ' ' || s.charAt(i) == '!' || s.charAt(i) == '?'|| s.charAt(i) == '.'|| s.charAt(i) == ','))
            {
                palindromeStuff[iterator] = s.charAt(i);
                //cat
                System.out.println(palindromeStuff[iterator]);
                iterator++;
            }
        }


        String normString = String.valueOf(palindromeNorm).toLowerCase();
        String palinString = String.valueOf(palindromeStuff).toLowerCase();

        System.out.println(normString +  " " + palinString);
        if (normString.equals(palinString))
        {
            return true;
        }

        return false;
    }
}
