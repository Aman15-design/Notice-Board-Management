package Processors;
import java.io.*;
import java.text.DateFormat;
import java.util.*;
import Processors.view; //importing view package
import admin.admin;  //importing admin package
import validator.validator;






public class Addnew
{


  


    public  void Addnew()
    {
        
        {
            
            try
        { String record;
            
             String str = "=";
            String sp = " ";
              String st = "-";
              String sf = "$";
            File k=new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\notices.txt"); // opening a text a file called "notices.txt"
            FileReader a=new FileReader(k); // importing FileReader to read data from file
            BufferedReader b=new BufferedReader(a); // importing BufferedReader that helps in reading text file using internal buffer
            System.out.println("" + sf.repeat(70)+ "  NOTICE BOARD  "+sf.repeat(170-86) ); // .repeat is used to print string 
             System.out.println("" + str.repeat(170));
             System.out.println("|      Date                  Name               Event" + sp.repeat(116) + "|");
            System.out.println("" + str.repeat(170));
            System.out.println("|" + sp.repeat(168) +"|");
            System.out.println("|" + sp.repeat(168) +"|");
             while( ( record = b.readLine() ) != null ) { // Reading a text file till the end
            int l=record.length();
            System.out.println("|     " + record +sp.repeat(170-(l+7)) + "|" );
            System.out.println("" + st.repeat(170));
    
        }
         
               System.out.println("" + str.repeat(170));
                
        b.close();   //closes bufferedReader
        
      
          		
    }
    catch(Exception e)
        {
            e.printStackTrace(); // prints exception if any
        }
    }
    {
    
        Scanner sc=new Scanner(System.in);
        int h=0;
        int k=0;
        try{
            
        File f= new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\notices.txt"); // opens notices.txt file
        File g=new File("nms2.txt"); // opens a new file called nms2.txt
        g.delete();
        g.createNewFile();
                FileReader a=new FileReader(f); // importing FileReader to read txt file
        BufferedReader b=new BufferedReader(a); // importing BufferedReader that helps in reading txt file from a character based input stream
        FileWriter fout=new FileWriter(g,true); // importing FileWriter to write directly into the text file
        BufferedWriter bout=new BufferedWriter(fout); // importing BufferedWriter to write text file using internal buffer
        System.out.println();
        System.out.println();
System.out.println("*******************************NOTE: AUTO UPGRADATION IF ALREADY PRESENT***********************************************");
System.out.println("Enter the Name of Event :");
String n=sc.nextLine();
validator obj=new validator();
obj.EmptyStringException(n,g,b,bout);

String record;

while( ( record = b.readLine() ) != null ) //Reading text file till the end
{
    
    if(record.contains(n))
    {  
        continue; // Skips a loop
        
    
    }
    else{
                bout.write(record); // Writing record into nms2 text file
    			bout.flush();  // Flushes  stream, it means to clear the stream of any element that may or may not be inside the stream.
                bout.newLine(); // Adding a newline into the text file
             
            }
  

}



        Scanner x=new Scanner(System.in);
        
        String s2;
        String s;
    
        String n2;
        String g2;
          int ch;
          int date;
          int month;
          int year;
        
       
System.out.println("...............................................................................");
System.out.println("*******************************************************************************");
System.out.println("...............................................................................");
int d; 
int m; 
int y;
        System.out.println("Enter date DD/MM/YYYY");      // Getting input from user inform in form Date
        s=sc.nextLine();
        validator objdate=new validator();
        objdate.DateFormat(s,g,b,bout);
      
          
  
       
        System.out.println("Information");
        g2=x.nextLine(); // Getting input for information related to the specific notice
        validator objInfo=new validator();
        objInfo.EmptyStringException(g2,g,b,bout);
        
        y=n.length();
         
           String check;
           int c=0;
           
        
           
           
    
         bout.flush();
         bout.write(s+"               "+n);  // writing input from user into text file 
         if(y>3)
         { 
             int p=17-y;
             for(int j=0;j<=p;j=j+1)
             {
                 bout.write(" "); // adding expty sapce at specific location into text file
             }
         }
         else
         {
             for(int j=0;j<15;j++)
             {
                 bout.write(" "); // adding expty sapce at specific location into text file
             }
         }
         bout.write(g2); // writing string g2 into the text file 
         bout.newLine(); // adding new line into the text file
         
         bout.flush(); // Clears temporary storage
         bout.newLine(); // adding new line into the text file
        
         bout.close(); // closing BufferedWriter Bout
         
b.close(); // closing BufferedReader b
bout.close(); // closing BufferedWriter bout



System.out.println("******************************Details updated successfully********************************");
       

f.delete(); // Deleting "notices.txt" file

g.renameTo(f); // Renaming "nms.txt" to "notices.txt"          
}


        

     catch(Exception e)
{
    System.out.println(e); // Prints exception if any
}
    }

   
view obj5= new view();
obj5.View();

}
}

