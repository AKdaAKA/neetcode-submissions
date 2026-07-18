class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int[][] letterOccur = new int[strs.length][26];
       List<List<String>> list = new ArrayList<>();
       List<String>[] innerList = new ArrayList[strs.length];
       for (int i = 0; i < strs.length; i++) {
            innerList[i] = new ArrayList<>();
        }
  for (int r = 0; r < strs.length; r++) //each string
    {
        for (int i = 0; i < strs[r].length(); i++) //each letter
        {
            for  (int j = 0; j < 26; j++){ //each alphabet
                if (strs[r].charAt(i) == (letters.charAt(j))) //if match letter in alphabet
                    {
                        letterOccur[r][j]++; //found that letter increment
                    }
                }
        }
    }
    //  int tempIterator = 0;
    // int[] tempLettOccur = letterOccur[tempIterator]; 
    // for (int j = 0; j < strs.length; j++) { // for each temp word
    //     for (int i = 0; i < strs.length; i++) { //for each word
    
    //         if ((Arrays.equals(letterOccur[i], letterOccur[j]) && (j != i))) {
    //         System.out.println(Arrays.toString(letterOccur[i]) + " equal " + Arrays.toString(tempLettOccur));
    //         innerList.add(strs[i]);
    //         innerList.add(strs[j]);
    //         }
    //         // System.out.println(Arrays.toString(letterOccur[i]) + " equal " + Arrays.toString(tempLettOccur));
                
        
    //     }
    // }

    //     list.add(innerList);

    //  System.out.println(Arrays.deepToString(letterOccur)); //prints each word
boolean[] grouped = new boolean[strs.length];

   for (int tempIterator = 0; tempIterator < strs.length; tempIterator++) {
     if (!grouped[tempIterator]) {
        innerList[tempIterator].add(strs[tempIterator]);
        grouped[tempIterator] = true;
     }
    for (int j = 0; j < strs.length; j++) {
        if (!grouped[j]) {
             
        if (Arrays.equals(letterOccur[j], letterOccur[tempIterator]) && (j!=tempIterator))
        {
            System.out.println(Arrays.toString(letterOccur[j]));
            
            innerList[tempIterator].add(strs[j]);
            grouped[j] = true;
          

            System.out.println("i " + strs[0]);
            System.out.println("j " + strs[j]);
        }
    }
    
}   
            if (!innerList[tempIterator].isEmpty())
                list.add(innerList[tempIterator]);
          }
        return list;
       
      
    }
}
