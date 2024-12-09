package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        for(int currentIndex = 0; currentIndex < arr.length - 1; currentIndex++)
        {
            int minimumIndex = currentIndex;
            for(int i = currentIndex + 1; i < arr.length; i++)
            {
                if(arr[i] < arr[minimumIndex])
                {
                    minimumIndex = i;
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
