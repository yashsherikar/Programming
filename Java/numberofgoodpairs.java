import java.util.List;
import java.util.Scanner;

class Display
{
    void DisplayCandies(int[] Arr)
    {
        int iCount = 0;
        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            for(int iCntX = iCnt+1;iCntX<Arr.length;iCntX++)
            {
                if(Arr[iCnt] == Arr[iCntX])
                {
                    iCount++;
                }
            }
        }
        System.out.println(iCount);
    }
}

public class numberofgoodpairs {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        int[] Arr = {1,1,1,1};

        dObj.DisplayCandies(Arr);

        
    }
    
}
 