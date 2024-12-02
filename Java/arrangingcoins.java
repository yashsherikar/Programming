import java.util.Scanner;
class Solution {
    public int arrangeCoins(int n) {

        int End = n;
        int Start = 1;
        int Ans = 0;
        int sum = 0;
        while(Start<=End)
        {
            int Mid = (Start + End)/2;
            int Temp = Start;
            while(Temp<=Mid)
            {
                sum = sum + Temp;
                Temp++;
            }
            if(sum <  )
            {

            }

        }


        return 0;
        
    }
}
public class arrangingcoins {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sobj = new Solution();

        System.out.println("Enter The Number :");
        int iNo = sc.nextInt();

        int iRet = sobj.arrangeCoins(iNo);


    }
    
}
