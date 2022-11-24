import java.util.function.Function;

class Functioning {
    public static void main(String[] args) {
        Function<Integer,Integer> res=inc_byOne.andThen(mul);
        
        System.out.println(res.apply(1));
    }
    static Function<Integer,Integer> inc_byOne= number ->number+1;
    static Function<Integer,Integer> mul= number -> number*10;
}