class Solution {
    public int maxArea(int[] heights) {
        int greatest = 0;
        int greatJ = 0;
        int greatI = 0;
        
        for (int i = 0; i < heights.length; i++)
        {
            for (int j = i; j < heights.length; j++)
            {
               if ((j-i)*heights[i]>greatest)
               {
                System.out.println(greatest);
                if (heights[i] != heights[j]) {
                    if (heights[i]-heights[j]>0)
                    {
                         if ((j-i)*heights[j]>greatest)
                        {
                        greatest = (j-i)*heights[j];
                        greatJ = heights[j];
                        greatI = heights[i];
                        }
                    }
                    else
                    {
                        greatest = (j-i)*heights[i];
                        greatJ = heights[j];
                        greatI = heights[i];
                    }
                }
                else {
                    
                    greatest = (j-i)*heights[i];
                    greatJ = heights[j];
                    greatI = heights[i];
                }
               }
            }
        }
       
        return greatest;
               
        
        
    }
}
