package annotations.advancedlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Step 1: Define @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value(); // Defines the allowed role
}

// Step 2: Define a class with restricted methods
public class AccessControl {

    private String userRole; // Simulated user role

    public AccessControl(String userRole) {
        this.userRole = userRole;
    }

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed!");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed!");
    }

    // Step 3: Check access before invoking methods
    public void executeMethod(String methodName) {
        try {
            Method method = this.getClass().getDeclaredMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                if (!roleAllowed.value().equals(userRole)) {
                    System.out.println("Access Denied! " + userRole + " cannot access " + methodName);
                    return;
                }
            }

            method.invoke(this); // Execute the method if access is granted
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + methodName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Step 4: Main method to test role-based access
    public static void main(String[] args) {
        AccessControl adminUser = new AccessControl("ADMIN");
        adminUser.executeMethod("adminTask"); // Allowed
        adminUser.executeMethod("userTask"); // Allowed

        System.out.println("------------------");

        AccessControl normalUser = new AccessControl("USER");
        normalUser.executeMethod("adminTask"); // Access Denied
        normalUser.executeMethod("userTask"); // Allowed
    }
}
