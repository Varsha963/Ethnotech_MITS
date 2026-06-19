import java.util.Scanner;
public class Insert
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();
        int element = sc.nextInt();

        int[] newArr = new int[n + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        for (int num : newArr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}