import java.util.Scanner;


class Solution
{
    int setZeroes(int[] matrix,int Target)
    {
        int Start = 0;
        int End = matrix.length;
        int Mid=0;

        while(Start < End)
        {   
            Mid = Start+End;
            Mid = Mid/2;

            if(Target >= matrix[Mid])
            {
                if(matrix[Mid] == Target)
                {
                    return matrix[Mid];
                }
                Start = Mid+1;
            }
            else if(Target <= matrix[Mid])
            {
                if(matrix[Mid] == Target)
                {
                    return matrix[Mid];
                }
                End = Mid - 1;

            }
            
        }
      
        return matrix[End-1];
    }

}
public class floorofanumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();

        int[] Arr = {2,3,5,9,14,16,18};

       int iRet = sObj.setZeroes(Arr,4);
       System.out.println(iRet);

        

    }   
    
}