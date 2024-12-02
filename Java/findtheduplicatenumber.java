class Solution
{
    public int display(int[] arr)
    {
        int iCnt = 0,rNum = 0;
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
                rNum = arr[iCntX];
                break;
            }
             
        }

        return rNum;
    } 

    void swap(int[] arr,int First,int Second)
    {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

}


public class findtheduplicatenumber {
    public static void main(String arg[])
    {
        Solution sobj = new Solution();

        int[] arr = {1,3,4,2,2};
        int iret =sobj.display(arr);

        System.out.println(iret);        

    }
    
}
