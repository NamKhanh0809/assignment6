package assign6;

import java.util.*;

public class exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many delements in array: ");
        int elm = scanner.nextInt();

        int[] arr = new int[elm];
        int tam = 0;

        for (int i = 0; i < elm; i++) {
            System.out.println("element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();

        }

        for (int i = 0; i < elm; i++) {
            for (int j = 0; j < elm; j++) {
                if (arr[i] < arr[j]) {
                    tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
            }

        }

        System.out.println("after soft:");
        for (int i = 0; i < elm; i++) {
            System.out.println("element " + (i + 1) + " : " + arr[i]);

        }
    }
}
