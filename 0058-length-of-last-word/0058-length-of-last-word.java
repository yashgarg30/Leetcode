class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int lastword=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                lastword=i;
                break;
            }
        }
        for(int i=lastword;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}