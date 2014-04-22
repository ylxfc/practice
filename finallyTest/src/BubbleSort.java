/**
 * Created by yuli on 14-4-22.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 5, 3, 7, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
