package main;

public class StringCalculator {

	public int Add(String numbers) {
		numbers = numbers.trim();
		if (numbers.isEmpty())
			return 0;
		else if(numbers.length()==1)
			return Integer.parseInt(numbers);
		return -1;
	}
}
