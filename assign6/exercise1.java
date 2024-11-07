package assign6;

import java.util.*;

public class exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many elements in array: ");
        int elm = scanner.nextInt();
        int[] arr = new int[elm];
        for (int i = 0; i < elm; i++) {
            System.out.println("element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        int max = arr[0], min = arr[0];
        for (int i = 0; i < elm; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("lastgest element: " + max);
        System.out.println("smallest element: " + min);
    }

}
