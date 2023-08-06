package MedianOfTwoSortedArrays;

public class MedianOfTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int len = m;
            m = n;
            n = len;
        }

        int low = 0;
        int high = m;

        while (low <= high) {
            int x = (low + high) / 2;
            int y = (m + n + 1) / 2 - x;

            int maxX = (x == 0) ? Integer.MIN_VALUE : nums1[x - 1];
            int maxY = (y == 0) ? Integer.MIN_VALUE : nums2[y - 1];

            int minX = (x == m) ? Integer.MAX_VALUE : nums1[x];
            int minY = (y == n) ? Integer.MAX_VALUE : nums2[y];

            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return (Math.max(maxX, maxY));
                }
            } else if (maxX > minY) {
                high = x - 1;
            } else {
                low = x + 1;
            }
        }
        throw new IllegalArgumentException("Incorrect arrays");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
