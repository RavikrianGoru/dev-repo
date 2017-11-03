package parsing.xml.dom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

public class DomParsingDemo
{
    public static void main(String[] args) throws Exception
    {
        DomParsingDemo obj = new DomParsingDemo();
//        obj.showFileContent("xml/InputData.xml");
//        obj.showFileContent("txt/sample.txt");
        obj.showFileContentIOUtils("txt/sample.txt");
    }

    public void showFileContent(String fileName) throws Exception
    {
        File file = new File(DomParsingDemo.class.getClassLoader().getResource(fileName).getFile());
        StringBuilder result = new StringBuilder("");
        try (Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }
            System.out.println(result.toString());
            scanner.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void showFileContentIOUtils(String fileName) throws Exception
    {
        System.out.println(IOUtils.toString(DomParsingDemo.class.getClassLoader().getResourceAsStream(fileName)));
    }
}
