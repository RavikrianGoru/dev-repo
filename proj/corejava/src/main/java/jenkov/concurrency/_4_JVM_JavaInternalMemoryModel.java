package jenkov.concurrency;
/*

https://www.journaldev.com/2856/java-jvm-memory-model-memory-management-in-java

Java Memory Model:
------------------
The Java memory model used internally in the JVM divides memory between thread stacks and the heap
-----------------------------
			Memory			|
		    /	  \			|
Thread Stack		Heap	|
----------------------------|

1) Thread stack:
Each thread running in JVM machine has its own thread stack. Thread stack contains methods info and all local variables, and references of objects. but local object are stored in heap.
All local variables of primitive types ( boolean, byte, short, char, int, long, float, double) are fully stored on the thread stack and are thus not visible to other threads.

2) The Heap:
The heap contains all objects created in your Java application, regardless of what thread created the object. 
This includes the object versions of the primitive types (e.g. Byte, Integer, Long etc.). 
It does not matter if an object was created and assigned to a local variable, or created as a member variable of another object, the object is still stored on the heap.


An object contains member variables, methods and local variables. 
In this case, all member primitive, member object variables and methods stored in heap along with object.
All the local variables of methods stored in Thread stack.
Static class variables stored in heap along with class definition.

Objects on the heap can be accessed by all threads that have a reference to the object. When a thread has access to an object, it can also get access to that object's member variables.
If two threads call a method on the same object at the same time, they will both have access to the object's member variables, but each thread will have its own copy of the local variables. 

Hardware Memory Architecture(multi core CPUs):
---------------------------------------------
Each CPU contains a set of registers which are essentially in-CPU memory.
The CPU can perform operations much faster on these registers than it can perform on variables in main memory. 
That is because the CPU can access these registers much faster than it can access main memory. 

Each CPU may also have a CPU cache memory layer. In fact, most modern CPUs have a cache memory layer of some size. 
The CPU can access its cache memory much faster than main memory, but typically not as fast as it can access its internal registers.
Some CPUs may have multiple cache layers (Level 1 and Level 2).
A computer also contains a main memory area (RAM). All CPUs can access the main memory.
-----------------------------------------------
				Computer						|
												|
												
												
CPU1 + registers			CPU2 + registers	|
		|							|			|
CPU Cache memory			CPU Cache memory	|
			\				/					|
				RAM memory						|
												|
------------------------------------------------												


Bride between Java Memory model and Hardware Memory Architecture:
----------------------------------------------------------------
The hardware memory architecture does not distinguish between thread stacks and heap. On the hardware, both the thread stack and the heap are located in main memory. 
Parts of the thread stacks and heap may sometimes be present in CPU caches and in internal CPU registers.

When objects and variables can be stored in various different memory areas in the computer, certain problems may occur. The two main problems are:

    1) Visibility of thread updates (writes) to shared variables.
    2) Race conditions when reading, checking and writing shared variables.

1) Visibility of Shared Objects
If two or more threads are sharing an object, without the proper use of either volatile declarations or synchronization, updates to the shared object made by one thread may not be visible to other threads.

Imagine that the shared object is initially stored in main memory. A thread running on CPU one then reads the shared object into its CPU cache. 
There it makes a change to the shared object. As long as the CPU cache has not been flushed back to main memory, the changed version of the shared object is not visible to threads running on other CPUs. 
This way each thread may end up with its own copy of the shared object, each copy sitting in a different CPU cache. 

Solution: To solve this problem you can use Java's volatile keyword. 
	The volatile keyword can make sure that a given variable is read directly from main memory, and always written back to main memory when updated. 

2) Race Conditions:
If two or more threads share an object, and more than one thread updates variables in that shared object, race conditions may occur.

Imagine if thread A reads the variable count of a shared object into its CPU cache. Imagine too, that thread B does the same, but into a different CPU cache. 
Now thread A adds one to count, and thread B does the same. Now var1 has been incremented two times, once in each CPU cache.

If these increments had been carried out sequentially, the variable count would be been incremented twice and had the original value + 2 written back to main memory.

However, the two increments have been carried out concurrently without proper synchronization. 
Regardless of which of thread A and B that writes its updated version of count back to main memory, the updated value will only be 1 higher than the original value, despite the two increments. 

Solution: To solve this problem you can use a Java synchronized block. A synchronized block guarantees that only one thread can enter a given critical section of the code at any given time. 
Synchronized blocks also guarantee that all variables accessed inside the synchronized block will be read in from main memory, and when the thread exits the synchronized block, 
all updated variables will be flushed back to main memory again, regardless of whether the variable is declared volatile or not. 



----------


1) The most important thing to remember about Java memory management is "nullify" your reference.
    Only objects that are not referenced are to be garbage collected.
    
    
*/

public class _4_JVM_JavaInternalMemoryModel {

	public static void main(String[] args) {

	}

}
