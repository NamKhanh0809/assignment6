package assign6;

import java.util.*;

public class exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many elements in array: ");
        int elm = scanner.nextInt();
        int[] arr = new int[elm];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < elm; i++) {
            System.out.println("element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();

            sum =sum+ arr[i];

        }
        avg =  (double) sum / elm;
        System.out.println("sum element: " + sum);
        System.out.println("avg element: " + avg);
    }
}
