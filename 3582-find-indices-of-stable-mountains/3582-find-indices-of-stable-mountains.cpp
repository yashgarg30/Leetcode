class Solution {
public:
    vector<int> stableMountains(vector<int>& height, int threshold) {
        vector<int> s_indices;
        if(height.size()<=1){
            return s_indices;
        }
        for(int i=1;i<height.size();i++){
            if(height[i-1]>threshold){
                s_indices.push_back(i);
            }
        }
        return s_indices;
    }
};