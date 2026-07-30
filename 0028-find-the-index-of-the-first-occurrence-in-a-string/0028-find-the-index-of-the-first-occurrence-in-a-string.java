class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        int n=needle.length();
        int flag=-1;
        for(int i=0;i<=haystack.length()-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                flag=i;
                break;
            }
        }
        return flag;
    }
}