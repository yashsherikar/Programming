import java.util.Scanner;

class Display
{
    boolean DisplayEvenOrOdd(int iValue)
    {
        if(iValue == 0)
        {
            return true;
        }
        else if((iValue % 2) == 0)
        {
            return true;
        }
        return false;
    }
}
public class evenorodd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        boolean bRet = false;

        System.out.println("Enter The Number :");
        int iNo = sc.nextInt();

        bRet = dObj.DisplayEvenOrOdd(iNo);
        
        if(bRet == true)
        {
            System.out.println("The Number Is Even");
        }
        else
        {
            System.out.println("The Number  Is Odd");
        }
    }
    
}
