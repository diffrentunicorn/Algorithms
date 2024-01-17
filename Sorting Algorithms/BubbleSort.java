/**
    BubbleSort O(n2)

Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.
Just like the movement of air bubbles in the water that rise up to the surface, each element of the array move to the end in each iteration.
Therefore, it is called a bubble sort.
 */


public class BubbleSort {

    public static int[] BubbleSort(int[] arr){

        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            for(int j = 0; j< n-1; j++){
                if (arr[j] > arr[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                  }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{12,5,3,78,0,34,45,76};
        arr = BubbleSort(arr);
        for(int i : arr){
            System.out.print(i+ " ");
        }
        
    }
    
}