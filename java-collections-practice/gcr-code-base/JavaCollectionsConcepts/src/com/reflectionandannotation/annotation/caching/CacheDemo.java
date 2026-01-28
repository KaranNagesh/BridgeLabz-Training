package com.reflectionandannotation.annotation.caching;

public class CacheDemo {

	public static void main(String[] args) {

		MathService service = new MathService();

		// First call (slow)
		System.out.println(CacheExecutor.invokeWithCache(service, "slowSquare", 5));

		// Second call (cached)
		System.out.println(CacheExecutor.invokeWithCache(service, "slowSquare", 5));

		// Different input → recompute
		System.out.println(CacheExecutor.invokeWithCache(service, "slowSquare", 6));
	}
}
