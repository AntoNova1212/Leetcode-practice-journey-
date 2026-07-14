class Solution {
    public boolean isPalindrome(int x) {
       
        int revv = 0;
        int rev = 0;
        int y = x;

        while(y > 0){
            rev = y % 10;
            y /= 10;
            revv = revv * 10 + rev ;
        }

        return(x == revv);  
    }
}