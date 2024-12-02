import java.util.Arrays;
import java.util.Scanner;


class Solution
{
    int largestAltitude(int[] gain)
    {
        int[] Result = new int[gain.length+1];
        int iMax = 0;

        Result[0] = iMax; 
        for(int iCnt = 0;iCnt<gain.length;iCnt++)
        {
          Result[iCnt+1] = Result[iCnt] + gain[iCnt];

        if(iMax  < Result[iCnt+1])
        {
            iMax = Result[iCnt+1];
        }
        }
      
        return iMax;
    }
}
public class findthehighestaltitude {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();

        int iRet = 0;
       int[] Arr = {-5,1,5,0,-7};

       iRet = sObj.largestAltitude(Arr);

       System.out.println(iRet);


    }
    
}
