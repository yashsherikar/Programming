import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Solution
{
    List<Integer> transpose(int[] num,int k)
    {

        List<Integer> Result = new ArrayList<>();
        
        int iValue= 0;
        for(int iCnt = 0;iCnt<num.length;iCnt++)
        {
            iValue = iValue*10+num[iCnt];
           
        }
        System.out.println(iValue);
        iValue = iValue + k;

        while (iValue != 0) 
        {
            int temp = iValue%10;
            Result.add(temp);
            iValue = iValue/10;
            
        }
        Collections.reverse(Result);

        return Result;
    }
}
public class addtoarrayfromofinteger {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();

        int[] Arr = {9,9,9,9,9,9,9,9,9,9};

        List<Integer> iRet = sObj.transpose(Arr,34);

        

        System.out.println(iRet);
    }   
    
}
