import java.util.Scanner;
class Display
{
    void DisplayVolume(int iRedious,int iHeight)
    {
        float fNo = 1/3f;
        float PI = 3.14f;

        System.out.println("The Volume Of Cone : "+fNo*PI*iRedious*iRedious*iHeight);
    }
}
public class volumeofcone {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Radious :");
        int Redious = sc.nextInt();

        System.out.println("Enter The Height :");
        int Height = sc.nextInt();

        dObj.DisplayVolume(Redious, Height);

    }
    
}
