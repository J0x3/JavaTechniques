package arrays;

public class BinarySearch {
    public int iterativeSearch(int arr[], int size, int key) {
        int low = 0, high = size-1;
        while (high >= low) {
            int mid = (low + high)/2;
            if (key<arr[mid]) {
                high = mid-1;
            }
            else if (key == arr[mid]) {
                return mid;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
    public int recursiveSearch(int arr[], int l, int r, int x) {
        if (r>=l) {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return recursiveSearch(arr, l, mid-1, x);
            return recursiveSearch(arr, mid+1, r, x);
        }
        return -1; //value not found
    }
}
