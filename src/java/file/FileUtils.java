package file;

import java.io.*;

/**
 * Created by bsejawal on 6/5/14.
 */
public class FileUtils {

    /**
     *
     * @param fileName
     * @param fileString
     * @return
     */
    public static Boolean writeStringToFile(String fileName, String fileString){
        Boolean flag = false;
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter(fileName));
            writer.write(fileString);
            flag = true;

        }catch (IOException e){
            flag = false;
        }
        finally
        {
            try
            {
                if ( writer != null)
                    writer.close( );
            }
            catch ( IOException e)
            {
                flag = false;
            }
        }
        return flag;
    }

}
