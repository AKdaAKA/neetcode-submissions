class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int firstNum = 0;
        for (int i = 0; i< numbers.length; i++) //loop for each num 
        {
            firstNum = numbers[i]; //set first num for comparison 
            //[1,2,3,4]
            //[1] first run
            

            //starting from first num to every other num
            //[-,2,3,4] use 1 as firstNum compare to rest nums
            //[-,-,3,4] use 2 as firstNum compare to rest nums

            for (int  j = i; j < numbers.length; j++) 
            {
                //[1,2,3,4]
                //[2>1]
                if (numbers[j]>firstNum) //must be greater
                {
                    //[2+1 == 3]
                    if (numbers[j]+firstNum == target) 
                    {
                        answer[0] = i+1; //give postion of firstNum
                        answer[1] = j+1; //give position of numbers[j]
                    }
                }
            }
        }
        return answer;
    }
}
