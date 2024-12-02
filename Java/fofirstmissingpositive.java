import java.util.Arrays;

class solution
{
    int cyclicsort(int[] arr)
    {
        int iCnt = 0;
        while (iCnt<arr.length) 
        {
            int correct = arr[iCnt]-1;
            if(arr[iCnt] <= arr.length && arr[iCnt] != arr[correct] && arr[iCnt] > 0)
            {
                swap(arr, iCnt, correct);
            }
            else
            { 
                iCnt++;
            }
        }
        for(int iCntX = 0; iCntX < arr.length+1;iCntX++)
        {
            if(arr[iCntX] != iCntX+1)
            {
                return iCntX+1;
            }
            
        }
    
        return arr.length+1;
    }
    void swap(int[] arr ,int first, int last)
    {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

class fofirstmissingpositive
{
    public static void main(String[] args)
    {
        solution sobj = new solution();
        int[] arr = {3,4,-1,1};
        int iRet = sobj.cyclicsort(arr);
        System.out.println(iRet);
    }
}