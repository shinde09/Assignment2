package Shinde;

import java.util.function.Predicate;

public class DemoOnPredicateChaining {
	public static void main(String[] args) {
		
		Predicate<Integer>greaterThan=marks->marks>=40 && marks<=100;
//		Predicate<Integer>lessThan=marks->marks<=100;
		boolean result=greaterThan.test(45);
		System.out.println(result);
		
	}

}
