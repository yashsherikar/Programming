import java.util.Scanner;

class Display
{
    boolean EligibaleOrNot(int iAge)
    {
        if(iAge >=18)
        {
            return true;
        }
        return false;
    }
}

public class eligibleornotforvote {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();
        boolean bRet = false;

        System.out.print("Enter Your Age : ");
        int iAge = sc.nextInt();

        bRet = dObj.EligibaleOrNot(iAge);

        if(bRet == true)
        {
            System.out.println("You Are Eligible.");
        }
        else
        {
            System.out.println("You Are Not Eligible.");
        }

    }
    
}
