class Solution {
    public int maxSubArray(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                neg=1;
                break;
            }
        }
        if(neg==1){
            for(int i=0;i<nums.length;i++){
                cs+=nums[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(ms,cs);
            }
            return ms;
        }
        else{
            for(int i=0;i<nums.length;i++){
                cs=nums[i];
                ms=Math.max(ms,cs);
            }
            return ms;
        }
        
    }
}