package Processors;
import java.io.*;
import java.util.*;
import admin.admin;

public class refresh
{
public void refresh()
    {
        Scanner sc=new Scanner(System.in);
       
        try{
        File f= new File("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\Text File\\notices.txt");
        File g=new File("nms2.txt");
        FileReader a=new FileReader(f);
        BufferedReader b=new BufferedReader(a);
        FileWriter fout=new FileWriter(g,true);
        BufferedWriter bout=new BufferedWriter(fout);

String n="";
String record;

while( ( record = b.readLine() ) != null )
{
    
    if(record.contains(n))
    {  
        if(record.contains("A")||record.contains("B")||record.contains("C")||record.contains("D")||record.contains("E")||record.contains("F")||record.contains("G")||record.contains("H")||record.contains("I")||record.contains("J")||record.contains("K")||record.contains("L")||record.contains("M")||record.contains("N")||record.contains("O")||record.contains("P")||record.contains("Q")||record.contains("R")||record.contains("S")||record.contains("T")||record.contains("U")||record.contains("V")||record.contains("W")||record.contains("X")||record.contains("Y")||record.contains("Z"))
        {

        }
        else
        
            {continue;}
        
    }
                bout.write(record);
    			bout.flush();
                bout.newLine();
    
  

}


b.close();
    		bout.close();
    		
    		f.delete();
    		
    		g.renameTo(f);
 
    }
    catch(Exception e)
    {
        System.out.println(e);
}


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