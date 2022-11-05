package dsaleedcode;

public class LC_palindrom {
    class Solution {
        public boolean isPalindrome(int x) {
            // int[] arr = x.
            // int i =0 ;
            // int j = x.length ;
            //  while(i>j){
            //      if(x(i)==x(j)){
            //          i++;
            //          j--;
            //      }
            //      return true ;
            //  }
            //  return false ;
            int original = x ;
            int rev = 0 ;
            while(x>0){
                rev = x%10 + rev*10;
                x =x/10;
            }
            return (original==rev)?true:false;
        }
    }
}
