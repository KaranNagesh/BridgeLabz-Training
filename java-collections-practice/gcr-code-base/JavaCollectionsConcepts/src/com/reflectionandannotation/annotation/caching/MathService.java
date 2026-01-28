package com.reflectionandannotation.annotation.caching;

public class MathService {

	@CacheResult
	public int slowSquare(int x) {

		// Simulate expensive computation
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return x * x;
	}
}
