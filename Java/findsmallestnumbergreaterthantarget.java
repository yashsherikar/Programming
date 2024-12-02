
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    
        int Start = 0;
        int End = letters.length-1;
        char cChar  = letters[0];

        while(Start<=End)
        {
            int Mid = (Start + End)/2;

            if(letters[Mid] > target)
            {
                End = Mid-1;
                cChar = letters[End];
            }
            else if(letters[Mid] < target)
            {
                Start = Mid+1;
                cChar = letters[Start];
            }
            else if(letters[Mid] == target)
            {
                cChar = letters[Mid+1];
            }

        }
        return cChar;

    }
}


public class findsmallestnumbergreaterthantarget {
    public static void main(String arg[])
    {
        Solution sObj = new Solution();

        char[] arr = {'c','f','j'};
        char cRet = sObj.nextGreatestLetter(arr, 'd');

        System.out.println(cRet);
    }
    
}
