package org.example.array.easy.closest_number_to_zero;

import org.example.ArrayInterface;
import org.example.ObjectStore;

import java.util.Scanner;

public class ClosestNumberToZero implements ArrayInterface {

    public void solve(){
        Scanner sc = new Scanner(System.in);

        initialMessage();
        System.out.println("Please add space seperated list of numbers");

        String numString = sc.nextLine();
        int[] nums = getNums(numString);

        System.out.println(closestNumberToZero(nums));

        exitOrBack(new ObjectStore().getEx());

        sc.close();
    }

    public ClosestNumberToZero getObject(){
        return new ClosestNumberToZero();
    }

    private int closestNumberToZero(int[] nums){
        int diff = Integer.MAX_VALUE, closeDiff = 0;
        for (int num : nums) {
            int tempDiff;
            if (num == 0) return 0;
            else if (num < 0) {
                tempDiff = -num;
            } else {
                tempDiff = num;
            }

            if (tempDiff < diff) {
                closeDiff = num;
                diff = tempDiff;
            } else if (tempDiff == diff && num > closeDiff) closeDiff = num;
        }
        return closeDiff;
    }
}