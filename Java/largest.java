import java.util.Scanner;

class Display
{
    void Display_Sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int iTemp = 0,iNo = 1;
        while(iNo != 0) 
        {
            iNo = sc.nextInt();
           if(iNo > iTemp)
           {
                iTemp = iNo;
           }

        }
        System.out.println("Large Number  iS :"+iTemp);
    }
}
public class largest {
    
    public static void main(String[] args) {
        
        Display dObj =new Display();
        dObj.Display_Sum();
    }
}
