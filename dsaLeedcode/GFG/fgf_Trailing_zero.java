package dsaleedcode.GFG;

public class fgf_Trailing_zero {
    class Solution{
        static int trailingZeroes(int N){
            int rem = 0 ;
            for(int i = 5 ; i <=N ; i = i*5){
                rem = rem + N/i ;
            }
            return rem;
        }
    }
}
