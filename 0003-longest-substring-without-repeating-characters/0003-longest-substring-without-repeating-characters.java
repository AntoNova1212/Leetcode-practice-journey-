class Solution {
    public int lengthOfLongestSubstring(String s) {
        
 

        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] visited = new boolean[256];
            int lenth = 0;

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (visited[ch]) {
                    break;
                }

                visited[ch] = true;
                lenth++;
            }

            max_len = Math.max(max_len, lenth);
        }

        return max_len;
    }
}
    
