package Shinde;

import java.util.function.Predicate;

public class PredicateNamesStartsWithK {
	public static void main(String[] args) {
		
	
	String []names= {"Sham","Ram","Krishna","Sunil","Karan"};
	Predicate<String>NameStartsWithK=s->s.charAt(0)=='K';
	System.out.println("Name Start with K is --> ");
	for(String s:names) {
		if(NameStartsWithK.test(s)) {
			System.out.println(s);
		}
	}

}}
