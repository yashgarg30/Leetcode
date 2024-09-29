class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i=0,a=0,b=0,c=0;
        for(i=0;i<nums.size();i++){
            if(nums[i]==0){
                a++;}
            else if(nums[i]==1){
                b++;}
            else{
                c++;}}
    i=0;
    while(i<a){
        nums[i]=0;
        i++;}
    while(i<a+b){
        nums[i]=1;
        i++;}
    while(i<a+b+c){
        nums[i]=2;
        i++;}
    }
};