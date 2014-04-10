/**
 * Created by yuli on 14-4-10.
 */
public class test {
    public static int fun() {
        int x = 1;
        try
        {
            return x;
        }
        finally
        {
            ++x;
        }
    }

    public static void main(String[] agrs) {
        System.out.println(fun());
    }
}
