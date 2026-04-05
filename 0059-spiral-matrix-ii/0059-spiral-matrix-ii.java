class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int up=0;
        int left=0;
        int right=n-1;
        int down=n-1;
        int i=1;
        while(i<=n*n){
            for(int j=left;j<=right;j++){
                arr[up][j]=i;
                i++;
            }
            for(int j=up+1;j<=down;j++){
                arr[j][right]=i;
                i++;
            }
            for(int j=right-1;j>=left;j--){
                arr[down][j]=i;
                i++;
            }
            for(int j=down-1;j>=up+1;j--){
                arr[j][left]=i;
                i++;
            }
            up++;
            down--;
            left++;
            right--;
        }
        return arr;
    }
}