import java.util.Scanner;
class Display
{
    void DisplayVolume(int iBase,int iHeight)
    {
        System.out.println("The Volume Of Prism : "+(iBase*iHeight));
    }               
}
public class volumeofprism {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The Base :");
        int Base = sc.nextInt();

        System.out.println("Enter The Height :");
        int Height = sc.nextInt();

        dObj.DisplayVolume(Base, Height);

    }
    
}
