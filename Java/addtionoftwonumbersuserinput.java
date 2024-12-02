import java.util.Scanner;

class Display
{
    int Display_Addition(int iValue1,int iValue2)
    {
        int iSum = 0;
        iSum = iValue1+iValue2;

        return iSum;
    }
   
}
public class addtionoftwonumbersuserinput {
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        Display dObj = new Display();
        int iRet = 0;

        System.out.println("Enter The First Number :");
        int iNo1 = sc.nextInt();

        System.out.println("Enter the Second Number :");
        int iNo2 = sc.nextInt();
 
        iRet = dObj.Display_Addition(iNo1, iNo2);
        System.out.println("The Addition Of Number Is :"+iRet);

    }
}
