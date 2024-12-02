import java.util.Scanner;

import javax.swing.Icon;

class Display
{
    void DisplayTheCount(String[][] Arr,String rulekey,String rulevalue)
    {
        int Temp = 0,iCount= 0;
        if(rulekey.equals("type"))
        {
            Temp = 0;
        }
        else if(rulekey.equals("color"))
        {
            Temp = 1;
        }
        else if(rulekey.equals("name"))
        {
            Temp = 2;
        }
        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {
          for(int iCntx = Temp;iCntx<Temp+1;iCntx++)
          {
            if(Arr[iCnt][iCntx].equals(rulevalue))
            {
               iCount++;
            }
          }
        }
        System.out.println(iCount);
    }
}
public class countitemsmatchingarule {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Display dObj = new Display();

        System.out.println("Enter The rulekey : ");
        String RuleKey = sc.nextLine();

        System.out.println("Enter The rulevalue : ");
        String RuleValue = sc.nextLine();

        String[][] Arr = {{"phone","blue","pixel"},
                            {"computer","silver","lenovo"},
                            {"phone","gold","iphone"}};

        dObj.DisplayTheCount(Arr, RuleKey, RuleValue);



    }
    
}
