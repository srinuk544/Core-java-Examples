import java.util.HashMap;

public class LongestZeroSumSubarray {

	public static int longestSubarrayWithZeroSum(int[] arr) {
		// HashMap to store the first occurrence of each prefix sum
		HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

		int prefixSum = 0;
		int maxLength = 0;

		for (int i = 0; i < arr.length; i++) {
			// Update the prefix sum
			prefixSum += arr[i];

			// Check if prefix sum is zero
			if (prefixSum == 0) {
				maxLength = i + 1; // Subarray from index 0 to i
			}

			// Check if prefix sum was seen before
			if (prefixSumMap.containsKey(prefixSum)) {
				// Calculate the length of the subarray
				int previousIndex = prefixSumMap.get(prefixSum);
				int subarrayLength = i - previousIndex;
				if (subarrayLength > maxLength) {
					maxLength = subarrayLength;
				}
			} else {
				// Store the prefix sum with its index
				prefixSumMap.put(prefixSum, i);
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, -2, 4, -4 };
		System.out.println(longestSubarrayWithZeroSum(arr)); // Output: 3
	}
}
