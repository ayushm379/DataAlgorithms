public class Lc35 {
    private static int solution(int[] nums, int target) {
        int s = 0, e = nums.length -1 ;
        if(nums[e] < target)
            return e+1;
        while(s < e) {
            int mid = s + (e - s) / 2;
            if(nums[mid] >= target) {
                e--;
            } else {
                s++;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,5,6}, 5));
        System.out.println(solution(new int[]{1,3,5,6}, 7));
    }
}
