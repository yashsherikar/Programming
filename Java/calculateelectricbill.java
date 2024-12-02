import java.util.Scanner;

class Display{

    void CalculateBill(float iPerUnit,int iUnit)
    {
        System.out.println("Your Bill Is:"+(iPerUnit*iUnit));
    }
}
public class calculateelectricbill {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();
        
        System.out.println("Enter The Per Unit :");
        float iNo = sc.nextFloat();

        System.out.println("Enter The Your Unit :");
        int iUnit = sc.nextInt();

        dObj.CalculateBill(iNo,iUnit);

    }
}
