/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration_and_login;
//creating a scanner class
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Registration_and_login {

    public static void main(String[] args) {
        //creating an instance to create a class
       Login objLogin = new Login ();
       
       //Creating a scanner object
       Scanner scan = new Scanner(System.in);
       System.out.println("\n----Registration----");//Registration heading
       System.out.println();//Adding a blank space
       System.out.print("Please enter your First name : ");//prompting the user to enter their first name
       String firstname = scan.nextLine();//user enters first name
       
       System.out.print("Please enter your Last name : ");//promting the user to enter their last name
       String lastname = scan.nextLine();//user enters last name
       
       //promting the user to his/her username
       System.out.print("Please enter your Username : ");
       String username= scan.nextLine();//User enters username
       
       //Using if statement to check the username
       if(objLogin.checkuserName(username)==true){
         System.out.println("Username succesfully captured");//The statement played if the password is correct  
       }else{
           System.out.println("Username incorrectly formatted, Please ensure that your Username contains an underscore and is no more than five characters");//The statement played if the password is incorrect
       }
       System.out.print("Please enter Password : ");//prompting the user to enter password
       String password= scan.nextLine();//user enters password
       
       //using if statements to check password
       if(objLogin.checkpasswordComplexity(password)==true){
               System.out.println("Password successfully captured");// if returns true
       }else{
           System.out.println("Password incorrectly formatted,Please ensure that your password contain atleast 8 characters, a capital letter, a number and a special character");//if returns false
       }
       
       System.out.print("Please enter your Cellphone Number : ");//prompt the user to enter his/her cellphone number
       String number = scan.nextLine();//user enters cellphone number
       
       //using if statements to check number
       if(objLogin.checknumber(number)==true){
           System.out.println("Cellphone Number successfully added");//if returns true
       }else{
           System.out.println("Cellphone Number is incorrectly formatted or does not contain an international code");//returns false
       }
       //check if the register is succesful or unsuccessful
       if(objLogin.checkRegister(username,password,number)==true){
           System.out.println("Successfully Registered");//if returs true
       }else{
           System.out.println("Unsuccesfully Registered");//if returns false
       }
        System.out.println();//Adding a blank space
       //Login head
       System.out.println("\n-----Login-----");
        System.out.println();//Adding a blank space
        
      //prompting the User to enter the correct Username he/she used
        System.out.print("Please enter the Username that you used : ");
        String verifyUsername = scan.nextLine();//User enters the password
     
       //Prompting the User to enter the password that he used in the register
       System.out.print("Please enter the Password that you Used : ");
       String verifypassword = scan.nextLine();//User enters the password
     
       // Decission structure if the Username is verified correctly and the password
       if(objLogin.verifyLogin(verifyUsername, username, verifypassword, password)==true){
        System.out.println("Welcome "+firstname+" "+lastname+" Good to see you again");//if returns true
        System.out.println("Successtul Login");
    } else{
           System.out.println(" Incorrect Username or Password, Please try again");//if returns false
           System.out.println("Unsuccessful Login");
       }
       
       
    }
}
