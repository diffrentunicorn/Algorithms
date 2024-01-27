/*
    Linear Search O(n)

 */

import java.util.Scanner;

public class LinearSearch {

    public static boolean search(int[] arr, int val){
        
        for(int i= 0; i< arr.length; i++){
            if (val == arr[i]) {
                return true;
            }
        }
        return false;
    } 

    public static void main(String[] args) {
        int[] arr = new int[]{12,34,56,43,60,98,67,52,48,89};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int val = sc.nextInt();
        
        if (search(arr, val)) {
            System.out.println("Value found");
        }
        else{
            System.out.println("Value not Found");
        }
        sc.close();
    }
    
}