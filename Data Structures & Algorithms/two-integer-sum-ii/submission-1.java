class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int firstNum = 0;
        for (int i = 0; i< numbers.length; i++) //each num 
        {
            firstNum = numbers[i];
            System.out.print(firstNum + " ");
            //add to ever other num from i
            for (int  j = i; j < numbers.length; j++)
            {
                if (numbers[j]>firstNum)//must be greater
                {
                    if (numbers[j]+firstNum == target)
                    {
                        answer[0] = i+1;
                        answer[1] = j+1;
                    }
                }
            }
            System.out.println("");
        }
        return answer;
    }
}
