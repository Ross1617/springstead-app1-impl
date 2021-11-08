package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class fileSaver {
    public void savingFile(File file, ArrayList savedList) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        int lines = savedList.size();


        for(int i = 0; i < lines; i++){
            String words = (String) savedList.get(i);
            printWriter.write(words);
            printWriter.write("\n");
        }
        printWriter.close();

    }
}
