class Solution {
    private void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=n-2;
        while(pivot>=0 && nums[pivot]>=nums[pivot+1]){
            pivot--;
        }
        if(pivot<0){
            reverse(nums,0,n-1);
            return;
        }
        int succ=n-1;
        while(nums[succ]<=nums[pivot]){
            succ--;
        }
        int temp=nums[pivot];
        nums[pivot]=nums[succ];
        nums[succ]=temp;
        reverse(nums,pivot+1,n-1);
    }
}