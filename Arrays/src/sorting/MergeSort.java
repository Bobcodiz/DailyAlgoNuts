package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public int[] divide(int[] arr, int left, int right) {
        left = 0;
        right = arr.length - 1;
        int mid = (left + right) / 2;

        if (left < right) {
            right = mid - 1;
            divide(arr, left,right);
        }else {
            left = mid + 1;
            divide(arr, left, right);
        }
        return arr;
    }
    public List<Integer> merge(int[] arr){
        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while()
    }

}
