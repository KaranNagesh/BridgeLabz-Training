package com.reflectionandannotation.reflection.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Annotation available at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}
