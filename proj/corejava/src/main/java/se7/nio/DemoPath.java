package se7.nio;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Iterator;

public class DemoPath {

	public static void main(String[] args) {

		FileSystem fs=FileSystems.getDefault();
		
		Path p1=fs.getPath("C:\\Users\\ragoru\\Downloads\\.\\data.txt");
		
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p1.getNameCount());
		System.out.println(p1.isAbsolute());
		System.out.println(p1.getFileName());
		System.out.println(p1.getName(1));
		System.out.println(p1.toUri());
		System.out.println(p1.getParent());
		System.out.println(p1.getRoot());
		Iterator<Path> pItr =p1.iterator();
		while(pItr.hasNext())
		{
			System.out.println(pItr.next());
		}
		System.out.println(p1.normalize());
		System.out.println(p1.toAbsolutePath());
	
		
		System.out.println("----------------------------------");
		
		
		
		Path p2=Paths.get("C:\\Users\\ragoru\\Downloads\\.\\data.txt");
		System.out.println(p2);
		System.out.println(p2.subpath(2, 3));
		
		
		File f=p2.toFile();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
//		System.out.println(f.delete());
		System.out.println(f.isDirectory());
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.mkdirs());
		System.out.println(f.canWrite());
		System.out.println(f.isAbsolute());
		System.out.println(f.getParentFile());
		try{
		System.out.println(f.getCanonicalFile());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(f.canRead());

		
		
		
	}

}
