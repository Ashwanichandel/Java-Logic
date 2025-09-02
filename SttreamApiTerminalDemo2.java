package com.ashwani.connectionjdbc;

import java.util.List;

public class SttreamApiTerminalDemo2 {
public static void main(String[] args) {
	List<String> listOfName=List.of("Raj","Vishal","Vickey","Rohit","kartik");
	long count = listOfName.stream().map(String::toUpperCase)
	.filter(s->s.contains("V")).distinct().count();
	System.out.println(count);
}
}
