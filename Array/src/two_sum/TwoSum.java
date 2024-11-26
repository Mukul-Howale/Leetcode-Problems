package two_sum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> storeDiff = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(storeDiff.containsKey(diff)) return new int[]{storeDiff.get(diff), i};
            storeDiff.put(nums[i],i);
        }
        return new int[2];
    }
}
