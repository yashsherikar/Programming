import java.util.Arrays;
import java.util.Scanner;

class Display
{
    void DisplayData(int[] Arr)
    {
        int n = Arr.length;
        for(int iCnt = 0;iCnt<n;iCnt++)
        {
            Arr[iCnt] = Arr[iCnt]+n*(Arr[Arr[iCnt]]%n);
           
        }
        for(int iCntX = 0;iCntX<n;iCntX++)
        {
            Arr[iCntX] = Arr[iCntX]/n;
        }
        System.out.println(Arrays.toString(Arr));
    }
}
public class arrayfrompermutation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("ENter How many Element You Want To Sotre :");
        int iNo =  sc.nextInt();
        int[] Arr = new int[iNo];

        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
        dObj.DisplayData(Arr);

    }
    
}
