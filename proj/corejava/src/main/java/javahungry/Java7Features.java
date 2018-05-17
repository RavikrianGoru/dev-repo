package javahungry;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchService;

/*List of wonderful features  added as part of Java 7 .

1.  Diamond Operator
2.  Using strings in switch statement
3.  Automatic resource management
4.  Numeric literals with underscore
5.  Improved Exception Handling
6.  New File System API (NIO 2.0)
7.  Fork and Join

	(Before java 1.7) : and (java 1.7 onwards)
1.  Diamond Operator
	1) HashMap<String,String> hm= HashMap<String,String>();
	   HashMap<String,String> hm= HashMap<>();---------------<> is diamond operation.
2.  Using strings in switch statement	
	2) int/enum constants in switch case.
	   allows java.lang.String type in switch case.
3.  Automatic resource management
	3) This means, resource release task is done by JVM automaically.
		try( FileOutputStream fos=new FileOutputStream("movies.txt") ; DataOutputStream dos= new  DataOutputStream(fos);)
		{
		//block of code
		}
	here, we gave all resources within try()--- parentheses separated by ';'.
	All the resources which implements "java.lang.AutoClosable" having "void close() throws Exception"
	JVM calls this close method for releasing resources.
4.  Numeric literals with underscores
	4) int num1=10_000; // for more readability
	
5.  Improved Exception Handling	
	5) 	This is technically called multi-catch clause.
		catch(Exceptio1 | Exception2 | Exception3 exp)
		{
		
		}
6.  New File System API (NIO 2.0)
	6) java.nio.*----Path,Paths,File,Files,FileSystems.....
	
		Path path=Paths.get("C:\\Users\\ragoru\\Desktop\\DeskTop\\infy");
		WatchService watchService=FileSystems.getDefault().newWatchService();
		File file=Files.createFile(path);
	
7.  Fork and Join
	7) This is a mechanism through which you make the best use of the processors available in your systems.
	Fork:a term coined by the  UNIX bad boys , saying to create a child process .
	Join: also a term  coined by the UNIX bad boys , saying to wait for a child process to complete and join.
	
Step 1:	
ForkJoinPool   pool = new ForkJoinPool(Runtime.getRunTime().availableProcessors())
The first step informs the master (ForkJoinPool) , the number of processors available in the system for it to manage with .

Step 2:
pool.invoke(task);
Here you will give the task you want to be executed to the ForkJoinPool ,and it will take care of delegating this work to the free processor.


	







*/



public class Java7Features {

	public static void main(String[] args) {
		
		

	}

}
