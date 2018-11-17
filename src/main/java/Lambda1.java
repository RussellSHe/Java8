import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
@FunctionalInterface
interface myinterface{
    void test();
    String toString();//接口继承了根类 重写根类的公共方法 抽象方法个数不增加
}

public class Lambda1 {

    public void myinterfaceimpl(myinterface mi){
        System.out.println("s");
        mi.test();
        System.out.println("e");
    }

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,2,51,32,123,4);
       /* for (Integer i : list) { //外部迭代
            System.out.println(i);
        }
        System.out.println("-------------------------");
*/
        list.forEach(new Consumer<Integer>() {  //内部迭代
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("----------------");

        list.forEach(i -> System.out.println(i));
      //  list.forEach(System.out::println);

        Lambda1 lambda1 = new Lambda1();

        /*lambda1.myinterfaceimpl(new myinterface() {
            @Override
            public void test() {
                System.out.println("test");
            }
        });*/

        lambda1.myinterfaceimpl(() ->{
            System.out.println("test");
        });
    }

}
