import java.util.Arrays;

class solution
{
    int cyclicsort(int[] arr)
    {
        int iCnt = 0;
        while (iCnt<arr.length) 
        {
            int correct = arr[iCnt];
            if(arr[iCnt] < arr.length && arr[iCnt] != arr[correct])
            {
                swap(arr, iCnt, correct);
            }
            else
            { 
                iCnt++;
            }
        }
        for(int iCntX =0; iCntX < arr.length;iCntX++)
        {
            if(arr[iCntX] != iCntX)
            {
                return iCntX;
            }
            
        }
    
        return arr.length;
    }
    void swap(int[] arr ,int first, int last)
    {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

class missingnumber
{
    public static void main(String[] args)
    {
        solution sobj = new solution();
        int[] arr = {4,0,2,1};
        int iRet = sobj.cyclicsort(arr);
        System.out.println(iRet);
    }
}