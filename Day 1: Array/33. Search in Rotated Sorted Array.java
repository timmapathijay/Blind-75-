class Solution {
    public int find(int[] nums , int low , int high , int target)
    {
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
            return mid;
            else if(nums[mid] < target)
            low = mid + 1;
            else
            high = mid - 1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int index = -1;
        int pivotPoint = -1;
        int low = 0;
        int high = nums.length - 1;
        // To get the pivot point
        while(low <= high) 
        {
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[high])
            low = mid + 1;
            else if(nums[mid] < nums[high])
            high = mid;
            else if(nums[mid] == nums[high])
            {
                pivotPoint = mid;
                break;
            }
        }
        index = find(nums , 0 , pivotPoint - 1 , target);
        if(index == -1)
        index = find(nums , pivotPoint , nums.length - 1 , target);
        return index;
        
    }
}
