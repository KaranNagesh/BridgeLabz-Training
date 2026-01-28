package com.reflectionandannotation.annotation.repeatableannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Repeatable(BugReports.class) // 👈 Enables repeatable behavior
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BugReport {
	String description();
}
