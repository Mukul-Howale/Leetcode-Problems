package three_sum;

import interfaces.ArrayInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum implements ArrayInterface {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i == 0 || nums[i-1] != nums[i]){
                twoSum(i,nums,list);
            }
        }
        return list;
    }
    private void twoSum(int i, int[] nums, List<List<Integer>> list){
        int p1 = i+1;
        int p2 = nums.length-1;
        while(p1 < p2){
            int sum = nums[i] + nums[p1] + nums[p2];
            if(sum > 0){
                p2--;
            }
            else if(sum < 0){
                p1++;
            }
            else{
                list.add(Arrays.asList(nums[i],nums[p1],nums[p2]));
                p1++;
                p2--;
                while(p1 < p2 && nums[p1] == nums[p1-1]){
                    p1++;
                }
            }
        }
    }
}
