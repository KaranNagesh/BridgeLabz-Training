package com.reflectionandannotation.annotation.roleallowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // Needed for reflection
@Target(ElementType.METHOD) // Restrict method access
public @interface RoleAllowed {
	String value(); // Required role
}
