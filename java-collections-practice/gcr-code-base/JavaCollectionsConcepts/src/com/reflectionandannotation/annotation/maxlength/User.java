package com.reflectionandannotation.annotation.maxlength;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validate(username);
        this.username = username;
    }

    // Validation logic using Reflection
    private void validate(String value) {

        try {
            // Get field reference
            Field field = this.getClass().getDeclaredField("username");

            // Check if @MaxLength is present
            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength maxLength =
                        field.getAnnotation(MaxLength.class);

                if (value.length() > maxLength.value()) {
                    throw new IllegalArgumentException(
                        "Username length must not exceed " +
                        maxLength.value() + " characters"
                    );
                }
            }

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUsername() {
        return username;
    }
}
