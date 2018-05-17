package se7.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.regex.PatternSyntaxException;

public class DemoFiles {

	public static void main(String[] args) {

		Path p=Paths.get("C:\\Users\\ragoru\\Downloads\\data.txt");
		URI uri= URI.create("http://www.oracle.com/");
		try( InputStream in=uri.toURL().openStream())
		{
			Files.copy(in, p, StandardCopyOption.REPLACE_EXISTING);
		}catch(final IOException e)
		{
			System.out.println("Exception :"+e);
		}
		
		
		
		Path dir1=Paths.get("C:\\Users\\ragoru\\Downloads\\dir1");
		try(DirectoryStream<Path> stream =Files.newDirectoryStream(dir1, "*.pdf"))
		{
			for(Path file: stream)
			{
				System.out.println(file.getFileName());
				System.out.println(file.toAbsolutePath());
			}
		}catch(PatternSyntaxException|DirectoryIteratorException|IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
