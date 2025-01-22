class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // N * log(N)
        for(int i = 0 ; i < n - 2; i++) // N
        {
            int j = i + 1;
            int k = n - 1;
            while(j < k) // N
            {
               int sum = nums[i] + nums[j] + nums[k];
               if(sum == 0)
               {
                  List<Integer> triplet = new ArrayList<>();
                  triplet.add(nums[i]);
                  triplet.add(nums[j]);
                  triplet.add(nums[k]);
                  ans.add(triplet);

                  j++;
                  k--;

                  // Code to avoid duplicate triplets
                  while(j < k && nums[j] == nums[j - 1])
                  j++;

                  while(k > j && nums[k] == nums[k + 1])
                  k--;

               } 
               else if(sum < 0)
               j++;
               else
               k--;

            }
            // Code to avoid duplicate triplets
            while(i < n - 2 && nums[i] == nums[i + 1])
            i++;

        }
        return ans; 
    }
}
// TC : N log(N) + N^2 => O(N^2)
// SC : O(1)
