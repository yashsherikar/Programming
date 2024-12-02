import java.util.Scanner;

//Leatcode question Q)374

// class Display
// {
//     int Squreroot(int x)
//     {
       /** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
        
//         int Start = 0;
//         int End = n;
//         int Mid=0;
        
//         while(Start<=End)
//         {
//             Mid =  Start + (End - Start)/2;
//             int Ret =  guess(Mid);
//             if(Ret == 1)
//             {
//                 Start = Mid+1;
//             }
//             else if(Ret == -1)
//             {
//                 End = Mid-1;
//             }
//             else
//             {
//                 return Mid;
//             }
//         }
//         return -1;
//     }
// }     
//     }
// }

// public class guessnumberhigherorlower {
//     public static void main(String[] args) {
        

//         Scanner sc = new Scanner(System.in);
//         Display dObj = new Display();

//         System.out.println("Enter The Number :");
//         int iNo = sc.nextInt();


//        int iRet = dObj.Squreroot(iNo);
        
//        System.out.println(iRet);
        
//     }
// }
