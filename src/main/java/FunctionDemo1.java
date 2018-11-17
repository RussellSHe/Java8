import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo1 {

    public static void main(String[] args) {
        FunctionDemo1 fc = new FunctionDemo1();

        System.out.println(fc.compute1(2,v->v*3,v->v*v));
        System.out.println(fc.compute2(2,v->v*3,v->v*v));
        System.out.println(fc.compute3(2,3,(a,b)->a*b));
        System.out.println(fc.compute4(2,3,(a,b)->a+b,v->v*v));
    }

    public int compute1(int a, Function<Integer,Integer> fun1,Function<Integer,Integer> fun2){
        return fun1.compose(fun2).apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> fun1,Function<Integer,Integer> fun2){
        return fun1.andThen(fun2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer,Integer,Integer> func){
        return func.apply(a,b);
    }

    public int compute4(int a,int b, BiFunction<Integer,Integer,Integer> func1,Function<Integer,Integer> func2){
        return func1.andThen(func2).apply(a,b);
    }
}
