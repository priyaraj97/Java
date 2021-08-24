
import java.io.*;   
public class ByteStream
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
  
        try 
        {
            sourceStream = new FileInputStream("sorcefile.txt");
            targetStream = new FileOutputStream ("targetfile.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }
        finally 
        {
            if (sourceStream != null)
                sourceStream.close();            
            if (targetStream != null)            
                targetStream.close();            
        }
    }
}