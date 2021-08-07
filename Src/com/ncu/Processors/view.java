package Processors;
import java.io.*;
import java.util.*;
import admin.admin; // importing admin package
public class view
{
public void View()
{
    Scanner sc=new Scanner(System.in);
    File f=null;
        try
        { String record;
             String str = "=";
            String sp = " ";
              String st = "-";
              String sf = "$";
            f=new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\notices.txt"); // opening a text a file called "notices.txt"
            FileReader a=new FileReader(f); // importing FileReader to read data from file
            BufferedReader b=new BufferedReader(a); // importing BufferedReader that helps in reading text file using internal buffer
            System.out.println("" + sf.repeat(70)+ "  NOTICE BOARD  "+sf.repeat(170-86) );
             System.out.println("" + str.repeat(170));
             System.out.println("|      Date                  Name               Event" + sp.repeat(116) + "|"); // .repeat is used to print string for a given number of times
            System.out.println("" + str.repeat(170));
            System.out.println("|" + sp.repeat(168) +"|");
            System.out.println("|" + sp.repeat(168) +"|");
             while( ( record = b.readLine() ) != null ) {  // reading the text file till the end
            int l=record.length();
            System.out.println("|     " + record +sp.repeat(170-(l+7)) + "|" );
            System.out.println("" + st.repeat(170));
    
        }
         
               System.out.println("" + str.repeat(170));
    
        b.close();   // closing BufferedReader 'b'

        String choice;
        System.out.println("To Go back to Menu page press Y");
        choice=sc.nextLine();
        int l=choice.length();
        System.out.println(l);
        if(l==1)
        {
            if(choice.charAt(0)=='y'||choice.charAt(0)=='Y')
            {   System.out.println("yes");
                admin obj=new admin(); // calling the package named "admin"
                obj.admin();

            }
            else
            {
                System.out.println("---------------------------Invalid Choice------------------------------");
                System.out.println("Logging Out......................");
                System.exit(0);
            }

        }
      
          		
    }
    catch(Exception e) // catches exception and print it if present any
        {
            e.printStackTrace();
        }
    }
}


