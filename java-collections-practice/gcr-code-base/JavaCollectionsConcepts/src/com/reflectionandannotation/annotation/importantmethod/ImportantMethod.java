package com.reflectionandannotation.annotation.importantmethod;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // Needed for reflection
@Target(ElementType.METHOD) // Can be applied to methods only
public @interface ImportantMethod {
	String level() default "HIGH"; // Optional parameter with default
}