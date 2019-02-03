package arrays;

public class MergeSort {
    private int[] array;
    private int[] tempMergArray;
    private int length;

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArray = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            mergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            mergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArray[i] <= tempMergArray[j]) {
                array[k] = tempMergArray[i];
                i++;
            } else {
                array[k] = tempMergArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArray[i];
            k++;
            i++;
        }
    }
}
