import java.util.*;
import java.io.*;
class admin
{
 static void Addnew()
    {   
        File f=null;
         try
        {
            f=new File("nms.txt");
            FileWriter fout=new FileWriter(f,true);
            BufferedWriter bout=new BufferedWriter(fout);
            Scanner x=new Scanner(System.in);
            String s;
        
            String n;
            String g;
            
           
    
    
            System.out.println("Enter date");
            s=x.nextLine();
              
            System.out.println("Enter Name of Event");

            n=x.nextLine();
            
            System.out.println("Information");
            g=x.nextLine();
            int z=s.length();
            int y=n.length();
        
             bout.flush();
             bout.write(s+"               "+n);
             if(y>3)
             { 
                 int p=17-y;
                 for(int j=0;j<=p;j=j+1)
                 {
                     bout.write(" ");
                 }
             }
             bout.write(g);
             bout.newLine();
             
             bout.flush();
             bout.newLine(); 
            
             bout.close();
        




    
           
          
           
           System.out.println("You have entered the details successfully");
        
          
           {

           }


        }
    
         catch(Exception e)
    {
        System.out.println(e); 
}
    }
    static void View()
{
    File f=null;
        try
        { String record;
            f=new File("nms.txt");
            FileReader a=new FileReader(f);
            BufferedReader b=new BufferedReader(a);
            System.out.println(" ------------------------------------------------------------- ");
    	    System.out.println("|Date                  Name               Event 		                       ");
            System.out.println(" ------------------------------------------------------------- ");
            while( ( record = b.readLine() ) != null ) {
            System.out.println(record);
	
    	}
    		
    	System.out.println("|	                                            	          |");
    	System.out.println(" ------------------------------------------------------------- ");
    	b.close();    		
    }
    catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static void Delete()
    {
        Scanner sc=new Scanner(System.in);
        int h=0;
        int k=0;
        try{
        File f= new File("nms.txt");
        File g=new File("nms2.txt");
        FileReader a=new FileReader(f);
        BufferedReader b=new BufferedReader(a);
        FileWriter fout=new FileWriter(g,true);
        BufferedWriter bout=new BufferedWriter(fout);

System.out.println("Enter the Name of Event to be deleted");
String n=sc.nextLine();
String record;

while( ( record = b.readLine() ) != null )
{
    
    if(record.contains(n))
    {  
        continue;
        
    
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


}
static void Search()
{
    Scanner sc=new Scanner(System.in);
    int h=0;
    int k=0;
    try{
    File f= new File("nms.txt");
    File g=new File("nms2.txt");
    FileReader a=new FileReader(f);
    BufferedReader b=new BufferedReader(a);
    FileWriter fout=new FileWriter(g,true);
    BufferedWriter bout=new BufferedWriter(fout);

System.out.println("Enter the Name of Event to be Searched");
String n=sc.nextLine();
String record;

while( ( record = b.readLine() ) != null )
{

if(record.contains(n))
{  
    bout.write(record);
    bout.flush();
    bout.newLine();
}
else 
{
    continue;
}
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
{
    File f=null;
        try
        { String record;
            f=new File("nms.txt");
            FileReader a=new FileReader(f);
            BufferedReader b=new BufferedReader(a);
            System.out.println(" ------------------------------------------------------------- ");
    	    System.out.println("|Date                  Name               Event 		                       ");
            System.out.println(" ------------------------------------------------------------- ");
            while( ( record = b.readLine() ) != null ) {
            System.out.println(record);
	
    	}
    		
    	System.out.println("|	                                            	          |");
    	System.out.println(" ------------------------------------------------------------- ");
    	b.close();    		
    }
    catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}







    








    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("1.Add new Event");
        System.out.println("2.Delete an Event");
        System.out.println("3.Update an Event");
        System.out.println("4.View upcoming Event");
        System.out.println("5.Search for an Event");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
           
            Addnew();
             break;
            case 2:
            Delete();
            break;
            case 4:
            View();
            break;
            case 5:
            Search();
            break;
        
      
          }
        }
    }
    
        
    
        
        


  
            
            
        
       
        
        
        
        