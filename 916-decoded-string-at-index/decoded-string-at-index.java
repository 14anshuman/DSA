class Solution {
    //* Without Overload
    public String decodeAtIndex(String s, long k)
    {
        char last = '\0';        
        int length = s.length();
        long count = 0;

        for (int i = 0; i < length; i++)
        {
            char c = s.charAt(i);

        //* if count * number value of c bigger than k
        //* k index won't reach after c char.
        //* for example:
        //* s = "a27b51231", k = 7 => extendedS = "aaaaa...bbb..."
        //* extendedS[k] = "a", k never reach after a27...
        //* return k % count to start to count from begining

        //* If count * number value of c bigger or equal to k, 
        //* and k % count equal to zero,
        //* k index is exactly last char.
        //* for example: 
        //* s = "ab2" k = 4 => extendedS = "abab"
        //* extendedS[k] = "b";
        //* s = "ab98757" k = 4 => extendedS = "abababab...abababab"
        //* extendedS[k] = "b";
            if (c <= '9')
            {
                if (count * (c - '0') >= k)
                {
                    if (k % count == 0)
                        return Character.toString(last);

                    return decodeAtIndex(s, k % count);
                }
                
                count *= c - '0';
            }

            else if (++count == k)
                return Character.toString(c);

            else
                last = c;
        }

        return "";
    }
}