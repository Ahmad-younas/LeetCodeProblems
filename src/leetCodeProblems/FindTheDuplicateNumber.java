package leetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;

// Find the Duplicate Number Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {

        if(nums.length == 0){
            return -1;
        }
        Arrays.sort(nums);
        HashSet<Integer> hashSet = new HashSet<>();
        int duplicate = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            int element = nums[i];
            if(!hashSet.add(element)){
                duplicate = element;
            }
        }

        return duplicate;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,4,5,6};
        System.out.println(findDuplicate(num));
    }
}
