import java.util.Scanner;

class Display
{
    void DisplayArea(int iSide)
    {
        float fRoot = 1.732050f;
        System.out.println("The Area Of Parallelogram "+(fRoot/4)*(iSide * iSide));
    }
}




public class areaofrhombus 
{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Side Value : ");
        int Side = sc.nextInt();

        dObj.DisplayArea(Side);

    }    
}
