import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yuli on 14-4-20.
 */
public class ConcurrentHashMapCanche {
    static Map<Integer,Integer> cache = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        long t1 = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            System.out.println("f(" + i + ") =" + fibonacci(i));
        }
        long t2 = System.nanoTime();
        System.out.println((t2 - t1) * 1e-9);
    }

    static int fibonacci(int i) {
        if (i == 0) {
            return i;
        }
        if (i == 1) {
            return 1;
        }
        System.out.println("f(" + i + ")的结果");
//        return fibonacci(i - 2) + fibonacci(i - 1);
        return cache.computeIfAbsent(i, (key)->fibonacci(i-2)+fibonacci(i-1));
    }
}
