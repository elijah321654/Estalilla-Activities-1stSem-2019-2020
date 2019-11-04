
import java.util.Scanner;

public class ArrayAscending {

    public static void main(String[] args) {
        int n;
        double mean = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a element " + i + ":");
            a[i] = sc.nextInt();
        }
        System.out.print("Unsorted array: ");
        for (int x = 0; x < n; x++) {
            System.out.print(a[x] + ",");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\nSorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");

        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        mean = sum / n;
        System.out.print("Mean: " + mean);

    }

}
