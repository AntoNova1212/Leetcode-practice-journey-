class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
            
            int left = 0;
            int max = 0;

            while(left < right){
                int curr_max = Math.min(height[left], height[right]) * (right - left);
                
                if(height[left] < height[right]){
                    left +=1;
                }
                else{
                    right -= 1;
                }
                
                max = Math.max(max, curr_max);
            }


            return max;
    }
}