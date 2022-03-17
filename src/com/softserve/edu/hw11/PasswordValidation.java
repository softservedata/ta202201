package com.softserve.edu.hw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

    public PasswordValidation() {
    }

    public boolean isValidPassword (String password){
        //String pattern = "^(\\d+)([a-z]+)([A-Z]+)([!@#$%^&*+=]+)(\\S+$).{12,}$";
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{12,}$";
        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(password);

            return matcher.find();
    }
}
