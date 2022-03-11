package jason.quicksort;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int start, int end) {
        //partitioning
        //오른쪽 partition 시작 index 반환
        int part2 = partition(arr, start, end);
        //partition 의 원소 갯수가 하나이면 더 이상 정렬할 필요 없다.
        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }
        //이하동문
        if (part2 < end) {
            quickSort(arr, part2, end);
        }


    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;

    }

    static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 5, 0, 6, 8, 9};
        int start = 0;
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
