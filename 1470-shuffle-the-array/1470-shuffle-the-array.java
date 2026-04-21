class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        for(int i=0;i<n;i++){
            res[2*i]=nums[i];
        }
        int j=1;
        for(int i=n;i<2*n;i++){
            res[j]=nums[i];
            j+=2;
        }
        return res;
    }
}