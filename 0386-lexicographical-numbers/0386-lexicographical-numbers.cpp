class Solution {
public:
    vector<int> lexicalOrder(int n) {
        vector<int> ans;
        int number = 1;
        while(ans.size()<n){
            ans.push_back(number);
            if(number*10<=n){
                number*=10;}
            else if(number <n && number%10!=9){
                number+=1;}
            else{
                while ((number / 10) % 10 == 9)
                    number /= 10;
                number = number / 10 + 1;}
        }
        return ans;
    }
};
