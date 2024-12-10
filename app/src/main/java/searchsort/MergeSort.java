package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override

    public void sort(int[] arr) { 
        int[] aux = new int[arr.length];
        mergesort(arr, aux, 0, arr.length - 1);
    }    

    private void mergesort(int[] arr, int[] aux, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergesort(arr, aux, low, mid);
        mergesort(arr, aux, mid + 1, high);
        merge(arr, aux, low, mid, high);    
    }
    
    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int low, int mid, int high){
        for(int k = low; k <= high; k++)
            aux[k] = arr[k];
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                arr[k] = aux[j];
                j++;
            }
            else if (j > high) {
                arr[k] = aux[i];
                i++;
            }
            else if (aux[j] < aux[i]) {
                arr[k] = aux[j];
                j++;
            }
            else {
                arr[k] = aux[i];
                i++;
            }
        }
    }   
}
