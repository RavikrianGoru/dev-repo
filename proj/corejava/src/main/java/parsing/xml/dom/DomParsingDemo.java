package parsing.xml.dom;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.io.IOUtils;

public class DomParsingDemo
{
    public static void main(String[] args) throws Exception
    {
        DomParsingDemo obj = new DomParsingDemo();
        // obj.showFileContent("xml/InputData.xml");
       // obj.showFileContent("txt/sample.txt");
       // obj.showFileContentIOUtils("txt/sample.txt");
        obj.readFileContentFromZip("/zip");
        obj.readFileContentFromZip("/rar");
        obj.readFileContentFromZip("/jar/commons-io-1.4.jar");
        
    }

    public void readFileContentFromZip(String fileName) throws Exception
    {
        
        URL uri = getClass().getResource(fileName);
        System.out.println("uri.getPath() : "+uri.getPath());
        Path myPath;
        if (uri.toURI().getScheme().equals("jar"))
        {
            System.out.println("RK@ uri.getPath() -----(if)");
            FileSystem fileSystem = FileSystems.newFileSystem(uri.toURI(), Collections.<String, Object> emptyMap());
            myPath = fileSystem.getPath("/resources");
            System.out.println("RK@ uri.getPath() -----myPath :"+myPath.toString());
        }
        else
        {
            System.out.println("RK@ uri.getPath() -----(else)");
            myPath = Paths.get(uri.toURI());
        }
        
        try
        {
            ZipFile zipFile = new ZipFile(fileName);
            if (zipFile != null)
            {
                Enumeration<? extends ZipEntry> zipEntries = zipFile.entries();
                while (zipEntries.hasMoreElements())
                {
                    ZipEntry zEntry = zipEntries.nextElement();
                    System.out.println(zEntry.getName());
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception :"+e);
        }
        
        try
        {
            JarFile jarFile = new JarFile(fileName);
            if (jarFile != null)
            {
                Enumeration<? extends JarEntry> jarEntries = jarFile.entries();
                while (jarEntries.hasMoreElements())
                {
                    ZipEntry jarEntry = jarEntries.nextElement();
                    System.out.println(jarEntry.getName());
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception :"+e);
        }
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
