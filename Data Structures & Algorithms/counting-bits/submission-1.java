class Solution {
    public int[] countBits(int n) {
        // 4/2 == 2 R 0
        //2 / 2 == 1 R 0
        //1 / 2 == 0 R 1
        int[] total = new int[n+1];
        int j = 0;
        int binary = 0;
        for (int i = 0; i <= n; i++)
        {
            j = i;
          while (j > 0) {
            if (j % 2 == 1)
            {
                j/=2;
                binary++;
            }  
            else {
                j/=2;
            }
            
          }
          total[i] = binary;
          binary = 0;
        }
        return total;

    }
}
