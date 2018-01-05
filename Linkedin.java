import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow; 



public class Linkedin
{

    public static void main(String[] args) throws IOException
    {
        String directory =
            "C S1410101-10005201410(SPRING 2014) Grades-20140204_0228-comma_separated.csv";
        createStudents(directory);
    }

    public static void createStudents(String directory)
    {

        String stringContent = null;
        String filesName;
        String s = null;
        try
        {
            String path = directory;
            String files;
            File folder = new File(path);
            String delims = ", ";
         
            String csvFile = "C:\\Users\\bahar\\Downloads\\" +
                "springcs1410@gmail.com-20140128T033912Z-Mail\\" +
                    "springcs1410@gmail.com-20140128T033912Z-Mail\\Mail\\" +
                    "All mail Including Spam and Trash.mbox";
        
            FileReader fr = new FileReader(csvFile);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder content = new StringBuilder(1024);

            while ((s = br.readLine()) != null)
            {
                content.append(s);
               // System.out.println(s);
            }
           // System.out.println("file content is   " + content);

            stringContent = content.toString();
            // System.out.print(stringContent);

            Pattern p = Pattern.compile("Accept invitation from(.*?)http");
            Matcher m = p.matcher(stringContent);
while(!m.hitEnd())
            if (m.find())
            {
               // System.out.println();
               // System.out.println(" URL is " + m.group(0));
                String html = m.group(0);
                //String html = stringContent;
                html= html.substring(html.indexOf("from")+5, html.indexOf("http"));
             //   student.setURL(html);
                // System.out.println(" URL is "+m.group(1));
                // System.out.println(" URL is "+m.group(2));
                System.out.println(html);
            }
                    
        
        }
        catch (Exception ex)
        {
            System.out.println("Eror happen create");
        }

    }
    
}
