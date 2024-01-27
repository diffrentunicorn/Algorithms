/**
    Binary Search O(log n) 
    Note :- only one Requirement here is the Array must be in Sorted Form
 */
public class BinarySearch {


    public static boolean Search(int [] arr, int val){
        int start = 0;
        int end = arr.length;
        int mid;
        while (start< end) {
            mid = (start + end) / 2;
            if(val == arr[mid]){
                return true;
            }
            else if(val < arr[mid]){
                end = mid - 1;
            }
            else if( val > arr[mid]){
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int val = 9;
        

        if (Search(arr, val)) {
            System.out.println("Value Found !!");
        }
        else{
            System.out.println("Value Not Found");
        }

        
    }
}