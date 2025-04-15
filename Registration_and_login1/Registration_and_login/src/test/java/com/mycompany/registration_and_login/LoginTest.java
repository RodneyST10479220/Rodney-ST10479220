/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration_and_login;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    

    /**
     * Test of checkuserName method, of class Login.
     */
    @Test
    public void testCheckuserName() {
        System.out.println("checkuserName");
        String username = "Kopano";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkuserName(username);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkpasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckpasswordComplexity() {
        System.out.println("checkpasswordComplexity");
        String password = "Tl@ng3lan1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkpasswordComplexity(password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checknumber method, of class Login.
     */
    @Test
    public void testChecknumber() {
        System.out.println("checknumber");
        String number = "0722458728";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checknumber(number);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkRegister method, of class Login.
     */
    @Test
    public void testCheckRegister() {
        System.out.println("checkRegister");
        String username = "hgy";
        String password = "hyyb";
        String number = "vyhgi";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkRegister(username, password, number);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of verifyUsername method, of class Login.
     */
    @Test
    public void testVerifyUsername() {
        System.out.println("verifyUsername");
        String verifyUsername = "Tl_ng";
        String username = "kopuhj";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.verifyUsername(verifyUsername, username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of verifypassword method, of class Login.
     */
    @Test
    public void testVerifypassword() {
        System.out.println("verifypassword");
        String verifypassword = "Tl@ng3lani";
        String password = "Tl@ng3lani";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.verifypassword(verifypassword, password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of verifyLogin method, of class Login.
     */
    @Test
    public void testVerifyLogin() {
        System.out.println("verifyLogin");
        String verifyUsername = "Tl_ng";
        String username = "Tl_ng";
        String verifypassword = "Tl@ng3lani";
        String password = "Tl@ng3lani";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.verifyLogin(verifyUsername, username, verifypassword, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of verifynumber method, of class Login.
     */
    @Test
    public void testVerifynumber() {
        System.out.println("verifynumber");
        String verifynumber = "+27722458728";
        String number = "+27722458728";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.verifynumber(verifynumber, number);
        assertEquals(expResult, result);
        
    }
    
}
