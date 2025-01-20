class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int product = 1;
        for(int i = n - 1 ; i >= 0 ; i--) // N
        {
            product = product * nums[i];
            ans[i] = product;
        }
        
        product = 1;
        for(int i = 0 ; i < n - 1 ; i++) // N
        {
            ans[i] = product * ans[i + 1];
            product = product * nums[i];
        }

        ans[n - 1] = product;

        return ans;
    }
}
// TC : N + N => O(2N)
// SC : O(1) 
