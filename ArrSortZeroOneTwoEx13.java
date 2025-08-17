
//You have been given an integer array of size 'N'. It only contains Os, 1s and 2s.
// Write a solution to sort this array.
//Try to solve the problem in 'Single Scan'.
//" Single Scan' refers to iterating over the array just once or to put it in other words,
// you will be visiting each element in the array just once.
//TEST CASE 1:
//Input: 012210

//Output: 001122

//TEST CASE 2:
//Input: 0121212

//Output:00111222

import java.util.Arrays;

public class ArrSortZeroOneTwoEx13 {
    public static void sortZeroOneTwo(int[] arr){
        int left = 0, right = arr.length-1;
        int current = 0;
        int temp;

        while (current <= right){
            if (arr[current] == 0){
                temp = arr[left];
                arr[left] = arr[current];
                arr[current] = temp;
                left++;
                current++;
            }else if(arr[current] == 2) {
                temp = arr[current];
                arr[current] = arr[right];
                arr[right] = temp;
                right--;

            }else {
                current++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,1,2,1,2};
        sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
