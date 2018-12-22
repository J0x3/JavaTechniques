package Arrays;

public class LinearSearch {
    public int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        // not found
        return -1;
    }
}
