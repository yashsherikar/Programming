import java.util.ArrayList;
import java.util.List;
class Solution
{
    public List<Integer> display(int[] arr)
    {
        int iCnt = 0;
        List<Integer> lis = new ArrayList<>();
        while (iCnt < arr.length) 
        {
            int correct = arr[iCnt]-1;
            
            if(arr[iCnt] != arr[correct])
            {
                swap(arr, iCnt, correct);
            }
            else{
                iCnt++;
            }
        }
        for(int iCntX =0; iCntX < arr.length;iCntX++)
        {
            if(arr[iCntX] != iCntX+1)
            {
                lis.add(iCntX+1);
            }
            
        }
        return lis;

    } 

    void swap(int[] arr,int First,int Second)
    {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

}


public class findallnumberdisappearedinanarray {
    public static void main(String arg[])
    {
        Solution sobj = new Solution();

        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> lists = (ArrayList<Integer>) sobj.display(arr);

        for(int icnt=0;icnt<lists.size();icnt++){

            System.out.print(lists.get(icnt));
        }

    }
    
}
