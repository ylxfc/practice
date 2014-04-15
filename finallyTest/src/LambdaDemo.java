/**
 * Created by yuli on 14-4-10.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        LambdaDemo.runThreadUseInnerClass();
        LambdaDemo.runThreaduseLambda();
    }
    public static void runThreaduseLambda() {
        //Runnable是一个函数接口，只包含了有个无参数的，返回void的run方法；
        //所以lambda表达式左边没有参数，右边也没有return，只是单纯的打印一句话
        new Thread(()->System.out.println("Lambda实现的线程！")).start();
    }
    public static void runThreadUseInnerClass() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部类实现的线程");
            }
        }).start();
    }
}
