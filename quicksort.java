import java.util.Random;
public class quicksort {
    static void swap(int[] arr, int a, int b ) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // middle pivot point, 
    // split from first and second half
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low-1);    // last element before partition

        for(int j = low; j <= high -1; j++) {
            if(arr[j] < pivot) {
                i++; // increment of smaller element
                swap(arr, i, j); // swap elements of first part of string
            }
        }
         swap(arr, i + 1, high);
         return (i+1);
    }

    // Completes two swaps per iteration
    static void quickSort(int[] arr, int low, int high) {
        if(low < high) { 
            int pi = partition(arr, low, high);
            // seperately sort each partition section
            // from before, and after partition
            quickSort(arr, low, pi-1); // first partiton - up to last element
            // second partition - from parition to end
            quickSort(arr, pi+1, high);
            print(arr);
        }
        System.out.println();
    }
    // Produce a random array sample
    public static int[] randomArray() {
        Random rand = new Random();
        int[] arr = new int[20]; // length of random 20 elements, then sorted
        int random = 1;
        for(int i = 0; i < 20; i++ ) {
            arr[i] = random;
            random  = rand.nextInt(20)  + 1; // 1-20
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = randomArray();
        System.out.println("Before any paritions");
        print(arr);
        // 0 - N-1 length - last element
        quickSort(arr, 0, arr.length-1);
        System.out.println("Finished: ");
        print(arr);
    }
}
