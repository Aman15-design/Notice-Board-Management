//      NOTICE MANAGEMNENT :-
//                           A.STUDENT LOGIN : 1.VIEW UPCOMING EVENT    2.SEARCH FOR A PARTICULAR NOTICE     3.LOGOUT
//                           B.ADMIN LOGIN   : 1.ADD NEW EVENT          2.DELETE SPECIFIC EVENT         3.UPDATE A PARTICULAR EVENT    4.VIEW UPCMONG EVENTS    5.SEARCH FOR A PARTICULAR EVENT     6.DELETE EMPTY LINES FROM TABLE      7.LOGOUT



import java.util.*;


import Processors.FileWriteA; // importing signup for admin //
import Processors.FileWriteS; // importing signup for student //
import admin.admin;  // action which admin could perform //
import student.student;// action which student could perform //
import java.io.*;
class main
{
     
static boolean VerifyLoginS(String username,String password)
    {
       
        boolean found = false; // boolean variable set to false for later use
        
          
        String tempUsername = null; // variable used for extracting the username from txt file and storing in this
        String tempPassword = null; // variable used for extracting the username from txt file and storing in this
       
        try
        {
            x = new Scanner(new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\members.txt")); //opens the file "membersA.txt"
            x.useDelimiter("[,\n]"); // use of delimiter to specify the seperation of username & password by ","
            // delimiter is one or more characters for specifying the boundary between plain text, "\n" moves on to the next line
            boolean passed = false; // boolean variable set to false and later use
             while (x.hasNext() && !found) // use of while to check if the file has any contents
             {
                
                tempUsername = x.next(); // extracts the username and stores it 
                tempPassword = x.next(); // extracts the password and stores it 
                
               
            
                    if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))  // use of trim to remove any unwanted space in user input or in txt file
                    { 
                        passed = true; // boolean passed becomes true if the username and passwords entered by user match the ones in file

                    
                    }
                  
            } 
            if(passed==true) 
            {
                System.out.println("**************Login Succesful****************");
                return true; // returns a boolean value i.e. "True" to where it was called
                
            
            }
            else 
            {
                System.out.println("********WARNING ! Incorrect Username or Password*********");
                return false; // returns a boolean value i.e. "False" to where it was called
                
                
            }
            
           
           
            
            
        }
       
        catch(Exception e) 
        {
        
        }
       return false;

     
      
    
    }


    private static Scanner x; // declares scanner
 static boolean VerifyLoginA(String usernameA, String passwordA) {
        boolean flag = false; // boolean variable set to false for later use
        String tempUsernameA = ""; // variable used for extracting the username from txt file and storing in this
        String tempPasswordA = "";  // variable used for extracting the password from txt file and storing in this
        try {
              x = new Scanner(new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\membersA.txt")); //opens the file "membersA.txt"
              x.useDelimiter("[,\n]"); // use of delimiter to specify the seperation of username & password by ","
               // delimiter is one or more characters for specifying the boundary between plain text, "\n" moves on to the next line
             boolean passedA = false; // boolean variable set to false and later use
            while (x.hasNext()&& !flag){   // use of while to check if the file has any contents 
                
                tempUsernameA = x.next(); // extracts the username and stores it 
                tempPasswordA = x.next(); // extracts the password and stores it 
                if (tempUsernameA.trim().equals(usernameA.trim()) && tempPasswordA.trim().equals(passwordA.trim())) {
                    passedA = true; // use of trim to remove any unwanted space in user input or in txt file
                    break; // boolean passedA becomes true if the username and passwords entered by user match the ones in file
                }
            }
            if(passedA) {
                System.out.println("**************Login Succesful****************");
               return true; // return a boolean value i.e. "True" to where it was called
                
            }
            else 
            {
                System.out.println("********WARNING**Incorrect Username or Password*********");
                return false; // return a boolean value i.e. "False" to where it was called

            }
            
        
            
        }
        catch (Exception e){
            System.out.println("Error");
        }
        return false;
    }

   
    
    public static void main(String args[]){
            Scanner x=new Scanner(System.in);
            
            System.out.println("=============================================================================\n");
            System.out.println(" **************************************************************************  \n");
            System.out.println("                Welcome to Notice Board Managment System                     \n");
            System.out.println(" **************************************************************************  \n");
            System.out.println("=============================================================================\n");
            System.out.println("********************Login**********************");
            System.out.println("Enter 1 for student");
            System.out.println("Enter 2 for admin");
            System.out.println("Enter 3 to exit");
            System.out.println("Enter your choice:");
            int choice  = x.nextInt(); // Entering choice for Student or Admin signup-login //
           
            
                      switch (choice) {
               
                case 1:
                
                 System.out.println("Would you like to signup or login");
           
            System.out.println("Enter 1 for signup");
            
            System.out.println("Enter 2 for login");
    
            System.out.println("Enter your choice:");
            int log = x.nextInt();
            switch (log) {
                case 1:
                System.out.println("*************Welcome to Student Sign-Up Page************* ");
                FileWriteS objS= new FileWriteS();
                objS.FileWriteS();
                
                
                case 2:
                System.out.println("******Welcome to Student Login Page********");
                String username ;
                System.out.println("Enter username");
                username = x.next(); // ENTER USERNAME
                String password ;
                System.out.println("Enter password");
                password = x.next(); // ENTER PASSWORD
               
                boolean c=VerifyLoginS(username,password); // CALLING LOGIN METHOD FOR STUDENT
                
            

               
                
              
                
               
               
                if(c==true)
                {
                
                    System.out.println("************Welcome "+username+" to notice board************");
                    student obj=new student(); // CALLING PACKAGE FOR STUDENT WHICH CONTAINS ALL THE TASKS A USER CAB // 
                    obj.student();
                }
               
                  
            else
            {
                System.out.println("The entered username or password is incorrect");
           
        }
            case 3:
            break;
            
            }
            break;
                case 2:
                 System.out.println("Would you like to signup or login");
           
            
            System.out.println("Enter 1 for signup");
            System.out.println("Enter 2 for login");
            System.out.println("Enter your choice:");
            int log1 = x.nextInt();
            switch (log1){
                case 1:
                System.out.println("***********Welcome to admin Sign-up page***************");
                FileWriteA objA =new FileWriteA();
                objA.FileWriteA();
                
                
                case 2:
                System.out.println("*********Welcome to Admin Login Page**********");
                String usernameA;
                System.out.println("Enter  username");
                usernameA = x.next();
                String passwordA;
                System.out.println("Enter Passsword");
                passwordA = x.next();
                boolean check=VerifyLoginA(usernameA, passwordA);
                
            
               
                if(check==true)
                {
            
                System.out.println("Welcome "+usernameA+", to notice management system for admin");
                admin obj=new admin(); // Calling admin package
                obj.admin();
                
                
                }
               
            else
            {
                System.out.println("The entered username or password is incorrect");
                
        }
        x.close();
          }}
     }
}
