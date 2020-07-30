package java_practice;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda {
	
	public static void lambdaAction() {
		
		Supplier<String> sup = () -> "Sipplier";
		System.out.println(sup.get());
		
		Consumer<String> con = str -> System.out.println(str);
		con.accept("Consumer");
		
		Function<String, String> func = str -> str + "!!";
		System.out.println(func.apply("Function"));
		
		BiFunction<String, String, String> biFunc = (str1, str2) -> str1 + str2;
		System.out.println(biFunc.apply("BiFunction", "!!"));
	}
		
}
