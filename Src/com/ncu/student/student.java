package student;

import java.util.*;

import Processors.viewS;  // importing view //

import Processors.SearchS;  // importing search //


public class student
{

public void student()
{ Scanner sc=new Scanner(System.in);
    int a;

                System.out.println("1.View upcoming Event");
                System.out.println("2.Search for an Event");
                System.out.println("3.Logout");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Enter your choice:");
                a=sc.nextInt(); // getting input from the user to perform further tasks
                switch(a) {
                    case 1:
                    viewS obj5= new viewS(); 
                    obj5.viewS(); // calling viewS package that would allow user to view upcoming notices
                    break;
                    case 2:
                    SearchS obj4= new SearchS();
                    obj4.SearchS(); // calling SearchS package that would allow user to search for a particular notice
                    break;
                    case 3:
                    System.out.println("*************LOGGED OUT SUCCESSFULLY*************");
                    System.exit(0); // allows user to exit from the code hence would stop the termination of the code
                    default:
                    System.out.println("---------Wrong Input--------------");

                }
                sc.close();
            }
        }