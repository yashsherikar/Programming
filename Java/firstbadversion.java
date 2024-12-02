import java.util.Scanner;

//Leatcode question Q)278

// class Display
// {
//     /* The isBadVersion API is defined in the parent class VersionControl.
    //   boolean isBadVersion(int version); */

    //   public class Solution extends VersionControl {
    //       public int firstBadVersion(int n) {
    //           int Start = 1;
    //           int End = n;
    //           int Mid=0;
    //           int ans = 0;
              
    //           while(Start<=End)
    //           {
    //               Mid =  Start + (End - Start)/2;
    //               boolean Ret =  isBadVersion(Mid);
    //                if(Ret == false)
    //               {
    //                   Start = Mid+1;
    //               }
    //               else if(Ret == true)
    //               {
    //                   End = Mid-1;
    //                   ans = Mid;
    //               }
    //              else
    //               {
    //                   return Mid;
    //               }
    //          }
    //          return ans;
                
    //       }
    //   }

// public class firstbadvirsion {
//     public static void main(String[] args) {
        

//         Scanner sc = new Scanner(System.in);
//         Display dObj = new Display();

//         System.out.println("Enter The Number :");
//         int iNo = sc.nextInt();


//        int iRet = dObj.Squreroot(iNo);
        
//        System.out.println(iRet);
        
//     }
// }
