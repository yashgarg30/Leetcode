class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int leftmost=0;
        int rightmost=0;
        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            if(ch=='R'){
                leftmost--;
            }
            else{
                leftmost++;
            }
        }
        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                rightmost--;
            }
            else{
                rightmost++;
            }
        }
        return Math.max(Math.abs(leftmost),Math.abs(rightmost));
    }
}