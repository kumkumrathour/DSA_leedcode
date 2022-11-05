package dsaleedcode.GFG;

public class GFG_Factorial {
    class Solution{
        static long factorial(int N){
            long mult = 1;
             for (int i =1 ; i<=N ;i++ ){
                    mult = mult*i;
             }
             return mult;
        }
    }
}
