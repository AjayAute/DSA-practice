//You have been given an integer array of size N that contains only integers, 0 and 1.
//Write a function to sort this array.
//Think of a solution which scans the array only once and doesn't require use of an extra array.
//TEST CASE 1:
//0 1 1 0 1 0 1
//OUTPUT
//0,0,0,1,1,1,1
//TEST CASE 2:
//1 0 1 1 0 1 0 1
//OUTPUT
//0,0,0,1,1,1,1,1

import java.util.Arrays;

public class ArrSortZeroOneEx12 {
    public static void sortOneAndZero(int[] arr){
        int left = 0, right = arr.length-1;
        int temp;
        while (left < right){
            if(arr[left] == 1){
                if(arr[right] != 1){
                    temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                right--;
            }else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {0,1,1,0,1,0,1};
        sortOneAndZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
