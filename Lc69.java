public class Lc69 {
    private static int sqrt(int num) {
        if (num <= 1)
            return num;
        int left = 2, right = num / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long mid2 = (long) mid * mid;
            if (mid2 == num)
                return mid;
            if (mid2 > num)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return right;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(8));
    }
}
