package com.dal.streameg;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerEg {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Shiro");
		names.add("Salomy");
		names.add("Anu");
		names.add("Akash");
		Consumer<String> printName = (name) -> System.out.println(name);
		names.forEach(printName);
		}
}