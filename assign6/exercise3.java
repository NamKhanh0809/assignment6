package assign6;

import java.util.*;

public class exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many delements in array: ");
        int elm = scanner.nextInt();

        int[] arr = new int[elm];
        int count = 0;

        for (int i = 0; i < elm; i++) {
            System.out.println("element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();

        }
        System.out.print("press elenment you find: ");
        int find = scanner.nextInt();
        for (int i = 0; i < elm; i++) {
            if (find == arr[i]) {
                count = count + 1;
            }

        }

        System.out.println("Occurrences of an Element in the Array: " + count);

    }
}
