package com.softserve.edu.hw11;

import java.util.ArrayList;

public class ValidateStringAppImp implements ValidateStringApp {
    public void validatePassword(String password) {
        ArrayList<String> errorsList = this.getErrorsList(password);
        this.printResult(errorsList);
    }

    private void printResult(ArrayList<String> errorsList) {
        int emptyArrayError = 0;
        if (errorsList.size() == emptyArrayError) {
            System.out.println(MessageTitles.correctPassword);
        } else {
            System.out.println(errorsList);
        }
    }

    private ArrayList<String> getErrorsList(String password) {
        boolean capitalLetterCheck = password.matches(".*[A-Z].*");
        boolean smallLetterCheck = password.matches(".*[a-z].*");
        boolean numberCheck = password.matches(".*[0-9].*");
        boolean specialCharacterCheck = password.matches(".*[^a-zA-Z0-9].*");
        boolean lengthCheck = password.matches(".{12,}");

        ArrayList<String> errorsList = new ArrayList<>();
        if (!capitalLetterCheck) {
            errorsList.add(MessageTitles.capitalLetterError);
        }

        if (!smallLetterCheck) {
            errorsList.add(MessageTitles.smallLetterError);
        }

        if (!numberCheck) {
            errorsList.add(MessageTitles.numberError);
        }

        if (!specialCharacterCheck) {
            errorsList.add(MessageTitles.specialCharactersError);
        }

        if (!lengthCheck) {
            errorsList.add(MessageTitles.lengthError);
        }

        return errorsList;
    }
}
