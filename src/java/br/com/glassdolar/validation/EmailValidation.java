/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author marce
 */
public class EmailValidation {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidation() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public void validate(final String hex) throws Exception {
        matcher = pattern.matcher(hex);
        if(matcher.matches()){
            throw new Exception("Error validating email.");
        }
    }
}
