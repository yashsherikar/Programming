import java.util.Scanner;


class Display
{
    void DisplayGrades(int iMarks)
    {
        if(iMarks >= 91)
        {
            System.out.println("AA");
        }
        else if(iMarks >= 81)
        {
            System.out.println("AB");
        }
        else if(iMarks >= 71)
        {
            System.out.println("BB");
        }
        else if(iMarks >= 61)
        {
            System.out.println("BC");
        }
        else if(iMarks >= 51)
        {
            System.out.println("CD");
        }
        else if(iMarks >= 41)
        {
            System.out.println("DD");
        }
        else 
        {
            System.out.println("Fali");
        }
        
    }
}
public class displaygradesacoordingtomarks {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        Display dObj = new Display();
        
        System.out.print("Enter The Marks :");
        int iMarks = sc.nextInt();

        dObj.DisplayGrades(iMarks);

        

    }
    
}
