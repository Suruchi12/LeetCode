import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new LinkedList<>();
        
        for(int i = 0;i<len-2 ; i++){
            if(i==0 || nums[i] > nums[i-1]){
                int low = i+1, high = len-1;
                while(low<high){
                    if(nums[i] + nums[low] + nums[high] == 0) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low+1]) low++;
                        while (low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(nums[i] + nums[low] + nums[high] < 0)
                        low ++;
                    else if(nums[i] + nums[low] + nums[high] > 0)
                        high--;
                }
            }
        }
        return result;
    }
}
