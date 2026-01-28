package com.reflectionandannotation.annotation.roleallowed;

public class RBACDemo {

	public static void main(String[] args) {

		AdminService service = new AdminService();

		// Simulate USER role
		SecurityContext.currentUserRole = "USER";

		RoleBasedAccess.invokeIfAllowed(service, "deleteUser"); //  Denied

		RoleBasedAccess.invokeIfAllowed(service, "viewUser"); //  Allowed

		// Switch to ADMIN role
		SecurityContext.currentUserRole = "ADMIN";

		RoleBasedAccess.invokeIfAllowed(service, "deleteUser"); //  Allowed
	}
}
