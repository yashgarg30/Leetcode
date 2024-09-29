class Solution {
public:
    long long maximumTotalSum(vector<int>& maximumHeight) {
        sort(maximumHeight.begin(), maximumHeight.end()); 
        long long totalSum = 0;
        int previousHeight = INT_MAX;  
        for (int i = maximumHeight.size() - 1; i >= 0; --i) {
            int currentHeight = min(previousHeight - 1, maximumHeight[i]);
            if (currentHeight <= 0){
                return -1;}
            totalSum += currentHeight;
            previousHeight = currentHeight; 
        }      
        return totalSum;
    }
};
