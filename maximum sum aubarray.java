class Solution {
    public int maxSubArray(int[] nums) {
        int answer  = nums[0];
        int currentsum = answer;
      
        
        for(int i=1; i<nums.length; i++){
            currentsum = Math.max(nums[i] + currentsum, nums[i]);
            answer = Math.max(currentsum, answer);
            
            
        }
        return answer;
        
    }
}
