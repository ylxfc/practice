import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by yuli on 14-4-17.
 */
public class lambdaTest {
    /**
     * lambda表达式内部迭代示例
     */
    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        persons.add("dada");
        persons.add("dad1");
        persons.add("dad2");
        persons.add("dad3");
        persons.add("dad5");

        for (String s : persons) {
            System.out.println(s);
        }

        System.out.println("----------------------------");
        persons.forEach(System.out::println);
    }
}
