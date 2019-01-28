import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[100];
        int length = nums.length;
        
        for(int i=0;i<length;i++){
         
            int diff = target - nums[i];
            Integer diffIndex = map.get(diff);
            //diffIndex != null
            if(map.containsKey(diff)){
                
                return new int[]{diffIndex,i};
            }
            
            map.put(nums[i],i);
        }
        return result;
    }
}