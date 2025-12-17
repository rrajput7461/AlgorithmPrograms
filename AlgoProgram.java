public class AlgoProgram {
    public static void mergeSort(String[] arr) {
        if (arr.length <= 1) return;
        sort(arr, 0, arr.length);
    }
    private static void sort(String[] arr, int lo, int hi) {
        if (hi - lo <= 1) return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);
        sort(arr, mid, hi);
        merge(arr, lo, mid, hi);
    }
    private static void merge(String[] arr, int lo, int mid, int hi) {
        String[] temp = new String[hi - lo];
        int i = lo, j = mid, k = 0;
        while (i < mid && j < hi) {
            if (arr[i].compareToIgnoreCase(arr[j]) <= 0)
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i < mid)
            temp[k++] = arr[i++];
        while (j < hi)
            temp[k++] = arr[j++];
        for (int x = 0; x < temp.length; x++) {
            arr[lo + x] = temp[x];
        }
    }
}
