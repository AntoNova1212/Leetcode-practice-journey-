class Solution {
    public String convert(String s, int numRows) {
   int l = s.length();
        if (numRows == 1) {
           return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++){
            rows[i]= new StringBuilder();
        }
        
        int currentRow = 0;
        int direction = 0;

        for (int i = 0; i < s.length(); i++) {
            if (currentRow == 0) {
                direction = 1;
            }
        
            if ( currentRow == numRows - 1){
                direction = -1;
            }

            rows[currentRow].append(s.charAt(i));

            currentRow += direction;
            
            
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
        ans.append(rows[i]);
        }

        return ans.toString();

    }
}