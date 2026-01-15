import java.util.Scanner;

public class InsertionSortSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            for (int i = 0; i < n; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(arr[i]);
            }
            System.out.println();
            j--;
        }

        arr[j + 1] = key;
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
