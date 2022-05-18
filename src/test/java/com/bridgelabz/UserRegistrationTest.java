package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.firstNameValidate.userEntries("Chaitra");
            Assertions.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.firstNameValidate.userEntries("C");
            Assertions.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.lastNameValidate.userEntries("Sheri-kar");
            Assertions.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.lastNameValidate.userEntries("cns");
            Assertions.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.emailValidate.userEntries("abc.xyz@bl.co.in");
            Assertions.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.emailValidate.userEntries("abc.xyz@bl.in");
            Assertions.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("91 9910936991");
            Assertions.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("8882203123");
            Assertions.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.passwordValidate.userEntries("Abc12345#");
            Assertions.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.passwordValidate.userEntries("Sshj23#%");
            Assertions.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
}