package com.ashwani.streamapiterminal;

import java.util.List;
import java.util.stream.Stream;

public class StreamApiTerminalDemo1 {
	public static void main(String[] args) {
		// count ->it will count the element
		long count = Stream.of("Ashwani", "Armaan", "Atish", "Abhinav").count();
		System.out.println(count);
		System.out.println("==============");
		List<String> list = List.of("Ashwani", "Armaan", "Abhijeet", "Abhishek", "Raj", "Rishiu", "Kaveri");
		long count2 = list.stream().filter(n -> n.length() > 3).count();
		System.out.println(count2);
		System.out.println("===================");
		// count unique element
		List<String> list1 = List.of("Raj", "Raj", "Annie", "Virat", "Raj");
		long count3 = list1.stream().distinct().count();
		System.out.println(count3);
	}
}
