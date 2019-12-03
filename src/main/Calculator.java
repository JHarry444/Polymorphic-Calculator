package main;

import main.operations.Operation;

public class Calculator {

	public static double calculate(Operation op, double... nums) {
		return op.calculate(nums);
	}
}
