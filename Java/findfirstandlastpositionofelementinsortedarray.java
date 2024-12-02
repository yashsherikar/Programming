import java.util.Arrays;
import java.util.Scanner;


class Solution
{
    int[] Display(int[] matrix,int Target)
    {
      
        int[] ans = {-1,-1};
        ans[0] = Search(matrix,Target,true);
        if(ans[0] != -1)
        {
            ans[1] = Search(matrix, Target, false);
        }
      
      
        return ans;
    }
    int Search(int[] matrix,int Target,boolean check)
    {
        int Start = 0;
        int ans = -1;
        int End = matrix.length-1;
        int Mid=0;
        while(Start <= End)
        {   
            Mid = Start+End;
            Mid = Mid/2;

            if(Target > matrix[Mid])
            {
                
                Start = Mid+1;
            }
            else if(Target < matrix[Mid])
            {
                
                End = Mid - 1;

            }
            else
            {
                ans = Mid;
                if(check)
                {
                    End = Mid-1;
                }
                else
                {
                    Start = Mid+1;
                }
            }
           
        }
        return ans;
    }

}
public class findfirstandlastpositionofelementinsortedarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();

        int[] Arr = {5,7,7,8,8,10};

       int[] iRet = sObj.Display(Arr,8);
       System.out.println(Arrays.toString(iRet));

        

    }   
    
}