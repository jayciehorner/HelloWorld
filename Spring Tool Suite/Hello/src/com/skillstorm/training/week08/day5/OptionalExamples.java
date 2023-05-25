package com.skillstorm.training.week08.day5;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;
public class OptionalExamples {
public static void main(String[] args) {
	// Example 1: Create an optional
	Optional <String> opt = Optional.of("cat");
	System.out.println(opt.isPresent());
	System.out.println(opt.get());
	
	// How can I create an optional from a null value?
	Optional<String> opt1 = Optional.ofNullable(null);
	Optional<String>empty = Optional.empty();
	
	System.out.println(opt1.isPresent());
	
	System.out.println(empty.isPresent());
	
	// How can I instead return a default value if the Optional is empty?
	// Choice 1:
	try {
		System.out.println(opt1.get());
		System.out.println(empty.get());
	} catch (NoSuchElementException e) {
		System.out.println("Nothing here to see");
	}
	// Choice 2:
	if (opt1.isPresent())
		System.out.println(opt1.get());
	else
		System.out.println("nothing here to see");
	// Choice 3:
	System.out.println(opt.orElse("Nothing here to see"));
	System.out.println(opt1.orElse("Nothing here to see"));
	System.out.println(empty.orElse("Nothing here to see"));
	// Choice 4:
	System.out.println(opt.orElseGet(()->"Nothing here to see on this beautiful " + LocalDate.now().getDayOfWeek()));
	System.out.println(opt1.orElseGet(()->"Nothing here to see"));
	System.out.println(empty.orElseGet(()->"Nothing here to see"));
	
	// How can I throw a custom exception?
	// Choice 1:
//	System.out.println(opt1.orElseThrow(IllegalArgumentException::new));
//	// Choice 2:
//	try {
//		System.out.println(opt1.get());
//	} catch (NoSuchElementException e) {
//		throw new IllegalArgumentException();
//	}
//	// Choice 3:
//	if (opt1.isPresent())
//		System.out.println(opt1.get());
//	else
//		throw new IllegalArgumentException();
	
	// Example 2: Use reduce without an initial value
	// Create a list of objects
	List<Drink> drinks = new ArrayList<>();
	drinks.add(new Drink("Mountain Dew", 46));
	drinks.add(new Drink("Cranberry juice", 26));
	drinks.add(new Drink("Black coffee", 0));

	// Reduce the list using the .reduce(_) method
	System.out.println(Drink.getLeastSugary(drinks));
	
	List<Drink> lst = new ArrayList<>();
	System.out.println(Drink.getLeastSugary(lst));
	
}
}

class Drink{
	private String name;
	private int sugar; // g per serving
	public Drink(String name, int sugar) {
		super();
		this.name = name;
		this.sugar = sugar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	@Override
	public String toString() {
		return "Drink [name=" + name + ", sugar=" + sugar + "]";
	}
	public static Drink getLeastSugary(List<Drink> drinks) {
		// Create a stream using .reduce to get an Optional
		return drinks.stream().reduce((d1, d2)->{
			if (d1.getSugar() < d1.getSugar())
				return d1;
			return d2;
			}).orElseGet(()-> new Drink("water", 0));
	}
}