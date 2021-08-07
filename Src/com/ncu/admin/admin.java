package admin;

import java.util.*;
import Processors.Addnew;
import Processors.view;  // importing view //
import Processors.Delete; // importing delete //
import Processors.Search;  // importing search //
import Processors.Upgrade; // importing upgrade package //
import Processors.refresh; // importing refreah package //


public class admin
{
    public void admin()

    {
       
                System.out.println("1.Add new Event");
                System.out.println("2.Delete an Event");
                System.out.println("3.Update an Event");
                System.out.println("4.View upcoming Event");
                System.out.println("5.Search for an Event");
                System.out.println("6.To remove empty lines from the Table");
                System.out.println("7.Logout");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Enter your choice:");
                
                
        
        Scanner sc=new Scanner(System.in);
        int ch;
        ch = sc.nextInt(); // getting input from user for further action

                switch(ch)
                {
                    case 1:
                    Addnew obj= new Addnew();
                    obj.Addnew(); // calling addnew package //
                    break;
                    
                    case 2:
                    Delete obj3= new Delete();
                    obj3.Delete();     // calling delete package //     
                    break;
                    case 3:
                    Upgrade obj6=new Upgrade();
                    obj6.Upgrade();  // calling upgrade package //
                    
                    case 4:
                    view obj5= new view();
                    obj5.View(); // calling view package //
                    break;
                    case 5:
                    Search obj4= new Search();
                    obj4.Search(); // calling search package //
                    break;
                    case 6:
                    refresh obj8=new refresh();
                    obj8.refresh();
                    break;
                    case 7:
                    System.out.println("*************LOGGED OUT SUCCESSFULLY*************");
                    System.exit(0); // allows user to exit from the code hence would stop the termination of the code

                    default:
                    System.out.println("************Wrong Input********");
                }
            sc.close();
            }
           
          
     }
