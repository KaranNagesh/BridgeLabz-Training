package com.reflectionandannotation.annotation.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Custom annotation definition
@Retention(RetentionPolicy.RUNTIME) // Needed for reflection
@Target(ElementType.METHOD) // Applicable to methods
public @interface TaskInfo {

	int priority(); // Task priority

	String assignedTo(); // Person assigned
}
