/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author faycal
 */
public class ValidationProvider {
    
    public static Boolean minString(String value,int min){
        if (value.length() < min) {
            return false;
        }
       return true;
    }
    
    public static Boolean maxString(String value,int max){
        if (value.length() > max) {
            return false;
        }
       return true;
    } 
    
    public static Boolean validEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
}
