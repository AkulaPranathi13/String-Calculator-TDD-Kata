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
			if(nums.length==2)
				return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			else
				return -1;
		}
		return -1;
	}
}
