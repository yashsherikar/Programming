import java.util.Scanner;
class Display
{
    int Cal_Dis(int iPrice,int iDis)
    {
        iDis = 100-iDis;
        return (iDis*iPrice)/100;
    }
}
public class calculatediscount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();
        int iRet = 0;

        System.out.println("Enter The Price Of Product :");
        int iPrice = sc.nextInt();

        System.out.println("Enter The Discount Price :");
        int iDis = sc.nextInt();

        iRet = dObj.Cal_Dis(iPrice, iDis);
        System.out.println("Your Discounted Price Is :"+iRet);


    }
    
}
