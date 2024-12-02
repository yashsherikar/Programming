import java.util.Arrays;
import java.util.Scanner;


class Solution
{
    int[][] transpose(int[][] matrix)
    {
        int temp = matrix[0].length;
        int temp1 = matrix.length;
        int[][] iResult = new int[temp][temp1];

        for(int iCnt = 0;iCnt<temp;iCnt++)
        {
          for(int iCntX = 0;iCntX<temp1;iCntX++)
          {
            iResult[iCnt][iCntX] = matrix[iCntX][iCnt];
          }
           
        }
       
        return iResult;
    }
}
public class transposematrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();
        int[][] Arr = {{1,2,3},{4,5,6}};

        int[][] iRet = sObj.transpose(Arr);

        for(int iCnt = 0;iCnt<iRet.length;iCnt++)
        {
          for(int iCntX = 0;iCntX<iRet[iCnt].length;iCntX++)
          {
            System.out.print("\t"+iRet[iCnt][iCntX]);
          }
           System.out.println();
        }
        
    }   
    
}
