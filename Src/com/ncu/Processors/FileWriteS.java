package Processors;

import java.io.*;
import java.util.*;
import validator.validator;
public class FileWriteS {
    public void FileWriteS() {
           Scanner Sc = new Scanner(System.in); // declaring Scanner
          
          
        try {
            File f = new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\members.txt"); // opening text file "members.txt"
            if (f.exists()) {       // if the files exists then continues
                 System.out.println("Welcome to Signup page");
                 FileWriter fout = new FileWriter(f,true);
                 BufferedWriter bout= new BufferedWriter(fout);
                
                     
                     System.out.println("Enter Username ");  // username from user input
                     String user = Sc.next();
                     if(user.contains("#")||user.contains("$")||user.contains("&")||user.contains("*")||user.contains("^")||user.contains("@"))
                     {  
                         bout.close();
                         System.out.println("Error: Contains Special Character, Sign-up failed");
                         System.exit(0);
                     }
                     System.out.println("Enter Password ");  // password from user input
                     String pass = Sc.next();
                     if(pass.length()>8)
                     {
                         bout.close();
                         System.out.println("Password exceeding the word limit!");
                         System.exit(0);
 }
 
                     validator objsp=new validator();
                     objsp.SpecialCharacter(pass,bout);
                     String print = user+","+pass;   // adds a "," between the username & password
                     bout.write(print);             // prints the username & password in txt file "members"
                     bout.newLine();                // adds a new line after each entry
                
                bout.close();
                System.out.println("Account Successfully Created with the name:-"+user);
                System.out.println("---------------------------------------------------");
                System.out.println("---------------------------------------------------");
                System.out.println("---------------------------------------------------");
            }
            else {
                System.out.println("The file already exits");   // if the file does not exist then prints a message
            }
            
        }         
        catch (Exception e) 
        {
         e.printStackTrace();
        }    
    }
}
