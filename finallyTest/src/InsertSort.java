/**
 * Created by yuli on 14-4-15.
 */
public class InsertSort {
    /**
     * 直接插入排序
     */
    public void insert_sort(int arrays[]) {
        int temp = 0;
        int i,j;
        for(i=1;i<arrays.length;++i) {
            if(arrays[i]<arrays[i-1]) {
                temp = arrays[i];
                j = i-1;
                do {
                    arrays[j+1] = arrays[j];
                    j--;
                }while (j>=0 && temp<arrays[j]);
                arrays[j+1] = temp;
            }
        }
        for (int k=0;k<arrays.length;++k) {
            System.out.print(arrays[k]);
        }
    }

    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        int[] a = new int[]{1,2,2,4,1,3,6,2,7,4};
        is.insert_sort(a);
    }
}
