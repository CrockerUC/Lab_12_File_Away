import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileInspector
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("./src"));
        int result = chooser.showOpenDialog(null);

        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
        }
    }
}
