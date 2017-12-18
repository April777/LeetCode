public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        int i = 0, j = 0;
        for(i = 0; i < nums.length; i++)
        	for(j = i+1; j < nums.length; j++){
        		if(nums[i] + nums[j] == target){
        			results[0] = i;
                	results[1] = j;
        		}
        	}        
        
		return results;
    }
}
