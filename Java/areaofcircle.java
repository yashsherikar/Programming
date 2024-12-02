import java.util.Scanner;

class Display
{
    float DisplayParameter(int iRadius)
    {
        float PI = 3.14f;
        
        return PI*(iRadius*iRadius);
    }
}
class areaofcircle
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);

        float iRet = 0.0f;

        Display dObj = new Display();
        System.out.println("ENter The Numeber You Want To Area of circle : ");
        int iNo = sc.nextInt();   

        iRet = dObj.DisplayParameter(iNo);
        System.out.println("Are Of Circle Is : "+iRet);

    }
}