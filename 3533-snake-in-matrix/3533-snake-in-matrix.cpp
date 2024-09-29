class Solution {
public:
    int finalPositionOfSnake(int n, vector<string>& commands) {
        int i=0,p,j=0;
        for(p=0;p<commands.size();p++){
            if(commands[p]=="UP" && i!=0){
                i-=1;
            }
            else if(commands[p]=="DOWN" && i!=n-1){
                i+=1;
            }
            else if(commands[p]=="RIGHT" && j!=n-1){
                j+=1;
            }
            else if(commands[p]=="LEFT" && j!=0){
                j-=1;
            }
        }
        return (i*n)+j;
    }
};