class Solution {

    public String encode(List<String> strs) {
        //for each string
        
        // for (int i =0; i< strs.length; i++)
        // {

        // }
        String encodedStr = "";
        for (int i = 0; i < strs.size(); i++)
        {
            encodedStr = (encodedStr + strs.get(i).length() + "#" + strs.get(i)); 

        }
        // String encodedStr = String.join(",", strs);
        
        return encodedStr;

    }

    public List<String> decode(String str) {
         List<String> list = new ArrayList<>();
       int pos = 0;
        while (pos < str.length())
        {
            int hashIndex = str.indexOf("#", pos); //get index of #
            String lengthStr = str.substring(pos, hashIndex); //get number stil string cause substring
            int length = Integer.parseInt(lengthStr); //make it an int
            pos = hashIndex + 1 + length;
            
            list.add(str.substring(hashIndex+1, pos));

          
        }
        
 
       
        return list;
    }
}
