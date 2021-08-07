package Processors;
import java.io.*;
import java.util.*; 
import admin.admin; // importing admin package
import Processors.view; // importing view package
import validator.validator; //importing validator

public class Delete
{
public void Delete()
    {
        Scanner sc=new Scanner(System.in);
        
        try{
        File f= new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\notices.txt"); // opening "notices.txt" file
        File g=new File("nms2.txt"); // opening "nms2.txt" file
        FileReader a=new FileReader(f); // Importing FileReader to read "notices.txt" file
        BufferedReader b=new BufferedReader(a); // importing BufferedReader that helps in reading text file using internal buffer
        FileWriter fout=new FileWriter(g,true); // importing FileWriter to write into the text file
        BufferedWriter bout=new BufferedWriter(fout);// importing BuuferedWriter to write into the text file using internal buffer

System.out.println("Enter the Name of Event to be deleted");
String n=sc.nextLine();
validator obj=new validator();      // calling validator
obj.EmptyStringException(n,g,b,bout);
String record;




while( ( record = b.readLine() ) != null )
{
    
    if(record.contains(n))
    {  
        continue;
    }
                bout.write(record); // wrting record into the text file
    			bout.flush(); // Flushes  stream, it means to clear the stream of any element that may or may not be inside the stream.
                bout.newLine(); // Adding an empty line into the text file
   
  
}



b.close(); // closing BufferedReader called b
    		bout.close(); // closing BufferedWriter called bout
    		
    		f.delete(); // deleting the txt file with name-"notices.txt"
    		
    	g.renameTo(f); // renaming "nms2.txt" to "notices.txt"
 
    }
    catch(Exception e)
    {
        System.out.println(e); // Prints exception if any
}
view obj5= new view();
obj5.View();
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

}