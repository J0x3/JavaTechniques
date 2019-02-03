package arrays;

public class SelectionSort {
    public void sortAscending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int selection = i;
            // find smallest
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[selection]) {
                    selection = j;
                }
            }
            // swap
            int smallerNumber = arr[selection];
            arr[selection] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    public void sortDescending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int selection = i;
            // find biggest
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[selection]) {
                    selection = j;
                }
            }
            // swap
            int biggest = arr[selection];
            arr[selection] = arr[i];
            arr[i] = biggest;
        }
    }
}
