import java.util.Scanner;


class Solution
{
    int diagonalSum(int[][] mat)
    {
        int iPrimary  = 0,iSecondary = 0,iTemp = 0,iTemp1 = 0,iAns = 0;
        for(int iCnt = 0;iCnt<mat.length;iCnt++)
        {
            for(int iCntX = iCnt;iCntX<=iCnt;iCntX++)
            {

                iPrimary = iPrimary + mat[iCnt][iCntX];
                iSecondary = iSecondary +  mat[iCnt][(mat.length-1)-iCntX];
               
               
                
            }

        }
        if(((mat.length * mat[0].length) % 2) != 0 )
        {
            iTemp = mat.length/2;
            iTemp1 = mat[iTemp].length/2;
            iAns = iPrimary+iSecondary - mat[iTemp][iTemp1];
        }
        else
        {
            iAns  = iPrimary+iSecondary;
        }
       

        
        return iAns;
    }
}
public class matrixdiagonalsum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();
        int[][] Arr = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int iRet = 0;

        iRet = sObj.diagonalSum(Arr);

        System.out.println(iRet);
    }   
    
}
