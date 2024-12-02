import java.util.Scanner;

class Display
{
    void DisplayArea(int iLenth,int iWidth)
    {
        System.out.println("The Area Of Rectangle "+iLenth * iWidth);
    }
}




public class areaofrectangle 
{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Length Value : ");
        int length = sc.nextInt();

        System.out.println("Enter The Width Value :");
        int Width = sc.nextInt();

        dObj.DisplayArea(length, Width);

    }    
}
