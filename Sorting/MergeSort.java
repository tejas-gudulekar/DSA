


public class MergeSort {
    void mergeSort(int[] array) {
        int[] helperArray = new int[array.length];
        mergeSort(array, helperArray, 0, array.length - 1);
    }

    void mergeSort(int[] array, int[] helperArray, int leftStart, int rightEnd) {
        if (leftStart < rightEnd) {
            int middle = (leftStart + rightEnd) / 2;
            mergeSort(array, helperArray, leftStart, middle);
            mergeSort(array, helperArray, middle + 1, rightEnd);
            merge(array, helperArray, leftStart, middle, rightEnd);

        }
    }

    void merge(int[] array, int[] helperArray, int leftStart, int middle, int rightEnd) {
        // TODO Auto-generated method stub
        for (int i = leftStart; i <= rightEnd; i++) {
            helperArray[i] = array[i];
        }

        int helperLeft = leftStart;
        int helperRight = middle + 1;
        int current = leftStart;

        while (helperLeft <= middle && helperRight <= rightEnd) {
            if (helperArray[helperLeft] <= helperArray[helperRight]) {
                array[current] = helperArray[helperLeft];
                helperLeft++;
            } else {
                array[current] = helperArray[helperRight];
                helperRight++;
            }
            current++;

        }
        int reamining = middle - helperLeft;
        for (int i = 0; i <= reamining; i++) {
            array[current + i] = helperArray[helperLeft + i];
        }
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] arr = {
            92,
            1,
            54,
            33,
            7,
            2,
            96
        };
        m.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
