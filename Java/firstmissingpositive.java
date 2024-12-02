import java.util.Arrays;
import java.util.Scanner;


class Solution
{
    int firstMissingPositive(int[] nums)
    {
        int iCount = 1;
        Arrays.sort(nums);
        for(int iCnt = 0;iCnt<nums.length;iCnt++)
        {
           
            if(iCount == nums[iCnt])
            {
                iCount++;
            }
         
            
           
        }
        return iCount;
    }
}
public class firstmissingpositive {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();
        int[] Arr = {1,2,0};
        int iRet = 0;

        iRet = sObj.firstMissingPositive(Arr);

        System.out.println(iRet);
    }   
    
}
