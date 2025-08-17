public class ArrPairSumEx10 {
    public static int pairSum(int[] arr, int target){
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    ++count;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 6;

        int result = pairSum(arr, target);
        System.out.println("Number of pair with sum :" + target + " = " + result);


    }
}
