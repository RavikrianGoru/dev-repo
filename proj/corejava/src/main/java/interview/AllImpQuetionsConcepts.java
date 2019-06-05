package interview;

/*
http://www.journaldev.com/tutorials

http://www.softwareandfinance.com/Java/Loops_Diamond_Pattern.html
http://www.dailyfreecode.com/mysearchresult.aspx?q=program+print+pyramid+stars+in+java&stype=all



Garbage Collection & Java (JVM) Memory Model
http://www.journaldev.com/2856/java-jvm-memory-model-and-garbage-collection-monitoring-tuning

Java Heap vs Stack memory
http://www.journaldev.com/4098/java-heap-memory-vs-stack-memory-difference

String pool:
http://www.journaldev.com/797/what-is-java-string-pool

String vs StringBuffer vs StringBuilder
ref: http://www.journaldev.com/538/java-interview-question-string-vs-stringbuffer-vs-stringbuilder

SVN commands
http://wiki.greenstone.org/wiki/index.php/Useful_SVN_Commands#Checking_out_projects


Interview Questions:
http://www.journaldev.com/tag/java-interview-questions


//http://www.tutorialspoint.com/java/java_environment_setup.htm
http://www.javatpoint.com/


1) What is Java, platform?
2) Features of Java?
3) what is variable, Enums in java?
4) Java Keywords such as assert,native, strictfp, transient and volatile?

Java:Programming language +platform
platform=?
History of Java:
java team=green team
to develop a new language for digital devices but it was suited for internet programming.
it was greentalk--->.gt file extention later 'java' 1995
Originally developed by James Gosling at Sun Microsystems (which is now a subsidiary of Oracle Corporation) and released in 1995

Features of Java:
-----------------
1) Simple:syntax based on c++; removed explicit pointers, operator ovrerloading; Automtic Garbage Collector.
2) Object Oriented:Object,Class,Inheritance,Polymorphism,Abstraction,Encapsulation.
3) Platform Independent: platform->Runtime Environment and API(Application Programming Interface).
	Java code is compiled by the compiler and converted into bytecode.This bytecode is a platform independent code because it can be run on multiple platforms 
	i.e. Write Once and Run Anywhere(WORA). 
4) Secured: java is secured because:No explicit pointer, programs run inside virtual machine sanbox(JVM).
5) Roburst: strong(no pointers, garbage collector, exception handling)
6) Architecture neutral:There is no implementation dependent features e.g. size of primitive types is set.
7) Protable:carry the java bytecode to any platform. 
8) Dynamic:
9) Interpreted:Java byte code is translated on the fly to native machine instructions and is not stored anywhere.
10) High Performance:Java is faster than traditional interpretation since byte code is "close" to native code still somewhat slower than a compiled language (e.g., C++)
	Just-In-Time compilers, Java enables high performance.
11) Mutithreaded:A thread is like a separate program, executing concurrently.
	The main advantage of multi-threading is that it shares the same memory. Threads are important for multi-media, Web applications etc. 
12) Distributed:We can create distributed applications in java. RMI and EJB are used for creating distributed applications.
----------------

What happens at compile time?
At compile time, java file is compiled by Java Compiler (It does not interact with OS) and converts the java code into bytecode.

What happens at runtime?
class file--->classloader---->Bytecode verifier---->Interpreter---->runtime--->hardware.
Classloader: is the subsystem of JVM that is used to load class files.
Bytecode Verifier: checks the code fragments for illegal code that can violate access right to objects.
Interpreter: read bytecode stream then execute the instructions.
-----------------
Q)Can you save a java source file by other name than the class name?
Yes, if the class is not public.
Q)Can you have multiple classes in a java source file?
Yes

1) How to set Temporary Path of JDK in Windows
set path=C:\Program Files\Java\jdk1.6.0_23\bin
1) How to set Temporary Path of JDK in Linux OS
export PATH=$PATH:/home/jdk1.6.01/bin/
2) How to set Permanent Path of JDK in Windows
Go to MyComputer properties -> advanced tab -> environment variables ->
	new tab of user variable -> write path in variable name -> write path of bin folder in variable value -> ok -> ok -> ok
jdk=tools+jre
jre=jvm+API(jars+other files)-------
JVM= specification to provide runtime Environment----abstarct machine

JVM(Specification)---JRE(Implementation)-----cmd prompt to execute java cmds(instance of JRE)

What is difference between object-oriented programming language and object-based programming language?
Object based programming language follows all the features of OOPs except Inheritance. JavaScript and VBScript are examples of object based programming languages. 


Difference between J2SE 5.0 and java SE 6?
=========================================

J2SE 5.0 										Java SE 6
---------------------------------------------------------

StringBuilder
Metadata								XML Parsing
Generics								WebServices 
Annotations								Scripting(Rhino Engine)
Autoboxing								JDBC 4.0
Loop syntax improvements				Desktop API(Java DB with JDK)
Enumerated types						Var args
user inputs "Scanner"
static imports(variable/method)

ex:
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


J2SE 5.0
--------
The development of J2SE 5.0 was led by Sun and progressed following the Java Community Process (JCP) to include input from a variety of constituents. Some highlights of J2SE 5.0:

    New language updates: Metadata, Generics, Enumerated types, Autoboxing of primitive types
    New JVM Monitoring and Management API
    Improved out-of-box performance
    New (but compatible) default Java look and feel
    


Java---- WORA(Write once Run Anywhere).
Features:
========
Simple
Secure
OOPS
Platform Independent
Architecural-neutral
Portable
Multi-Threaded
Distributed
Robust
Interpreted
Dynamic
High Performance

Java code---> byte code(compiled)----> native machine specific code(Interpreter/JIT) is not stored anywhere.

Download and install jdk8-----> set class path(Environment variables)


object? Class? Instance variables?
Access Modifiers:(default, public,private,protected).
Non access modifiers: final, abstract, strictfp

Variables in java: [local, class variables(static), instance variables(non-static)].
Enums:
java keywords: assert,native, strictfp, transient and volatile....
inheritance:
interface:

Polymorphism
Inheritance
Encapsulation
Abstration
Classes
Objects
Instance
Method
Message Parsing

variables: is a named memory location for storing specific data of certain type.
1) Local variables
2) Instance variables
3) class Variables

Constructor:
abstract class, final class, inner class, anonymous class:
packages

data types in java?
Primitive data types:
reference data type:

int decimal = 100;
int octal = 0144;
int hexa =  0x64;
char a = '\u0001';
String a = "\u0001";

Enums are introduced in java5.0.  Enums restrict a variable to have one of only a few predefined values. A Java Enum is a special Java type used to define collections of constants.
a Java enum type is a special kind of Java class. The values in this enumerated list are called enums.
With the use of enums it is possible to reduce the number of bugs in your code.

Java enums extend the java.lang.Enum class implicitly, so your enum types cannot extend another class.
If a Java enum contains fields and methods, the definition of fields and methods must always come after the list of constants in the enum.
Additionally, the list of enum constants must be terminated by a semicolon;

Java Enum: Enum in java is a data type that contains fixed set of constants.
Points to remember for Java Enum
    enum improves type safety
    enum can be easily used in switch
    enum can be traversed
    enum can have fields, constructors and methods
    enum may implement many interfaces but cannot extend any class because it internally extends Enum class

What is the purpose of values() method in enum?
The java compiler internally adds the values() method when it creates an enum. The values() method returns an array containing all the values of the enum.

Defining Java enum
The enum can be defined within or outside the class because it is similar to a class.

Constructor of enum type is private. If you don't declare private compiler internally creates private constructor.
------------------------------------------------------------------------------
a variable is a name of reserved memory location. where we can store values.

Data types in java:
	1) Primitive Data types
		8 primitive data types defined by language & named by a keyword.
		a) byte(8 bites/1 byte)(-2^7 to 2^7 - 1)			byte b=100;(0)
		b) short(16 bits/ 2 bytes)(-2^15 to 2^15 - 1)		short s=200;(0)
		c) int(32 bits/ 4 bytes)(-2^31 to 2^31 - 1)			int i=1000;(0)
		d) long(64 bits/ 8 bytes)(-2^63 to 2^63 -1) 		long l=150L;(0L)
		e) float(32 bites/ 4 bytes)							float f=123.45f;(0.0f)
		f) double(64 bites/ 8 bytes)						double d=125.43;(0.0d)
		g) chart(16 bits/ 1 byte)[(char)0 to 2^16 -1]		char c='A';
		h) boolean(1 bite)[ true / false]					boolean flag=false;(false)
	2) Reference/ Object data types



String pool: a special space in java heap memory. 

Whenever we create a string by assigning value in double quotes. it will check that value in string pool. String s="ravi"; String s1="ravi" both s and s1 refers "ravi" object which is in pool.
If that value is available it refers that pool object. else it created in pool then refers that newly created value.
whenever we create a string with new keyword. it create new object in heap. String s=new String("ravi"); String s1=new String("ravi"); s and s1 are two different objects.

Why String is immutable or final in Java:
-----------------------------------------
[
	1. Saves runtime heap memory
	2. Safe from hacking while connecting DB/socket
	3. Thread safe/no need of synchronize
	4. Security while loading a class by classloader
	5. hashcode is cached at the time of string creation and is faster than other HasMap key. String is mostly used Object as HasMap keys
]


String is one of the most used classes in any programming language. As we know that String is immutable and final in java and java runtime maintains a String pool that makes it a special class.
String immutable Benefits

1. String pool is possible only because String is immutable in java, this way Java Runtime saves a lot of java heap space because different String variables can refer to same String variable in the pool. 
If String would not have been immutable, then String interning would not have been possible because if any variable would have changed the value, it would have been reflected to other variables also.

2. If String is not immutable then it would cause severe security threat to the application. 
For example, database username, password are passed as String to get database connection and in socket programming host and port details passed as String. 
Since String is immutable it�s value can�t be changed otherwise any hacker could change the referenced value to cause security issues in the application.

3. Since String is immutable, it is safe for multithreading and a single String instance can be shared across different threads. 
This avoid the usage of synchronization for thread safety, Strings are implicitly thread safe.

4. Strings are used in java classloader and immutability provides security that correct class is getting loaded by Classloader. 
For example, think of an instance where you are trying to load java.sql.Connection class but the referenced value is changed to myhacked. 
Connection class that can do unwanted things to your database.

5. Since String is immutable, its hashcode is cached at the time of creation and it doesn�t need to be calculated again. 
This makes it a great candidate for key in a Map and it�s processing is fast than other HashMap key objects. 
This is why String is mostly used Object as HashMap keys.


Heap & Static Memory: http://www.journaldev.com/4098/java-heap-memory-vs-stack-memory-difference

Java Heap memory:
Heap memory is used by java runtime to allocate memory to Objects and JRE classes.
Whenever we create any object, it�s always created in the Heap space. Garbage Collection runs on the heap memory to free the memory used by objects that doesn�t have any reference. 
Any object created in the heap space has global access and can be referenced from anywhere of the application.

Java Stack Memory:
Java Stack memory is used for execution of a thread. 
They contain method specific values that are short-lived and references to other objects in the heap that are getting referred from the method. 
Stack memory is always referenced in LIFO (Last-In-First-Out) order. 
Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method. 
As soon as method ends, the block becomes unused and become available for next method.
Stack memory size is very less compared to Heap memory.

Difference between Heap and Stack Memory
----------------------------------------
    1. Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution.
    2. Whenever an object is created, it�s always stored in the Heap space and stack memory contains the reference to it. 
		Stack memory only contains local primitive variables and reference variables to objects in heap space.
    3. Objects stored in the heap are globally accessible whereas stack memory can�t be accessed by other threads.
    4. Memory management in stack is done in LIFO manner whereas it�s more complex in Heap memory because it�s used globally. 
		Heap memory is divided into Young-Generation, Old-Generation etc, more details at Java Garbage Collection.
    5. Stack memory is short-lived whereas heap memory lives from the start till the end of application execution.
    6. We can use -Xms and -Xmx JVM option to define the startup size and maximum size of heap memory. We can use -Xss to define the stack memory size.
	7. When stack memory is full, Java runtime throws java.lang.StackOverFlowError whereas if heap memory is full, it throws java.lang.OutOfMemoryError: Java Heap Space error.
    8. Stack memory size is very less when compared to Heap memory. Because of simplicity in memory allocation (LIFO), stack memory is very fast when compared to heap memory.

Garbage collection, types & Memory management in Java:
Ref: http://www.journaldev.com/2856/java-jvm-memory-model-and-garbage-collection-monitoring-tuning

Java(JVM) Memory Model & Garbage collection monitoring:
======================================================
Heap memory and Permanent memory.
Heap memory= Young generation(clean by Minor GC) + Old Generation(clean by Major GC)[Stop the world Event]
Young Generation= Eden + (Survivor 1 + Survivor 2)
Method area, Memory Pool, Runtime constant pool
Java Stack memory:
Java Heap Memory switch:
-----------------------
-Xms	For setting the initial heap size when JVM starts
-Xmx	For setting the maximum heap size.
-Xmn	For setting the size of the Young Generation, rest of the space goes for Old Generation.

-XX:PermGen			For setting the initial size of the Permanent Generation memory
-XX:MaxPermGen		For setting the maximum size of Perm Gen
-XX:SurvivorRatio	For providing ratio of Eden space and Survivor Space
-XX:NewRatio		For providing ratio of old/new generation sizes. The default value is 2.

3 steps in garbage collection:
-----------------------------
1. Marking
2. Normal Deletion
3. Deletion with Compacting

Garbage collection Types:
------------------------
There are five types of garbage collection types that we can use in our applications. 
We just need to use JVM switch to enable the garbage collection strategy for the application.


    1. Serial GC (-XX:+UseSerialGC): Serial GC uses the simple mark-sweep-compact approach for young and old generations garbage collection i.e Minor and Major GC.
    Serial GC is useful in client-machines such as our simple stand alone applications and machines with smaller CPU. It is good for small applications with low memory footprint.
    
    2. Parallel GC (-XX:+UseParallelGC): Parallel GC is same as Serial GC except that is spawns N threads for young generation garbage collection where N is the number of CPU cores in the system. 
    We can control the number of threads using -XX:ParallelGCThreads=n JVM option.
    Parallel Garbage Collector is also called throughput collector because it uses multiple CPUs to speed up the GC performance. Parallel GC uses single thread for Old Generation garbage collection.
    
    3. Parallel Old GC (-XX:+UseParallelOldGC): This is same as Parallel GC except that it uses multiple threads for both Young Generation and Old Generation garbage collection.
    
    4. Concurrent Mark Sweep (CMS) Collector (-XX:+UseConcMarkSweepGC): CMS Collector is also referred as concurrent low pause collector. It does the garbage collection for Old generation. 
    CMS collector tries to minimize the pauses due to garbage collection by doing most of the garbage collection work concurrently with the application threads.
    CMS collector on young generation uses the same algorithm as that of the parallel collector. This garbage collector is suitable for responsive applications where we can�t afford longer pause times. 
    We can limit the number of threads in CMS collector using -XX:ParallelCMSThreads=n JVM option.
    
    5. G1 Garbage Collector (-XX:+UseG1GC): The Garbage First or G1 garbage collector is available from Java 7 and it�s long term goal is to replace the CMS collector. 
    The G1 collector is a parallel, concurrent, and incrementally compacting low-pause garbage collector.
    Garbage First Collector doesn�t work like other collectors and there is no concept of Young and Old generation space. It divides the heap space into multiple equal-sized heap regions. 
    When a garbage collection is invoked, it first collects the region with lesser live data, hence �Garbage First�. You can find more details about it at Garbage-First Collector Oracle Documentation.

Java Garbage Collection Tuning
==============================
Java Garbage Collection Tuning should be the last option you should use for increasing the throughput of your application and only when you see drop in performance because of longer GC timings causing application timeout.

If you see java.lang.OutOfMemoryError: PermGen space errors in logs, then try to monitor and increase the Perm Gen memory space using -XX:PermGen and -XX:MaxPermGen JVM options. 
You might also try using -XX:+CMSClassUnloadingEnabled and check how it�s performing with CMS Garbage collector.
If you are see a lot of Full GC operations, then you should try increasing Old generation memory space.
Overall garbage collection tuning takes a lot of effort and time and there is no hard and fast rule for that. 
You would need to try different options and compare them to find out the best one suitable for your application.


String in Java
=============
    1. String class represents character strings, we can instantiate String by two ways.  String str = �abc�; or String str = new String (�abc�);
    2. String is immutable in java, so its easy to share it across different threads or functions.
    	When we create a String using double quotes, it first looks for the String with same value in the JVM string pool, 
    	if found it returns the reference else it creates the String object and then place it in the String pool.
    	This way JVM saves a lot of space by using same String in different threads. 
    	But if new operator is used, it explicitly creates a new String in the heap memory.
    3. + operator is overloaded for String and used to concatenate two Strings. Although internally it uses StringBuffer to perform this action.
    4. String overrides equals() and hashCode() methods, two Strings are equal only if they have same characters in same order. 
    	Note that equals() method is case sensitive, so if you are not looking for case sensitive checks, you should use equalsIgnoreCase() method.
    4. A String represents a string in the UTF-16 format
    5. String is a final class with all the fields as final except �private int hash�. 
    	This field contains the hashCode() function value and created only when hashCode() method is called and then cached in this field. 
    	Furthermore, hash is generated using final fields of String class with some calculations, so every time hashCode() method is called, 
    	it will result in same output. For caller, its like calculations are happening every time but internally it�s cached in hash field.

String vs StringBuffer vs StringBuilder(in java 1.5):
=======================================
1)	  StringBuffer and StringBuilder are mutable objects in java and provide append(), insert(), delete() and substring() methods for String manipulation.
2)    String is immutable whereas StringBuffer and StringBuider are mutable classes.
3)    StringBuffer is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder is more faster than StringBuffer.
4)    String concat + operator internally uses StringBuffer or StringBuilder class.
5)    For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.


Difference between JDK, JRE and JVM in Java:
==========================================
JDK-java development kit: It is a core component of Java Environment and provides all the tools for compiling, debugging and executing java programs.
JDK is platform specific software and is superset of JRE with compiler, debugger and core classes.

JRE-java runtime environment: it is implementation of JVM, it provides platform to execute java programs. 
JRE= JVM + Java binaries + other classes to execute java programs successfully. 
JRE does not contain any development tools(java compiler, debugger etc).
if we want to run a java program we need to have JRE, no need of JDK.

JVM-java virtual machine: It is heart of java programming language. It is platform dependent.  
It is responsible for converting byte code to machine specific code, memory management, security, garbage collection etc.
it is customizable means we can set min or max memory to JVM.
JVM is virtual because it provides interface that does not depend on the under laying OS or machine hardware.


JDK vs JRE vs JVM
=================
    1. JDK is for development purpose whereas JRE is for running the java programs.
    2. JDK and JRE both contains JVM so that we can run our java program.
    3. JVM is the heart of java programming language and provides platform independence.


Just-in-time Compiler (JIT):
===========================
 JIT is part of JVM that optimizes byte code to machine specific language compilation by compiling similar byte codes at same time, 
 hence reducing overall time taken for compilation of byte code to machine specific language.


Unicode System(\u0000 to \uFFFF)
Unicode is a universal international standard character encoding that is capable of representing most of the world's written languages






Design patterns represent the best practices used by experienced object-oriented software developers. 
-------------------------------------------------------------------
Slide:1
=======

OOSD Problems
Why?
What?
Who?
When?
Advantage of design pattern
Categories/Types?
--------------------------------------------------------------------


If any problem occurs frequently while developing a object oriented software.
The solution for that problem should be effective and that can be described as pattern.

Customer's requirements are keep on changing. we need to change the existed code/ write new code whenever we get new requirement/ changes in existed requirement. 
But that changes should be minimal.


Give Some common recurring problems.
Change:  "IBMv7k Unified, IBM Block " to  "IBM Storewize" everywhere.




Design pattern:
--------------
Design patterns are solutions to general problems that software developers faced during software development.
design patterns are programming language independent strategies for solving the common object-oriented design problems.
That means, a design pattern represents an idea, not a particular implementation. 



who initiated Design Patterns?
------------------------------
    Christopher Alexander was the first person who invented all the above Design Patterns in 1977.
    But later the Gang of Four - "Design Patterns - Elements of Reusable Object-Oriented Software." book was written by 
	a group of four persons named as Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides in 1995. These authors are collectively known as Gang of Four (GOF).
    That's why all the above 23 Design Patterns are known as Gang of Four (GoF) Design Patterns.

According to these authors design patterns are primarily based on the following principles of object orientated design.
    Program to an interface not an implementation
    Favor object composition over inheritance

When should we use the design patterns?
a) We must use the design patterns during the analysis and requirement phase of SDLC(Software Development Life Cycle).
b) Design patterns ease the analysis and requirement phase of SDLC by providing information based on prior hands-on experiences.
	
	
Usage of Design Pattern:
Design Patterns have two main usages in software development.
1. Common platform for developers
2. Best Practices
	*To become a professional software developer, you must know at least some popular solutions (i.e. design patterns) to the coding problems. 

Advantage of design pattern:
---------------------------
	They are already designed, provides industry standard approach to solve a recurring problem, so it saves time if we sensibly use the design pattern.
	Using design patterns promotes re-usability that leads to more robust and highly maintainable code. 
	Since design patterns are already defined, it makes our code easy to understand and debug.
	It leads to faster development and new members of team understand it easily.
    
    They are reusable in multiple projects.
    They provide the solutions that help to define the system architecture.
    They capture the software engineering experiences.
    They provide transparency to the design of an application.
    
    Design patterns don't guarantee an absolute solution to a problem. They provide clarity to the system architecture and the possibility of building a better system.


Categorization of design patterns:
---------------------------------
Basically, design patterns are categorized into two parts:
    Core java (or JSE) Design Patterns.
    JEE Design Patterns.
Core Java Design Patterns

Types of Design Patterns:
------------------------
There are 23 design patterns which can be classified in three categories: 
Creational, Structural and Behavioral patterns. We'll also discuss another category of design pattern: J2EE design patterns. 

1)Creational Patterns
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new opreator.
This gives program more flexibility in deciding which objects need to be created for a given use case.

2)Structural Patterns
These design patterns concern class and object composition.
Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.

3)Behavioral Patterns
These design patterns are specifically concerned with communication between objects.

4)J2EE Patterns
These design patterns are specifically concerned with the presentation tier. These patterns are identified by Sun Java Center.

*****************************************************************************************************************************
1. how to halt program for 36 hours?
2. Differenct betn string buffer and string builder?
3. hascode n equals?
4. singleton pattern? how to write them?
5. LL , AL, List.
6. Maps vs Sets 
7. TreeSet vs HashSet
8. Comparator vs Comparable
9. About JVM
10. .class vs .java
11. about main method(psvm)
12. abt Static , final, abstract .. keywords
13. Multi-thread , sleep,synchronize
14. wait, notify,notifyall
15. what is probability of breaking glass ball when you throw down from the building ? i.e., find out the least floor number from which if we thrown it will break? ( problem solving question )
16. singleton
17. Checked vs Un-Checked Exceptions, and few examples
18. Overriding vs OverLoading
19. Map Vs List
20. Code snippet to generate some exeptions like NPE
21. try, catch, throw,throws
22. interfac vs abstract.
23. String immutability
24. printing null values
25. Object intantiation for super/sub classes and with references.

1.	My work in UCSD
2.	Difference between String, String Buffer and String Builder
3.	Static variable and its usage in our project code
4.	Stack 
5.	1.8 features (used in our project)
6.	Access Specifiers
7.	Interface and Abstract class
8.	ArrayList (List used in our project)
9.	Inheritance
10.	OOPS concepts
11.	Polymorphism
12.	DBMS (Used in our project)
13.	Data Structure
14.	Linked List
15.	Algorithms
16.	Sorting in Ascending order (TreeSet)
17.	Comparing two objects
18.	Objects comparison
19.	Palindrome 
20.	String reverse (Without using reverse method)


*/