package com.tdd.practices;

public class NumberChecker {

	public Boolean isPrefectNumber(int number) {
		boolean isPerfect = false;
		if (number > 1) {
			int temp = 0;
			for (int i = 1; i <= number / 2; i++) {
				if (number % i == 0) {
					temp += i;
				}
			}
			if (temp == number) {
				isPerfect = true;
			} else {
				isPerfect = false;
			}
		}

		return isPerfect;
	}

}
