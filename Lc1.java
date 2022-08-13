import java.util.*;

public class Lc1 {
    private static int[] solution1(int[] nums, int target) {
        /**
         * store the numbers in Map as you proceed in the loop
         * then check weather the required number (target - curr) exists in map
         * return curr, if present
         */
        Map<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++) {
            int num = nums[index];
            int required = target - num;
            if(map.containsKey(required)) {
                return new int[]{map.get(required), index};
            }
            map.put(num, index);
        }
        return new int[]{-1, -1};
    }

    private static int[] solution2(int[] nums, int target) {
        /**
         * Sort the array
         * when use 2 pointers, start and end
         * add the values from start and end
         * if(sum == target) return [start, end]
         * if(sum > target) reduce sum by reducing end by 1
         * if(sum < target) increase sum by increasing sum by 1
         */
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum == target) {
                return new int[]{start, end};
            } else if(sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        /**
         * Time Complexity -> O(n)
         * Space Complexity -> O(n)
         */
        int[] sol1 = solution1(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(sol1));
        /**
         * Time Complexity -> O(n*log(n) + n)
         * Space Complexity -> O(1)
         */
        int[] sol2 = solution2(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(sol2));
    }
}
