package main;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	public int[] convert(String[] nums) {
		int[] values = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i].length() > 0) {
				values[i] = Integer.parseInt(nums[i]);
			}
		}
		return values;
	}

	public int addValues(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] < 1000)
				sum += values[i];
		}
		return sum;
	}

	public boolean checkForNegativeValues(int[] values) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] < 0) {
				return true;
			}
		}
		return false;
	}

	public List<Integer> getNegatives(int[] values) {
		List<Integer> negatives = new ArrayList<>();
		for (int i = 0; i < values.length; i++) {
			if (values[i] < 0)
				negatives.add(values[i]);
		}
		return negatives;
	}

	public int Add(String numbers) {
		numbers = numbers.trim();
		if (numbers.length() == 0)
			return 0;
		else {
			String d = ",";
			int[] values;
			if (numbers.startsWith("//")) {
				int n = numbers.indexOf("\n");
				d = numbers.substring(2, n);
				numbers = numbers.substring(d.length() + 3, numbers.length());
				if (d.charAt(0) == '[') {
					d = d.substring(1, d.length() - 1);
				}
			}
			String[] nums = numbers.split("[" + d + " \n]+");
			values = convert(nums);
			List<Integer> negatives = getNegatives(values);
			if (negatives.size() > 0) {
				throw new ArithmeticException("Negatives not allowed: " + negatives);
			}
			return addValues(values);
		}
	}

}
