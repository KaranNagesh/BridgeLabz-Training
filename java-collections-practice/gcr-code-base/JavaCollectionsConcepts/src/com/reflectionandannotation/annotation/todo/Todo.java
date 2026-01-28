package com.reflectionandannotation.annotation.todo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // Required for reflection
@Target(ElementType.METHOD) // Can be applied to methods
public @interface Todo {

	String task(); // Task description

	String assignedTo(); // Responsible developer

	String priority() default "MEDIUM"; // Optional with default
}
