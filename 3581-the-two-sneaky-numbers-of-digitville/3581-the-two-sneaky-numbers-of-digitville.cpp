class Solution {
public:
    vector<int> getSneakyNumbers(std::vector<int>& nums) {
        unordered_set<int> seen;
        unordered_set<int> duplicates;       
        for (int num : nums) {
            if (seen.find(num) != seen.end()) {
                duplicates.insert(num);
            } 
            else {
                seen.insert(num);
            }
        }
        vector<int> result(duplicates.begin(), duplicates.end());
        return result;
    }
};
