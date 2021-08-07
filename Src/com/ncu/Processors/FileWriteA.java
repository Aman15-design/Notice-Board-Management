package Processors;

import java.io.*;
import java.util.*;


public class FileWriteA 
{

   public void FileWriteA() 
   {

           
          
          
          
        try {
            File f = new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\membersA.txt"); //opening the text file "membersA"
            if (f.exists()) {   // if the file exists, then continues
                 System.out.println("Welcome to Signup page");
                 FileWriter fout = new FileWriter(f,true);
                 BufferedWriter bout= new BufferedWriter(fout);
                 Scanner sc = new Scanner(System.in);
               
                     System.out.println("Enter Username ");  // username from user input
                     String user = sc.next();
                     if(user.contains("#")||user.contains("$")||user.contains("&")||user.contains("*")||user.contains("^")||user.contains("@"))
                    {  
                        bout.close();
                        System.out.println("Error: Contains Special Character, Sign-up failed");
                        System.exit(0);
                    }
                    
                     System.out.println("Enter Password "); //  password from user input
                     String pass = sc.next();
                    if(pass.length()>8)
                    {
                        bout.close();
                        System.out.println("Password exceeding the word limit!");
                        System.exit(0);
}

                   
                    
                     
                     String print = user+","+pass;  // adds a "," between the username and passsword
                     bout.write(print);   // prints the username & password in the txt file "membersA"
                     bout.newLine();    // adds a new line after every entry
                
                bout.close();
                System.out.println("Account Successfully Created with the name:-"+user);
                System.out.println("---------------------------------------------------");
                System.out.println("---------------------------------------------------");
                System.out.println("---------------------------------------------------");
             
            
        }
            else {
                System.out.println("The file already exits");  // if the file does not exists then prints a message
            }
        }         
        catch (Exception e) {
        e.printStackTrace();
       }    
    }
}
