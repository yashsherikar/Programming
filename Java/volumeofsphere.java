import java.util.Scanner;
class Display
{
    void DisplayVolume(int iRedious)
    {
        float PI = 3.14f;
        float fNo = 4/3;
        System.out.println("The Volume Of Sphere : "+(fNo*PI*(iRedious)*3));
    }               
}
public class volumeofsphere {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Radious :");
        int Radiuos = sc.nextInt();

      
        dObj.DisplayVolume(Radiuos);

    }
    
}
