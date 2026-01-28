package com.reflectionandannotation.annotation.maxlength;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // Needed for reflection
@Target(ElementType.FIELD) // Applied to fields only
public @interface MaxLength {
	int value();
}
