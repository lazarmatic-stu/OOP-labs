package org.example.lab10.task1;

public class MessagingSystem {

    @CanSendMessage
    @RequiredPermission(level = "admin")
    public static void sendMessage(User user, String message) {
        if (hasPermission(user, "admin")) {
            System.out.println(user.getUsername() + " is admin and he sent the message: " + message);
        } else if (hasPermission(user, "regular")) {
            System.out.println(user.getUsername() + " is restricted from sending messages.");
        } else {
            System.out.println("User " + user.getUsername() + " doesnt have permission to send messages.");
        }
    }

    private static boolean hasPermission(User user, String requiredPermission) {
        UserPermission userPermission = user.getClass().getAnnotation(UserPermission.class);
        if (userPermission == null) {
            return false;
        }
        String userPermissionLevel = userPermission.level();
        if (userPermissionLevel.equals(requiredPermission)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        User regularUser = new RegularUser("lazaruser");
        User adminUser = new AdminUser("lazaradmin");

        System.out.println("Regular user trying: ");
        sendMessage(regularUser, "Regular user message");

        System.out.println("");

        System.out.println("Admin user trying: ");
        sendMessage(adminUser, "Admin user message");
    }
}
