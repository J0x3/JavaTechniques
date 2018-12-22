package Arrays;

public class InsertionSort {
    /*
         for j ←1 to length(A)-1
         key ← A[ j ]
         > A[ j ] is added in the sorted sequence A[0, .. j-1]
         i ← j - 1
         while i >= 0 and A [ i ] > key
             A[ i +1 ] ← A[ i ]
             i ← i -1
         A [i +1] ← key
     */
    public void sort(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int prev = j-1;
            while ((prev >= 0) && (arr[prev] > key)) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = key;
        }
    }
}
