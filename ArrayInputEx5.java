import java.util.Scanner;

public class ArrayInputEx5 {
    public static void main(String args[]) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + arr.length + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter " + (i+1) + " no:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Here is what you entered:");
        for (int x : arr) {
            System.out.println(x);
        }

        sc.close();
    }
}
