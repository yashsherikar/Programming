import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Display{
    
    void DisplayTheArray(int[] Arr,int[] Index)
    {
        ArrayList<Integer> Result = new ArrayList<>();
        int[] Ans = new int[Arr.length];

        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {

            Result.add(Index[iCnt],Arr[iCnt]);

        }
        for(int iCntX = 0;iCntX<Arr.length;iCntX++)
        {
            Ans[iCntX] = Result.get(iCntX);
        }
        
        System.out.println(Arrays.toString(Ans));
    }
    
}
public class createtargetarrayinthegivenorder {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        Display dObje = new Display();

        int[] Arr = {0,1,2,3,4};
        int[] index = {0,1,2,1,2};

        dObje.DisplayTheArray(Arr, index);


    }
}
