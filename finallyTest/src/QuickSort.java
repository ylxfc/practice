/**
 * Created by yuli on 14-4-15.
 */
public class QuickSort {
    /**
     * 快速排序
     */
    static int[] a = new int[]{1,4,2};
    public static void quick_sort(int[] arrays, int left, int right) {
        if(left<right) {
            int middle = getMiddle(arrays, left ,right);
            quick_sort(arrays, left, middle-1);
            quick_sort(arrays, middle+1, right);
        }
    }

    private static int getMiddle(int[] arrays, int left, int right) {
        int temp = arrays[left];    //取第一个元素为中值
        while(left<right) {
            while(left<right && arrays[right]>temp){
                right--;
            }
            arrays[left] = arrays[right];
            while (left<right && arrays[left]<temp) {
                left++;
            }
            arrays[right] = arrays[left];
        }
        arrays[left] = temp;
        return left;
    }

    public static void main(String[] args) {
        //int[] a = new int[]{1,4,2,6,3,7,3,8,5,9,3,7,8,5,6,4};
        quick_sort(a, 0, a.length-1);
        System.out.println("-----------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("-----------");

    }
}
