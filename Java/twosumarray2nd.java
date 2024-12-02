import java.util.Arrays;

class Solution {
    public void twoSum(int[] numbers, int target) {

        int Start = 0;
        int End = numbers.length-1;
        int[] Res = new int[2];
        while(Start<=End)
        {
            int Finder = target - numbers[Start];
            int iRet = answer(numbers,Start+1,End,Finder);
            if(numbers[iRet] == Finder)
            {
                Res[0] = Start+1;
                Res[1] = iRet+1;
                break;
            }
            Start++;    
        }

        System.out.println(Arrays.toString(Res));
          
    }

    public int answer(int[] numbers,int Start,int End,int Find)
    {
        int Mid = 0;
        while(Start<=End)
        {
                Mid = Start + End;
                Mid = Mid/2;
            
                if(Find < numbers[Mid])
                {
                    End = Mid-1;
                }
                else if(Find > numbers[Mid])
                {
                    Start = Mid+1;
                }
                else if(Find == numbers[Mid])
                {
                    return Mid;
                }   
        }
        

        return Mid;
    }
}

public class twosumarray2nd {
    public static void main(String[] args) {
        
        Solution obj = new Solution();

        int[] Arr = {5,25,75};
        obj.twoSum(Arr,100);


    }
    
}
