import java.util.Arrays;
import java.util.Scanner;

class Display{

    void Concatinate(int[] Arr)
    {  
        int n = Arr.length;
        int[] iSum = new int[n*2];
        
        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            iSum[iCnt] = Arr[iCnt];
            iSum[iCnt+n] = Arr[iCnt];
        }
        System.out.println(Arrays.toString(iSum));
    }
}
public class concatenationofarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("How Many Element you Want to store in array :");
        int iValue  = sc.nextInt();

        int[] Arr = new int[iValue];

        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
        dObj.Concatinate(Arr);
    }
    
}
