import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Display
{
    void DisplayCandies(int[] Arr,int iCandi)
    {
        int iMax = Arr[0];
        
        for (int element : Arr) {
            if(iMax < element)
            {
                iMax = element;
            }
        }
        // boolean[] Result = new boolean[Arr.length];
        
        List<Boolean> Result = new ArrayList();

        for (int element : Arr) 
        {
            if(element+iCandi >= iMax)
            {
                Result.add(true);
            }
            else
            {
               Result.add(false);
            }
        }
        System.out.println(Result);
    }
}

public class gretestnumberofcandidates {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Number :");
        int iNo = sc.nextInt();

        int[] Arr = {2,3,5,1,3};

        dObj.DisplayCandies(Arr, iNo);

        
    }
    
}
