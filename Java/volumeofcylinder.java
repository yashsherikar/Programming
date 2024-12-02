import java.util.Scanner;
class Display
{
    void DisplayVolume(int iRedious,int iHeight)
    {
        float PI = 3.14f;
        System.out.println("The Volume Of Cylinder : "+(PI*iRedious*iRedious*iHeight));
    }               
}
public class volumeofcylinder {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Radious :");
        int Radious = sc.nextInt();

        System.out.println("Enter The Height :");
        int Height = sc.nextInt();

        dObj.DisplayVolume(Radious, Height);

    }
    
}
