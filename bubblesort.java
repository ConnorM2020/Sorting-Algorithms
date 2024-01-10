import java.util.Random;

public class bubblesort {
    // easier to have single function
    // instead of repeating code
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
     // Produce a random array sample
    public static int[] randomArray() {
        Random rand = new Random();
        int[] arr = new int[20]; // length of random 20 elements, then sorted
        for(int i = 0; i < 20; i++ ) {
            arr[i] = rand.nextInt(20)  + 1; // 1-20
        }
        return arr;
    }
    // sorting function
    public static void bubbleSort(int[] arr) {
        // two pointers, swap i, with j+1, j+2 and so forth
        // then change position of i, and repeat
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = randomArray();
        System.out.println("Before paritions");
        print(arr);

        bubbleSort(arr);
        System.out.println("After paritions");
        print(arr);

    }
    
}
