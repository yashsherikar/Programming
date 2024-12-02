import java.util.Scanner;

class Display
{
    void DisplaySeries(int iNo)
    {
        int iValue1 = 0,iValue2 = 1,iTemp = 0;

        System.out.print(iValue1+" "+iValue2);
        for(int iCnt = 0;iCnt<iNo-2;iCnt++)
        {
            iTemp = iValue2;
            iValue2 = iValue1+iValue2;
            iValue1 = iTemp;
            System.out.print(" "+iValue2);
        }
    }
}

public class fibonacci {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter The Number :");
        int iNo = sc.nextInt();
        
        Display dObj = new Display();

        dObj.DisplaySeries(iNo);

    }
    
}
