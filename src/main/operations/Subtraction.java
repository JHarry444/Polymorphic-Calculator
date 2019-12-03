package main.operations;

public class Subtraction implements Operation{

	@Override
	public double calculate(double... nums) {
		double result = 0;
		for (double d : nums) {
			result -= d;
		}
		return result;	}

}
