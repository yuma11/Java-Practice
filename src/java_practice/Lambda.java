package java_practice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda {
	
	public static void lambdaAction() {
		
		// 「供給者」引数を受け取らないが、値を返す
		Supplier<String> sup = () -> "Sipplier";
		System.out.println(sup.get());
		
		// 「消費者」引数を受け取るが、値を返さない
		Consumer<String> con = str -> System.out.println(str);
		con.accept("Consumer");
		
		// 引数を受け取り、値を返す
		Function<String, String> func = str -> str + "!!";
		System.out.println(func.apply("Function"));
		
		// 引数を２つ受け取り、値を返す
		BiFunction<String, String, String> biFunc = (str1, str2) -> str1 + str2;
		System.out.println(biFunc.apply("BiFunction", "!!"));
		
		// 引数を受け取り、引数と同じ型の値を返す
		UnaryOperator<String> unary = str -> str + "!!";
		System.out.println(unary.apply("UnaryOperator"));
		
		// 同じ型の引数２つを受け取り、引数の型と同じ型の値を返す（３つ全て同じ型）
		BinaryOperator<String> binary = (str1, str2) -> str1 + str2;
		System.out.println(binary.apply("BinaryOperator", "!!"));
		
		// 引数として受け取った値を評価し、Boolean型を返す
	    Predicate<String> predic = str -> str.equals("Predicate");
	    System.out.println(predic.test("Predicate"));
	}
		
}
