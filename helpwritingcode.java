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



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow; 



public class helpwritingcode
{

    public static void main(String[] args) throws IOException
    {
        
        
        String line2;
        BufferedReader textmail;
        
        String lineexcel;
        BufferedReader textexcel;

        textmail = new BufferedReader
            (new FileReader("C:\\Users\\bahar\\Downloads\\" +
                    "springcs1410@gmail.com-20140128T033912Z-Mail\\" +
                    "springcs1410@gmail.com-20140128T033912Z-Mail\\Mail\\" +
                    "All mail Including Spam and Trash.mbox"));
       
        String csvFile = "C:\\Users\\bahar\\Downloads\\" +
                "C S1410101-10005201410(SPRING 2014) Grades-20140204_0228-comma_separated.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String strSplitBy = " ";
        
        line2 = textmail.readLine();  
        while(line2 != null)
        {
               System.out.println(line2);
               line2 = textmail.readLine();
        }
        
     
        try {
     
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
     
                    // use comma as separator
                String[] name = line.split(cvsSplitBy);
                System.out.println("Name of student  "+ name[0]+" "+name[1]);
                
                  
                while(textmail.readLine() != null)
                {
                    String[] name2 = line.split(strSplitBy);
                       System.out.println("--------------"+name2[0]);
                      
                       
                }
               
                
                
                
     
            }
     
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
     
        System.out.println("Done");
      }
        
    }


