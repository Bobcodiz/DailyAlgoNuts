class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[nums1.length + nums2.length];

        // Merge the two arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1, if any
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2, if any
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        double median;
        if (result.length % 2 == 0) {
            median = (result[result.length / 2 - 1] + result[result.length / 2]) / 2.0;
        } else {
            median = result[result.length / 2];
        }
        return median;
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArray sol = new MedianOfTwoSortedArray();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 6, 7, 8, 8};
        double median = sol.findMedianSortedArrays(nums1, nums2);
        for (int i = 0; i < median; i++) {
            System.out.println(nums1[i]);
        }
        System.out.println(median);
    }
}
