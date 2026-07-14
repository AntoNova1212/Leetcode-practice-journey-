class Solution {
    public int reverse(int x) {
         long sss = 0;
            long nss = 0;
            long neg = 0;
            int r = 0;
            long s = (long) x;
            if(x == 0){
                return x;
            }

            else if(s < 0){
                
                neg = s * -1;
                while (neg > 0) {
                long fn = neg % 10;
                neg /= 10;
                nss = nss * 10 + fn;
            }
            sss = nss * -1;
            if (sss > Integer.MAX_VALUE || sss < Integer.MIN_VALUE){
                return 0;
                }
                else{
                    r = (int)sss;
                    
                }
            }
            else if(s > 0){
                while (s > 0) {
                long fn = s % 10;
                s /= 10;
                sss = sss * 10 + fn;
                if (sss > Integer.MAX_VALUE || sss < Integer.MIN_VALUE){
                return 0;
                }
                else{
                    r = (int)sss;
                    
                }
            }
            }
            
            

            return r;
    }
}