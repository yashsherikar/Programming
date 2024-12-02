import java.util.Scanner;


class Solution
{
    int Anser(int[] matrix,int Target)
    {
        int Start = 0;
        int End = 1;

        while (Target > matrix[End]) {
            
            int Temp = End+1;

            End = End+(End - Start + 1)*2;
            Start = Temp;
        }
      
        return search(matrix, Target, Start, End);
    }
    int search(int[] matrix,int Target,int Start,int End)
    {
        while(Start <= End)
        {   
          
           int Mid = Start+End;
            Mid = Mid/2;
    
            if(Target > matrix[Mid])
            {
                Start = Mid+1;
            }
            else if(Target < matrix[Mid])
            {
                  
                End = Mid - 1;
    
            }
            else
            {
                return Mid;
            }
                
          
        }
        return -1;
    }

}
public class findpositionofanelementinasortedarrayofinfinitenumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution sObj = new Solution();

        int[] Arr = {3,5,7,9,10,90,100,130,140,160,170};

       int iRet = sObj.Anser(Arr,10);
       System.out.println(iRet);

        

    }   
    
}