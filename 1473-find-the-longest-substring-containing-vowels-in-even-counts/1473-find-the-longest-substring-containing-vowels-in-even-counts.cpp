class Solution {
public:
    int findTheLongestSubstring(string s) {
        unordered_map<int,int> indices;
        indices[0]=-1;
        int maxlength=0,val=0;
        for(int i=0;i<s.size();i++){
            char ch=s[i];
            if(ch=='a'){
                val^=(1<<0);}
            else if(ch=='e'){
                val^=(1<<1);}
            else if(ch=='i'){
                val^=(1<<2);}
            else if(ch=='o'){
                val^=(1<<3);}
            else if(ch=='u'){
                val^=(1<<4);}
            
            if(indices.find(val)!=indices.end()){
                maxlength=max(maxlength,i-indices[val]);
            }
            else{
                indices[val]=i;
            }
        }
        return maxlength;
    }
};