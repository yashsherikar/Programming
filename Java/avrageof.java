import java.util.Scanner;
class Display
{
    int Display_Avg(int iElement)
    {
        Scanner sc = new Scanner(System.in);
        int iSum = 0;

        System.out.println("Enter The Number's :");
        for(int iCnt = 1;iCnt <= iElement;iCnt++)
        {
            iSum = iSum + sc.nextInt();
        }

       return iSum/iElement;
    }

}
public class avrageof {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();
        int iRet = 0;

        System.out.println("Enter The How Many Element You Want To Store :");
        int iNo = sc.nextInt();

        iRet=dObj.Display_Avg(iNo);
        System.out.println("The Avarage Is : "+iRet);


        
    }
}
