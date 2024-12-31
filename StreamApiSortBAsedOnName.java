package com.ashwani.streamapi_05oct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSortBAsedOnName {
	public static void main(String[] args) {
		List<String> nameOfFruits = Arrays.asList("Shyam", "Ram", "Raman", "Ravi", "Samar","ravi");
		List<String> crs = nameOfFruits.stream().filter(str -> str.toLowerCase().startsWith("r")).collect(Collectors.toList());
		System.out.println(crs);
	}
}
