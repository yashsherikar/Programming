import java.util.Scanner;


class Solution
{
   int[][]  flipAndInvertImage(int[][] image)
    {

        for(int iCnt = 0;iCnt<image.length;iCnt++)
        {
            int iStart = 0;
            int iEnd = image.length-1;

            while(iStart<iEnd)
            {
                int iTemp = image[iCnt][iEnd];
                image[iCnt][iEnd] = image[iCnt][iStart];
                image[iCnt][iStart] = iTemp;
                iStart++;
                iEnd--;
            }
            
        }
        for(int iCnt = 0;iCnt<image.length;iCnt++)
        {
            for(int iCntx = 0;iCntx<image.length;iCntx++)
            {
                if(image[iCnt][iCntx]==1)
                {
                    image[iCnt][iCntx] =0;
                }
                else
                {
                    image[iCnt][iCntx]=1;
                }
            }
        }
      
        return image;
    }
}
public class flippinganimage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();
        int[][] Arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int[][] iRet = sObj.flipAndInvertImage(Arr);

        for(int iCnt = 0;iCnt<iRet.length;iCnt++)
        {
            for(int iCntx = 0;iCntx<iRet.length;iCntx++)
            {
                System.out.print(iRet[iCnt][iCntx]);
            }
            System.out.println();
        }
    }
    
}
