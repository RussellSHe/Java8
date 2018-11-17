import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class CompareString {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("zs","ks","as","ws");

        Collections.sort(list,(o1,o2)->o2.compareTo(o1));
        System.out.println(list);

        CompareString cs = new CompareString();

        List<String> list2 = cs.convert(list, list1 -> list1.subList(0, 2));
        System.out.println(list2);

        String s1 = cs.compute("sa", str -> str + "hello");
        String s2 = cs.compute("sa", str -> str.toUpperCase());
        Function<String,String> func= str->str.toUpperCase();
        System.out.println(cs.compute("sdds",func));

    }

    public List<String> convert(List<String> list, Function<List<String>,List<String>> func){
            return func.apply(list);

    }

    public String compute(String str, Function<String,String> func){
        return func.apply(str);
    }

}
