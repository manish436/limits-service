package com.learn.hcl;


public class LimitConfiguration {
	private int minimum;
	private int maximum;

	public LimitConfiguration() {
	}

	public LimitConfiguration(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}
}
