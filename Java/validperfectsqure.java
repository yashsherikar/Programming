import java.util.Arrays;

class Solution {
    public void twoSum(int target) {

        int Start = 0;
        int End = target/2;
        boolean Flag = false;
        while(Start<=End)
        {
            int Mid = Start + (End-Start)/2;
           if(Mid * Mid < target)
           {
                Start = Mid+1;
           }
           else if(Mid * Mid > target)
           {
             End = Mid-1;
           }
           else
           {
              Flag = true;
           }
        }

        System.out.println(Flag);
          
    }

    
}

public class validperfectsqure {
    public static void main(String[] args) {
        
        Solution obj = new Solution();

        
        obj.twoSum(16);


    }
    
}
