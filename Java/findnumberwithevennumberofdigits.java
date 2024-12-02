import java.util.Arrays;
import java.util.Scanner;


class Solution
{
    int findNumbers(int[] nums)
    {
        int iCount = 0,EvenCount = 0;
        for(int iCnt = 0;iCnt<nums.length;iCnt++)
        {
           iCount = 0;
           while(nums[iCnt] != 0)
           {
                nums[iCnt] = nums[iCnt]/10;
                iCount++;

           }
        if((iCount % 2) == 0)
        {
            EvenCount++;
        }
           
        }
        return EvenCount;
    }
}
public class findnumberwithevennumberofdigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();
        int[] Arr = {437,315,322,431,686,264,442};
        int iRet = 0;

        iRet = sObj.findNumbers(Arr);

        System.out.println(iRet);
    }   
    
}
