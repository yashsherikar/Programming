import java.util.Scanner;
class Display
{
    int power(int iValue1,int iValue2)
    {
        int iRem = 0;
        int iCount = 0;
        int iMult = 1;
        if(iValue2 == 1)
        {
            return 1;
        }
        while(iValue1 !=0)
        {
            iRem = iValue1%10;
            iValue1 = iValue1/10;
            iCount++;
        }
        for(int iCnt = 0;iCnt<iCount;iCnt++)
        {
            iMult = iMult * iValue2;
        }
        return iMult;
    }
    boolean ArmstrongORnot(int iNo)
    {
        int Orignal = iNo;
        int iRem = 0;
        int iSum = 0;
        while(iNo !=0)
        {
            iRem = iNo%10;
            iNo = iNo/10;
            iSum += power(Orignal,iRem);
        }
        if(Orignal == iSum)
        {
            return true;
        }

        return false;
    }
}
public class armstrongnumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean bRet = false;
        Display dObj = new Display();

        System.out.print("Enter The Number : ");
        int iNo = sc.nextInt();

        bRet = dObj.ArmstrongORnot(iNo);

        if(bRet == true)
        {
            System.out.println("The Number Is Armstrong");
        }
        else
        {
            System.out.println("The Number Is Not Armstrong");
        }
    }
    
}
