package dsaleedcode;

public class LC_Trailing_zero {
    class Solution {
        public int trailingZeroes(int n) {
            //  long method 
        //     long mult = 1;
        //     long val = 0;
        //     for(long i = 1; i<=n ; i++){
        //           mult = mult*i;
        //     }
        //     // for(int j =0 ;j<=mult ; j++){
        //     // int temp = mult%10;
        //     // if(temp == 0){
        //     //       val++;
        //     //       temp=temp/10;
        //     // }
        //     while(mult>0){
        //     if(mult%10 ==0){
        //         val++;
        //         mult = mult/10;
        //     }
        //    break ;
        //     }
        //         return val;
            int value = 0 ;
            for(int i = 5 ; i<= n ; i = i*5){
               value = value + n/i;
            }
            return value ;
            }
        }
}
