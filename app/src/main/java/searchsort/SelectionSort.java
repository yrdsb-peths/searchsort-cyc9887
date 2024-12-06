package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        for(int currentIndex = 0; currentIndex < arr.length - 1; i++)
        {
            int minimumIndex = 0;
            for(int i = currentIndex + 1; i < arr.length - 1; i++)
            {
                if(arr[i + 1] < arr[i])
                {
                    minimumIndex = i + 1;
                }
            }
            if(arr[minimumIndex] < arr[currentIndex])
            {
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }
    }
}
