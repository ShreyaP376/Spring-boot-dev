import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterface {

	public static void main(String[] args) {
		 //Takes input -> no return value
        Consumer<Integer> c = (amount) -> System.out.println("Rupees: " + amount * 90);
        c.accept(100);

        // Takes input -> returns boolean
        Predicate<Integer> p = (age) -> age > 18;
        System.out.println(p.test(20));

        // No input -> returns output
        Supplier<LocalDate> s = () -> LocalDate.now();
        System.out.println(s.get());

        // Takes input -> return some result
        Function<Integer,String> f = (age)->"Age is "+age;
        System.out.println(f.apply(18));

        //Takes two inputs -> returns boolean
        BiPredicate<Integer,Integer> bp =(a,b)->a>=b ;
        System.out.println(bp.test(2,2));

        //Takes two input ->no return
        BiConsumer<String,Integer> bc = (str,num)-> System.out.println(str+" "+num);
        bc.accept("New year",2026);

        //Takes two inputs -> returns result
        BiFunction<Integer,Integer,String> bf = (a,b)->{
            int sum = a+b;
            return "Addition is "+sum;
        };
        System.out.println(bf.apply(12,95));

        //Input and output are same type
        //extends Function<>
        UnaryOperator<Integer> square = (n)->n*n;
        System.out.println(square.apply(3));

        //Two input of same type -> same output
        //extends BiFunction<>
        BinaryOperator<Integer> sum =(a,b)->a+b;
        System.out.println(sum.apply(7,2));
	}
}
