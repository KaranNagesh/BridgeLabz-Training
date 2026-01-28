package com.reflectionandannotation.annotation.logging;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // Needed for reflection
@Target(ElementType.METHOD) // Applicable to methods
public @interface LogExecutionTime {
}
