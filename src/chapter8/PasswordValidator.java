package chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    // if all of these are true, the password is valid
    private static boolean isDiffToCurrentPassword = true;
    private static boolean doesNotContainUsername = true;
    private static boolean isLongEnough = true;
    private static boolean hasSpecialChar = true;
    private static boolean hasUpperCaseChar = true;

    private static String validationFailureReason;

    public boolean checkValidity(String username, String currentPassword, String newPassword) {

        // check that it is not the same as the old password
        if (currentPassword.equals(newPassword)) {
            validationFailureReason = ("it's the same as the current password.");
            return false;
        }

        // check if it contains the username
        else if (newPassword.contains(username)) {
            validationFailureReason = ("it contains your username.");
            return false;
        }

        // check that it is as least 8 characters long
        else if ((newPassword.length() <= 8)) {
            validationFailureReason = ("it's not long enough. New password must be longer than 8 characters.");
            return false;
        }

        // check that it contains at least one special characters
        else if (checkForSpecialChars(newPassword)) {
            validationFailureReason = ("it needs to contain at least one special character");
            return false;
        }

        // check that it contains at least one upper case letter
        else if (checkForUppercase(newPassword)) {
            validationFailureReason = ("it needs to contain at least one upper case character");
            return false;
        }
        return true;
    }


    private static boolean checkForUppercase(String newPassword) {
        char[] newPasswordArray = newPassword.toCharArray();
        for (char c : newPasswordArray) {
            return !Character.isUpperCase(c);
        }
        return false;
    }

    private static boolean checkForSpecialChars(String newPassword) {
        Pattern patternSpecial = Pattern.compile("[a-zA-Z0-9]*");
        Matcher hasSpecial = patternSpecial.matcher(newPassword);
        return hasSpecial.matches();
    }

    public String getValidationFailureReason() {
        return validationFailureReason;
    }
}