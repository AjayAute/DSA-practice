import java.util.Arrays;

//You have been given an integer array ARR of size N which contains numbers from 0 to (N2).
//Each number is present at least once. That is, if N = 5. the array constitutes values
//ranging from 0 to 3 and among these, there is a single integer value that is present twice.
//You need to find and return that duplicate number present in the array.
//TEST CASE 1:
//Input: 0,2,1,3,1
//Output: 1
//TEST CASE 2:
//Input: 0,3,1,5,4,3,2
//Output: 3
//
import java.util.Arrays;

public class ArrDuplicateArrayEx14 {

    // Method 1: Sorting-based approach
    // Time Complexity: O(n log n) because of sorting
    // Space Complexity: O(1) (in-place sorting)
    // - Easy to implement
    // - But it changes the original array order (since sorting is applied)
    public static void findDuplArr(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate (Sorting approach): " + arr[i]);
                break;
            }
        }
    }

    // Method 2: Brute-force approach (Nested loops)
    // Time Complexity: O(n^2) (not efficient for large arrays)
    // Space Complexity: O(1)
    // - Keeps the original array order
    // - But very slow if array size is large
    public static void findDupArr(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate (Brute force): " + arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0, 2, 1, 3, 1};

        findDuplArr(arr); // Uses sorting
        findDupArr(arr);  // Uses nested loops
    }
}
