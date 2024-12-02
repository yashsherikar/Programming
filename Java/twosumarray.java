import java.util.Arrays;

class Solution {
    public void twoSum(int[] numbers, int target) {

        int Start = 0;
        Arrays.sort(numbers);
        int End = numbers.length-1;
        int[] Res = new int[2];
        while(Start<=End)
        {
            int Finder = target - (numbers[Start]);
            int iRet = answer(numbers,Start+1,End,Finder);
            if(numbers[iRet] == Finder)
            {
                Res[0] = Start;
                Res[1] = iRet;
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

public class twosumarray {
    public static void main(String[] args) {
        
        Solution obj = new Solution();

        int[] Arr = {-1,-2,-3,-4,-5};
        obj.twoSum(Arr,-8);


    }
    
}
