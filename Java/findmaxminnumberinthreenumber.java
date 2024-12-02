import java.util.Scanner;


class Display
{
    int MaxNumber(int iNo1,int iNo2,int iNo3)
    {
        int iMax = iNo1;
        if(iNo2 > iMax)
        {
            iMax = iNo2;
        }
        if(iNo3 > iMax)
        {
            iMax = iNo3;
        }
        return iMax;
    }
    int MinNumber(int iNo1,int iNo2,int iNo3)
    {
        int iMin = iNo1;
        if(iNo2 < iMin)
        {
            iMin = iNo2;
        }
        if(iNo3 < iMin)
        {
            iMin = iNo3;
        }
        return iMin;
    }
}
public class findmaxminnumberinthreenumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        int iRet = 0;

        System.out.println("Enter The First Number :");
        int iFirstr = sc.nextInt();

        System.out.println("Enter The Second Number :");
        int iSecond = sc.nextInt();

        System.out.println("Enter Thired Number: ");
        int iThree = sc.nextInt();

        iRet = dObj.MaxNumber(iFirstr, iSecond, iThree);
        System.out.println("The Maximum Number is : "+iRet);

        iRet = dObj.MinNumber(iFirstr, iSecond, iThree);
        System.out.println("The Minimum Number is : "+iRet);

    }
}