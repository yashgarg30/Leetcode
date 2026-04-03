class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int maxLeft=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                left=1;
                maxLeft=Math.max(maxLeft,0);
                continue;
            }
            left *= nums[i];
            maxLeft=Math.max(maxLeft,left);
        }

        int right=1;
        int maxRight=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] == 0){
                right=1;
                maxRight=Math.max(maxRight,0);
                continue;
            }
            right *= nums[i];
            maxRight=Math.max(maxRight,right);
        }
        return Math.max(maxLeft,maxRight);
    }
}