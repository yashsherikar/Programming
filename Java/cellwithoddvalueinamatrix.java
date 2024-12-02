import java.util.Scanner;


class Solution
{
    int oddCells(int m,int n,int[][] indices)
    {
        int[][] Result = new int[m][n];
        for(int iCnt = 0;iCnt<indices.length;iCnt++)
        {   
            int r = indices[iCnt][0];
            int c = indices[iCnt][1];
            for(int iCntX = 0;iCntX<n;iCntX++)
            {
                Result[r][iCntX]++;
            }
             for(int iCntX = 0;iCntX<m;iCntX++)
            {
                Result[iCntX][c]++;
            }
        }
       
        int iCount = 0;

        for(int iCnt = 0;iCnt<Result.length;iCnt++)
        {
            for(int iCntX = 0;iCntX<Result[iCnt].length;iCntX++)
            {
                if(Result[iCnt][iCntX]%2 != 0)    iCount++;
                
            }
        }
        
        
        return iCount;
    }
}
public class cellwithoddvalueinamatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();
        int[][] Arr = {{0,1},{1,1}};
        int iRet = 0;

        iRet = sObj.oddCells(2,3,Arr);

        System.out.println(iRet);
    }   
    
}
