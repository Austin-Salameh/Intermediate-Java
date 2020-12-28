/*
*Austin Salameh- 10/12/2020
*Debug week 9
*/
import java.nio.file.*;  
import java.io.*;  
import static java.nio.file.StandardOpenOption.*;  
public class FileOut  {  
    public static void main(String[] args)  {
          Path file =  Paths.get("File path here");
            String s = "ABCDF";
              byte[] data = s.getByte();
              OutputStream output = null;  
              try  {  
                  output = new  BufferedInputStream(Files.newOutputStream(file, CREATE));
                    output.write(data);
                      output.flush();
                        output.close();
                      }  
                      catch(Exception e)  {  
                          System.out.println("Message: " + e);  
                        }  
                    } 
                }
 