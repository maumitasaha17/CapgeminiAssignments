package Day11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * Predefined functional interfaces
 *consumer, supplier, function, predictor
 *java.lang.function
 *
 *
 *Consumer - javap java.util.function.Consumer - consume but wont take anything
 *consumer<T>
 *public abstract void accept(T);
 *Consumer m =(msg)->System.out.println(msg);
 *
 *
 *
 *Predictor - javap java.util.function.Predicate - 
 *Predicate<T>
 *public abstract boolean test(T);
 *
 *
 *
 *Suplier - javap java.util.function.Supplier - wont consume any thing but will return
 *Supplier<T>
 *public abstract T get();
 *
 *
 *
 *Function - javap java.util.function.Function -
 * functoin<T,R>
 * public abstract R apply(T);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class PreDefinedFunctionInterface {

	public static void main(String[] args) {

		// Consumer
		Consumer consumer = (msg) -> System.out.println(msg);
		consumer.accept("HI");

		// Supplier
		// Supplier supplier = ()->{return T;};
		// Supplier supplier= ()->T;
		Supplier supplier = () -> 10 * 10;
		Supplier supplier1 = () -> "Hello";
		System.out.println(supplier.get());
		System.out.println(supplier1.get());

		// Predicate
		// (T)->{return true/false}
		// (T)->true
		Predicate<Integer> belowAge = (age) -> age > 18;
		System.out.println(belowAge.test(10));

		// Function
		// (T)->{return r;};
		// (T)->R;
		Function<Integer, Integer> sqr = (num) -> num * num;
		System.out.println(sqr.apply(10));

	}

}
