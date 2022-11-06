package dsaleedcode.GFG;

public class GCD_twoNO {
    class Solution
{
    public int gcd(int A , int B) {
    //     int temp =0;
    //  for(int  i = 1 ; i<=A && i<=B ; i++){
    //     if(A%i== 0 && B%i == 0){
    //         temp =i;
    //     }
    
    //  }
    //  return temp;
    // int val1 = A;
    // int val2  = B ;
    // int temp =  val1 - val2;
    // int res = Math.min(A,B);
    // while(res>0){
    //     if(A%res ==0 && B%res== 0){
    //         break;
    //     }
    //     res--;
    // }
    // return res;
    if(B==0){
        return A;
    }
    return gcd(B,A%B);
    } 
}
}
