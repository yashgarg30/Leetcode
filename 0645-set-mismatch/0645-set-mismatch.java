class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] arr=new int[2];
        int actualsum=nums[0];
        for(int i=1;i<n;i++){
            actualsum+=nums[i];
            if(nums[i]==nums[i-1]){
                arr[0]=nums[i];
            }
        }
        int expectedsum=(n*(n+1))/2;
        arr[1]=expectedsum-(actualsum-arr[0]);
        return arr;
    }
}