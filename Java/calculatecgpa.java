import java.util.Scanner;

class Display
{
    float Display_Cgpa(int iSub)
    {
        int iSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Subject Marks Out Off 10 :");
        for(int iCnt = 0;iCnt<iSub;iCnt++)
        {
            iSum = iSum + sc.nextInt();
        }
       
        return  (float)iSum / iSub;
    }
}
public class calculatecgpa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();
        float fRet = 0.0f;

        System.out.println("How Many Subject Do You Have :");
        int iSub = sc.nextInt();

        fRet=dObj.Display_Cgpa(iSub);
        System.out.println("The CGPA Is :"+fRet);
        
        System.out.printf("The Percentage is :"+ String.format("%.2f",fRet*9.5));

        
    }
}
