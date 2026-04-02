class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd = 0, even = 1; 
        int sum = 0, total = 0;
        int mod = 1000000007;
        for (int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                total = (total + odd) % mod;
                even++;
            } else {
                total = (total + even) % mod;
                odd++;
            }
        }
        return total;
    }
}