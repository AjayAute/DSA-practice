import java.util.Arrays;

public class ArrFindMultipleDuplicateArrEx15 {
    public static void findDuplArr(int[] arr){
        Arrays.sort(arr);
        // [1,2,2,3,3,4,5,7] sort array
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                if(i == 0 || arr[i] != arr[i-1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,5,2,3,1};
        findDuplArr(arr);
    }
}
