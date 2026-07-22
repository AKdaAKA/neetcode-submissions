class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int[] numFind = {1,2,3,4,5,6,7,8,9};
        int[] numOccurRow = new int[9];
        int[] numOccurCol = new int[9];
        int[] numOccurGrid = new int[9];
        int colCheck = 0;
        int rowCheck = 0;
        int gridCheck = 0;




        //CHECK ROW
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                for (int num : numFind)
                {
                    // System.out.println(num + " " + board[rowCheck][j]);
                    if (num == board[rowCheck][j]- '0')
                    {
                        numOccurRow[(board[rowCheck][j]- '0')-1]++;
                        if (numOccurRow[(board[rowCheck][j]- '0')-1] > 1)
                            return false;
                    }
                    
                }
               
               }
                numOccurRow = new int[9];        
                rowCheck++;

            //    System.out.print(board[i][j] + " ");
            // System.out.print(board[0][0] + " ");
               
            }




        //CHECK COL

        for (int j = 0; j <9; j++) {
            for (int i = 0; i < board.length; i++)
                {
           
             for (int num : numFind)
                {
                    // System.out.println(num + " " + board[i][colCheck]);
                    if (board[i][colCheck]-'0' == num)
                    {
                        
                        numOccurCol[(board[i][colCheck]- '0')-1]++;
                        if (numOccurCol[(board[i][colCheck]- '0')-1] > 1)
                            return false;
                    }
                }
               
            }
           numOccurCol = new int[9];        
               colCheck++;
            }
             
         //CHECK GRID 3x3

        int startRowIterator = 0;
        int endRowIterator = 3;
        int startColIterator = 0;
        int endColIterator = 3;

    for (int s = 0; s < 9; s++) {
        for (int i = startColIterator; i <endColIterator; i++){

            for (int j = startRowIterator; j < endRowIterator; j++){
               
                    System.out.print(board[i][j] + " ");
                for (int num : numFind)
                {
                    // System.out.println(num + " " + board[rowCheck][j]);
                    if (num == board[i][j]- '0')
                    {
                        numOccurGrid[(board[i][j]- '0')-1]++;
                        if (numOccurGrid[(board[i][j]- '0')-1] > 1)
                            return false;
                    }
                    
                }
            }
            // System.out.println(""); 
        }
        // System.out.println(""); 
        //move to next block left
                startRowIterator+=3; 
                endRowIterator+=3;
                numOccurGrid = new int[9];
                if (endRowIterator == 12)
                {
                    //move next block down
                    startColIterator+=3;
                    endColIterator+=3;
                    // System.out.println("dfdrfgdfgdfgdfgdfgdfsdfdfssdfsdf"); 
                    startRowIterator = 0;
                    endRowIterator = 3;
                }
    }

            return true;   
        }
}
