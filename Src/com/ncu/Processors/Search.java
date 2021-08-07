package Processors;
import java.io.*;
import java.util.*;
import admin.admin; // importing admin package


public class Search
{

public void Search()
{
    Scanner sc=new Scanner(System.in);
    
    try{
    File f= new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\notices.txt"); //new File "notices.txt" to read content
    File g=new File("nmssearchtemp.txt"); // new temporary text file called "nmssearchtemp.txt"
    FileReader a=new FileReader(f); // importing FileReader to read txt file
    BufferedReader b=new BufferedReader(a); // importing BufferedReader that helps in reading txt file from a character based input stream
    FileWriter fout=new FileWriter(g,true); // importing FileWriter to write directly into the text file
    BufferedWriter bout=new BufferedWriter(fout); // importing BufferedWriter to write text file using internal buffer

System.out.println("Enter the Name of Event to be Searched");
String n=sc.nextLine(); // Getting input from user to perform further update

String record;

while( ( record = b.readLine() ) != null )
{

if(record.contains(n)==true) //Checking if the String 'n' is present in the text file
{  
    bout.write(record); // Writing record into the text file "nmssearchtemp.txt"
    bout.flush();  // Flushes  stream, it means to clear the stream of any element that may or may not be inside the stream.
    bout.newLine();  // Adding a newline into the text file
}
else 
{
    continue; // Skips one loop
}
}
b.close(); // closes BufferedReader 'b'
    		bout.close(); // closes BufferedWriter 'bout'
    		
    		
    		

 
    }
    catch(Exception e)
    {
        System.out.println(e); //Displays exception on the terminal if any
}

// Below code is used to display the content of text file which would be same as view
{
    File f=null;
        try
        { String record;
            String str = "=";
            String sp = " ";

            f=new File("nmssearchtemp.txt"); // new temporary text file called "nmssearchtemp.txt"
            FileReader a=new FileReader(f); // importing FileReader to read txt file
            BufferedReader b=new BufferedReader(a); // importing BufferedReader that helps in reading txt file from a character based input stream
             System.out.println("" + str.repeat(170));
            System.out.println("|      Date                    Name             Event" + sp.repeat(116) + "|"); // .repeat is used to print string for a given number of times
            System.out.println("" + str.repeat(170));
            System.out.println("|" + sp.repeat(168) +"|");
            System.out.println("|" + sp.repeat(168) +"|");
            while( ( record = b.readLine() ) != null ) {  // reading the text file till the end
            int l=record.length();
            System.out.println("|     " + record +sp.repeat(170-(l+7)) + "|" );
            
             
    
        }
        System.out.println("|"+ sp.repeat(168) +"|");
        System.out.println("|"+ sp.repeat(168) +"|");
        System.out.println("" + str.repeat(170));
        b.close();  // closing BufferedReader 'b'
        f.delete();   // Deleting "nmssearchtemp.txt"      
    
        String choice;
        System.out.println("To Go back to Menu page press Y");
        choice=sc.nextLine();
        int l=choice.length();
        System.out.println(l);
        if(l==1)
        {
            if(choice.charAt(0)=='y'||choice.charAt(0)=='Y')
            {   System.out.println("yes");
                admin obj=new admin();
                obj.admin();

            }
            else
            {
                System.out.println("---------------------------Invalid Choice------------------------------");
                System.out.println("Logging Out......................");
                System.exit(0);
            }
            

        }
        sc.close();
      
         
    }
    catch(Exception e) // catch exception if present any
        {
            e.printStackTrace();
        }
    }
}
}
