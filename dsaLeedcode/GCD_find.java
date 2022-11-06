package dsaleedcode;

public class GCD_find {
    class Solution {
        public int findGCD(int[] nums) {
         int max= Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         for(int i = 0 ; i<nums.length;i++){
             max= Math.max(max,nums[i]);
             min= Math.min(min,nums[i]);
         }
             int ans = gcd(max,min);
             return ans ;
        }
            public int gcd( int a, int b){
               if(b == 0){
                   return a;
               }
               return gcd(b,a%b);
            }
    }
}
