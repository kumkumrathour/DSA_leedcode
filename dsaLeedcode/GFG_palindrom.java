package dsaleedcode;

public class GFG_palindrom {
    class Solution {
        int isDigitSumPalindrome(int N) {
            int sum = 0;
            // for(int i =0 ; i<N; i++){
            //     sum = sum+i;
            // }
            while(N>0){
                int temp = N%10;
                sum = sum+ temp;
                N=N/10;
            }
            int Val = sum;
            // int rev = sum%10 + rev*10 ;
            // sum = sum/10;
            // return (val == rev)?true: false;
            int rev = 0 ;
            while(Val>0){
                rev = Val%10 + rev*10 ;
                 Val = Val/10;
            }
            if( sum == rev){
                return 1;
            }
            else{
                return 0 ;
            }
        }
    }
}
