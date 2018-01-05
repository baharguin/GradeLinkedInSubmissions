import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Student
{

    private String firstName;
    private String lastName;
    private String URL;
    private int    grade;
    private String feedback;
    private String emailAddress;
    private String bodyHtml;
    
 
    public Student(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    
    public String getEmail()
    {
        return emailAddress;
       
        
    }

    public Student(String URL)
    {
        
        this.URL = URL;
       
        
    }


    public String getURL()
    {
        return URL;
    }


    public void setURL(String URL)
    {
        this.URL = URL;
    }


    public int getGrade()
    {
        return grade;
    }


    public void setGrade(int grade)
    {
        this.grade = grade;
    }


    public String getFeedback()
    {
        return feedback;
    }


    public void setFeedback(String feedback)
    {
        this.feedback = feedback;
    }

    public void setbodyHtml(String bodyHtml)
    {
        this.bodyHtml = bodyHtml;
    }


    public String getbodyHtml()
    {
        return bodyHtml;
    }
    public String toString()
    {
        String s= "Firstname: " +firstName +" Lastname: " + lastName +"URL: " + URL +
            "------" + bodyHtml;
        return s;
  
    }
    
    public int countOccurrance(String whole, String sub)
    {
        if(whole.isEmpty()|| whole == null) return 0;
        
    String str = whole;
    String findStr = sub;
    int lastIndex = 0;
    int count =0;

    while(lastIndex != -1){

           lastIndex = str.indexOf(findStr,lastIndex);

           if( lastIndex != -1){
                 count ++;
                 lastIndex+=findStr.length();
          }
    }
    return count;
}
    
    public void gradeStudent(){
       // System.out.println("*********");
//        int count=0;
//        String delims = "[ ,_,<,>,/,-,=,.]";
//        String[] tokens = bodyHtml.split(delims);
//        for(int y=0;y<tokens.length;y++){
//          //  System.out.println(tokens[y]);
//            if(tokens[y]=="body"){
//                System.out.println("token  "+tokens[y]);
//                count++;
//            }
//        }
//        grade=count; 
//        //System.out.println("number of type  "+grade);
//        //bodyHtml.
        System.out.print(countOccurrance(bodyHtml,"status-publish") + " "+ URL);
        if(firstName!=null && lastName!=null)
         System.out.println(" "+firstName+" "+lastName);
        
        
    }
    
    public void readHTML()
    {
        
        String html=URL;
        String result=null;
        int counernumber=0;
      //  html = html.replaceFirst(">", "");
       // html = html.replace('"', ' ');
        
      
           
          // html= html.substring(0, html.indexOf(".com")+4);
        
      //  System.out.println(html);
        try
        {
           
            final InputStream in =
                new URL(html).openStream();
            BufferedReader reader =
                new BufferedReader(new InputStreamReader(in));
              String line = reader.readLine();
            result = line;
            while ((line = reader.readLine()) != null)
            {
                result += line;
                
            }
         //   System.out.println(result);
          //  System.out.println("result");
            
           
           bodyHtml = result;
          // System.out.println(bodyHtml);
           
        }
        catch (Exception ex)
        {
            System.out.println("Eror happen " + html);
        }
    
        
    }
    
}

