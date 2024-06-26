package sorting;

import java.util.List;

public class MergeSort {

    public List<Integer> mergeSort(int[] arr, int left, int right) {
        left = 0;
        right = arr.length - 1;
        int mid = (left + right) / 2;

        if (left < right) {
            right = mid - 1;
        }else {
            left = mid + 1;
        }
        return mergeSort(arr, left,right);
    }

}
