package validator;
import java.io.*;
import java.util.*;



import exception.DateFormatException; //importing dateformat Exception
import exception.EmptyStringException; // importing EmptyStringException
import exception.SpecialCharacter; //importing Special Caracter EXception



public class validator
{ 

    // Validator for Date
    public void DateFormat(String d , File f ,BufferedReader bout, BufferedWriter b) throws DateFormatException, IOException { 
        
        FileReader reader=new FileReader("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\com\\ncu\\exception\\DataFormatException.java");
        
       
        int count=0;
        String[] arrc=d.split("/");
        if(arrc[0].length()!=2||arrc[1].length()!=2||arrc[2].length()!=4){
            throw new DateFormatException("Invalid Date Format"); //throws dateformatexception
        }
        int dd=Integer.parseInt(arrc[0]); //Divided string's first two values as Date
        int mm=Integer.parseInt(arrc[1]);  //Divided string's second two values as Date
        int yyyy=Integer.parseInt(arrc[2]); //Divided string's Last four values as year
        if(yyyy==2020||yyyy==2021) 
{         
     if(mm>=1&&mm<=12)
     {
         if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)
         {
             if(dd>0&&dd<=31)
             
            {
          
            }
       else
       {
       b.close();
            bout.close();
            f.delete();
            throw new DateFormatException("Date Format Invalid");
    }
}
    else if(mm==4||mm==6||mm==9||mm==11)
    {
        
             if(dd>0&&dd<=30)
             
        {
           
         
        }
       else
       {
       b.close();
            bout.close();
            f.delete();
            throw new DateFormatException("Date Format Invalid");
    }
}
    else if(mm==2)
    { 
        if(yyyy==2020||yyyy%4==0)
        {
            if(dd>0&&dd<=29)
            {
            
           
        }
       else
       {
       b.close();
            bout.close();
            f.delete();
            throw new DateFormatException("Date Format Invalid");
       }
    }
    else
    {  if(dd>0&&dd<=28)
            {
              
        }
       else{
       b.close();
       bout.close();
       f.delete();
       throw new DateFormatException("Date Format Invalid");
    } 
}
    
     }
    
}
else
{
    b.close();
    bout.close();
    f.delete();
    throw new DateFormatException("Date Format Invalid");
}
}
else
{
    b.close();
    bout.close();
    f.delete();
    throw new DateFormatException("Date Format Invalid");
}
       
for(int i=0;i<d.length();i++){

            if(d.charAt(i)=='/')
            {
                count+=1;
            }
        }
        if(count!=2)
        {
            b.close();
            bout.close();
            f.delete();
            throw new DateFormatException("Invalid Date Foramt");
                    
        }

    }
    // Validator to check for empty String
public void EmptyStringException(String s,File f,BufferedReader Bout,BufferedWriter bout2) throws EmptyStringException, IOException
{
    FileReader reader=new FileReader("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\com\\ncu\\exception\\EmptyStringException.java");
      
        if(s.length()==0)
        {
            bout2.close();
            Bout.close();
            f.delete();
            throw new EmptyStringException("Empty String"); //throws empty String exception
            
        }
       

}
// Validator to check for special characters
public void SpecialCharacter(String s, BufferedWriter bout) throws SpecialCharacter, IOException
{
    FileReader reader=new FileReader("C:\\Users\\Parmod sharma\\Desktop\\Notice Management\\src\\com\\ncu\\exception\\SpecialCharacter.java");
        
          int x=0;
        if(s.contains("#")||s.contains("$")||s.contains("&")||s.contains("*")||s.contains("^")||s.contains("@"))
        {
           
           x++;
        }
        if(x!=0)
        {
            bout.close();
        }
        if(x!=0)
        {
            throw new SpecialCharacter("Error: Contains Special Character, Sign-up failed");
            
        }
       

}


   }
