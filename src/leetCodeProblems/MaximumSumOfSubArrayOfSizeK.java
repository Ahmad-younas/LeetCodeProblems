// Find the Maximum sum of a Subarray of size k
package leetCodeProblems;

public class MaximumSumOfSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int maxSum = FindMaxSumSubArray(arr,3);
        System.out.println(maxSum);
    }

    public static int FindMaxSumSubArray(int[] arr, int k){
        if(arr == null || arr.length<k || k<=0) throw new IllegalArgumentException("Invalid Input");

        int maxSum =0;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // Add the next element to the window
            if (windowEnd >= k - 1) { // Once we hit the window size of 'k'
                maxSum = Math.max(maxSum, windowSum); // Update max sum if needed
                windowSum -= arr[windowStart]; // Subtract the element going out of the window
                windowStart++; // Slide the window ahead by one element
            }
        }

        return maxSum;
    }
}
