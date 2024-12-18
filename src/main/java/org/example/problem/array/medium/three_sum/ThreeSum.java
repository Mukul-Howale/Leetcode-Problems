package org.example.problem.array.medium.three_sum;

import org.example.CommonInterface;
import org.example.problem.array.ArrayInterface;
import org.example.ObjectStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum implements ArrayInterface, CommonInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage(this);
        System.out.println("Please add space seperated list of numbers to be added to nums[]");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        List<List<Integer>> targetList = threeSum(nums);
        System.out.println(targetList);

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    private List<List<Integer>> threeSum(int[] nums) {
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
