import java.util.Scanner;

class Display
{
    void Display_Factors(int iNo)
    {
        
        System.out.println("Factors Is :");

        for(int iCnt = 1;iCnt<=iNo/2;iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                System.out.print(" "+iCnt);
            }
        }
    }
}
public class factors {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Display dObj =new Display();

        System.out.println("Enter The Number :");
        int iNo = sc.nextInt();

        dObj.Display_Factors(iNo);
    }
}
