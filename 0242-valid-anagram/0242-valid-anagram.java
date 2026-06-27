class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa=s.toCharArray();
        Arrays.sort(sa);
        char[] ta=t.toCharArray();
        Arrays.sort(ta);
        return Arrays.equals(sa,ta);
    }
}