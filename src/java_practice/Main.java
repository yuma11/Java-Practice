package java_practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person {
	private String name;
	private Integer age;
	Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public Integer getAge() { return age; }
	public String getName() { return name; }
}

public class Main {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("ジョン", 99),
				new Person("カール", 44),
				new Person("フレッド", 39));
		
		Predicate<Person> p = b -> b.getAge() > 40;
		
		List<Person> resultList = list.stream().filter(p).collect(Collectors.toList());
		resultList.forEach(x -> System.out.println(x.getName()));
	}
}