import java.io.*;

public class SimpleFileReader {
    public  void readFile(String filename){
        FileReader reader = null;
        try{
            reader = new FileReader(filename);
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }
            System.out.println();
            System.out.println("File read successfully.");
        } catch (FileNotFoundException e){
            System.out.println("File not found: "+ filename);
        } catch (IOException e){
            System.out.println("Error reading file: "+ filename);
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e){
                    System.out.println("Error closing file");
                }
            }
        }
    }
}
