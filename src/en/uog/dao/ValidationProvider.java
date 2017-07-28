/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

/**
 *
 * @author aziz
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
    
}
