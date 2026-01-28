package com.reflectionandannotation.annotation.serialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // Needed for reflection
@Target(ElementType.FIELD) // Apply to fields only
public @interface JsonField {
	String name();
}
