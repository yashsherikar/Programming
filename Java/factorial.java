import java.util.Scanner;
class Display
{
    void Display_Fact(int iNo)
    {
        int iMult = 1;
        for(int iCnt = iNo;iCnt >= 1;iCnt--)
        {
            iMult = iMult * iCnt;
        }
        System.out.println("Factorial Is (!"+iNo+"):"+iMult);
    }
}

public class factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter Ther Number : ");
        int iValue = sc.nextInt();

        dObj.Display_Fact(iValue);

    }
    
}
