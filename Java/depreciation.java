import java.util.Scanner;

class Display
{
    float Dis_depreciation(int iTime,int iRate,int iYear){
        
        float iTemp = iTime;
        System.out.println(iTemp);
        for(int iCnt = 0;iCnt < iYear;iCnt++)
        {
            iTemp=((100-iRate)*iTemp)/100;
        }

        return iTemp;
    }
}
public class depreciation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();
        float iRet = 0;

        System.out.println("Enter The Value Of Certain Time(V1) : ");
        int iTime = sc.nextInt();

        System.out.println("Enter The per Annum Is The Rate(R%) : ");
        int iRate = sc.nextInt();

        System.out.println("Enter The Years : ");
        int iYear = sc.nextInt();

        iRet = dObj.Dis_depreciation(iTime, iRate, iYear);
        System.out.println("The Depreciation Is : "+iRet);

    }
    
}
