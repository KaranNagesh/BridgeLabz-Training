package com.reflectionandannotation.annotation.roleallowed;

import java.lang.reflect.Method;

public class RoleBasedAccess{

    public static void invokeIfAllowed(
            Object obj,
            String methodName) {

        try {
            Class<?> clazz = obj.getClass();
            Method method = clazz.getMethod(methodName);

            // Check if method has @RoleAllowed
            if (method.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed roleAllowed =
                        method.getAnnotation(RoleAllowed.class);

                String requiredRole = roleAllowed.value();

                // Validate role
                if (!SecurityContext.currentUserRole.equals(requiredRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }

            // Invoke method if allowed
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

