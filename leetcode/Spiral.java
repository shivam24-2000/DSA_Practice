class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> list = new ArrayList<>();
      
      int top=0,bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
      int row  = matrix.length;
      int col = matrix[0].length;
      while( top <= bottom && left <= right)
      {
        for(int i=left;i<=right;i++)
          list.add(matrix[top][i]);
        top++;
        
        for(int i=top;i<=bottom;i++)
          list.add(matrix[i][right]);
        right--;
        
        if (top <= bottom)
          for(int i=right;i>=left;i--)
            list.add(matrix[bottom][i]);
          bottom--;
        if (left <= right)
          for(int i = bottom;i>=top;i--)
            list.add(matrix[i][left]);
          left++;
      }
      return list;
    }
}
