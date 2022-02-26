package Shinde;

import java.util.function.Function;

public class RemoveSpaceFunctionalExample {
	public static void main(String[] args) {
		String s="Shinde    Dnyaneshwar    From     Pune";
		Function<String, String> f=s1->s1.replaceAll(" ", "");
		System.out.println(f.apply(s));
	}

}
  
