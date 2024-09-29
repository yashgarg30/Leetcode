class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        int i,j;
        int flag = 0;
        for(i=0;i<nums.size();i++){
            for(j=i+1;j<nums.size();j++){
                if(target==nums[i]+nums[j]){
                    result.push_back(i);
                    result.push_back(j);
                    flag = 1;
                    break;
                }

            }
        if(flag==1){
            break;
        }
        }
        return result;
    }
    
};