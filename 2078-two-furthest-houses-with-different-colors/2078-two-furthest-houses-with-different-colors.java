class Solution {
    public int maxDistance(int[] colors) {
        int leftmax=0;
        int rightmax=0;
        int n=colors.length;
        for(int i=n-1;i>0;i--){
            if(colors[i]!=colors[0]){
                leftmax=i;
                break;
            }
        }
        for(int i=0;i<n-1;i++){
            if(colors[i]!=colors[n-1]){
                rightmax=Math.abs(n-1-i);
                break;
            }
        }
        return Math.max(leftmax,rightmax);
    }
}