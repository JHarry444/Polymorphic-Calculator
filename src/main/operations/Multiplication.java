package main.operations;

public class Multiplication implements Operation{

	@Override
	public double calculate(double... nums) {
		double result = 0;
		for (double d : nums) {
			result *= d;
		}
		return result;	}

}
