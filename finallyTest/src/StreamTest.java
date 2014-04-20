import java.util.stream.IntStream;

/**
 * Created by yuli on 14-4-18.
 */
public class StreamTest {
    public static void main(String[] args) {
        long t1 = System.nanoTime();
        //初始化一个范围100万整数流,求能被2整除的数字，toArray（）是终点方法
        //单核
        int a[] = IntStream.range(0, 1_000_000).filter(p -> p % 2 == 0).toArray();
        long t2 = System.nanoTime();
        //多核
        int b[] = IntStream.range(0, 1_000_000).parallel().filter(p -> p % 2 == 0).toArray();
        long t3 = System.nanoTime();
        //显示结果
        System.out.printf("serial: %.2fs, parallel %.2fs%n", (t2 - t1) * 1e-9, (t3 - t2) * 1e-9);

    }
}
