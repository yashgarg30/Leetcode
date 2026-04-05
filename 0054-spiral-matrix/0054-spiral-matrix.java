class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(up<=down && left<=right){
            //top
            for(int j=left;j<=right;j++){
                arr.add(matrix[up][j]);
            }
            //right
            for(int i=up+1;i<=down;i++){
                arr.add(matrix[i][right]);
            }
            //bottom
            for(int j=right-1;j>=left;j--){
                if(up==down){
                    break;
                }
                arr.add(matrix[down][j]);
            }
            //left
            for(int i=down-1;i>=up+1;i--){
                if(left==right){
                    break;
                }
                arr.add(matrix[i][left]);
            }
            up++;
            down--;
            left++;
            right--;
        }
        return arr;
    }
}