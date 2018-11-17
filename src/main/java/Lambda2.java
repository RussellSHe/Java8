import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambda2 {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world！");
            }
        }).start();*/

        new Thread(() -> System.out.println("hello world!")).start();

        List<String> list=Arrays.asList("json","asdsa","hello","world");
        ArrayList<String> list1 = new ArrayList<>();
        //list.forEach(str-> list1.add(str.toUpperCase()));
        list.stream().map(item->item.toUpperCase()).forEach(System.out::println);

        Function<String,String> func=String::toUpperCase;
        System.out.println(func.getClass().getInterfaces()[0]);
    }


}
