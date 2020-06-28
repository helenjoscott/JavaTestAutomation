package chapter8;

import java.util.Scanner;

public class ChangePassword {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your username?");
        String username = scanner.nextLine();

        System.out.println("What is your current password?");
        String currentPassword = scanner.nextLine();

        System.out.println("What is your new password?");
        String newPassword = scanner.nextLine();

        if (passwordValidator.checkValidity(username, currentPassword, newPassword)){
            // set password to be the new password
            currentPassword=newPassword;
            System.out.println("Your password has been changed, your old password was " + currentPassword + ", and your new password is " + newPassword);
        }

        else System.out.println("The reason your password failed was " + passwordValidator.getValidationFailureReason());
    }
}
