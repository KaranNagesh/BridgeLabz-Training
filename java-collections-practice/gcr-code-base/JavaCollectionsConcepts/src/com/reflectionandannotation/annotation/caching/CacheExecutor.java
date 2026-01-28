package com.reflectionandannotation.annotation.caching;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CacheExecutor {

	// Cache: key → result
	private static final Map<String, Object> cache = new HashMap<>();

	public static Object invokeWithCache(Object target, String methodName, Object... args) {

		try {
			Class<?> clazz = target.getClass();

			// Find method by name + parameter count
			Method method = Arrays.stream(clazz.getMethods())
					.filter(m -> m.getName().equals(methodName) && m.getParameterCount() == args.length).findFirst()
					.orElseThrow(() -> new NoSuchMethodException("Method not found"));

			// Check if @CacheResult is present
			if (method.isAnnotationPresent(CacheResult.class)) {

				// Build cache key
				String cacheKey = clazz.getName() + "." + methodName + Arrays.toString(args);

				// Return cached value if present
				if (cache.containsKey(cacheKey)) {
					System.out.println("Returning cached result...");
					return cache.get(cacheKey);
				}

				// Call method and cache result
				Object result = method.invoke(target, args);
				cache.put(cacheKey, result);

				System.out.println("Computed and cached result...");
				return result;
			}

			// If no annotation, just invoke method
			return method.invoke(target, args);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
