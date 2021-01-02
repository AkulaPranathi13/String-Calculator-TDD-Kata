package main;

public class StringCalculator {

	public int Add(String numbers) {
		numbers = numbers.trim();
		if (numbers.isEmpty())
			return 0;
		else if (numbers.length() == 1)
			return Integer.parseInt(numbers);
		else if (numbers.contains(",")) {
			String[] nums = numbers.split(",");
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				sum += Integer.parseInt(nums[i]);
			}
			return sum;
		}
		return -1;
	}
}
