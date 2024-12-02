import java.util.ArrayList;
import java.util.List;

class Solution
{
    public List<Integer> findDuplicates(int[] arr)
    {
        int iCnt = 0;
        List<Integer> ans = new ArrayList<>();
        while (iCnt<arr.length) {
            
            int corrent = arr[iCnt]-1;
            if(arr[iCnt] != arr[corrent])
            {
                swap(arr, iCnt, corrent);
            }
            else
            {
                iCnt++;
            }

        }
        for(int iCntX = 0;iCntX < arr.length;iCntX++)
        {
            if(arr[iCntX] != iCntX+1)
            {
                ans.add(arr[iCntX]);
            }
        }

        return ans;
    }
    void swap(int[] arr,int First,int Second)
    {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
    
}

public class findallduplicatesinanarray {
    public static void main(String[] args)
     {
        Solution sobj = new Solution();

        int[] arr = {4,3,2,7,8,2,3,1};

        List<Integer> ans = (ArrayList<Integer>) sobj.findDuplicates(arr);

        for(int iCntX = 0;iCntX < ans.size();iCntX++)
        {
            System.out.print(ans.get(iCntX));
        }
    }

}
