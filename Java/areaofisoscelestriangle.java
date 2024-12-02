import java.util.Scanner;

class Display
{
    void DisplayArea(int iBase,int iHeight)
    {
        System.out.println("The Area Of Isosceles Triangle "+0.5*(iBase * iHeight));
    }
}




public class areaofisoscelestriangle 
{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Base Value : ");
        int Base = sc.nextInt();

        System.out.println("Enter The Height Value :");
        int Height = sc.nextInt();

        dObj.DisplayArea(Base, Height);

    }    
}
