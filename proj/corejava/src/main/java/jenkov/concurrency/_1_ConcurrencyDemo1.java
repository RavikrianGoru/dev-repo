package jenkov.concurrency;

/*
 http://tutorials.jenkov.com/java-concurrency/concurrency-models.html
 
Benefits of Multithreading:
	1) Better resource Utilization
	2) Suitable for similar tasks design
	3) Responsive programs

Multithreading Costs:
	-) Though some parts of a multithreaded applications is simpler than a singlethreaded application, other parts are more complex.
	-) Code executed by multiple threads accessing shared data need special attention.
	-) Thread interaction is far from always simple
	-) Errors arising from incorrect thread synchronization can be very hard to detect, reproduce and fix. 
	
Context Switching Overhead
	When a CPU switches from executing one thread to executing another, the CPU needs to save the local data, 
program pointer etc. of the current thread, and load the local data, program pointer etc. of the next thread to execute. This switch is called a "context switch".
The CPU switches from executing in the context of one thread to executing in the context of another.
Context switching isn't cheap. You don't want to switch between threads more than necessary. 

-) Increased Resource Consumption
	A thread needs some resources from the computer in order to run. Besides CPU time a thread needs some memory to keep its local stack.
	It may also take up some resources inside the operating system needed to manage the thread.
	Try creating a program that creates 100 threads that does nothing but wait, and see how much memory the application takes when running. 
	
A concurrency model: specifies how threads in the the system collaborate to complete the jobs they are are given.
	Different concurrency models split the jobs in different ways, and the threads may communicate and collaborate in different ways.
	In a concurrent system different threads communicate with each other. In a distributed system different processes communicate with each other (possibly on different computers). 

	Of course distributed systems have the extra challenge that the network may fail, or a remote computer or process is down etc. 
	But a concurrent system running on a big server may experience similar problems if a CPU fails, a network card fails, a disk fails etc.

Concurrency models:
-------------------
1) Parallel Workers:
2) Assembly Line
3) Functional Parallelism

1) Parallel Concurrency model:
	Incoming jobs are assigned to different workers. It this model Delegator distributes the incoming jobs to different workers. Each worker completes the full Job.
	The workers work in parallel, running in different threads, and possibly on different CPUs.
	Ex: If the parallel worker model was implemented in a car factory, each car would be produced by one worker. Worker would build everything from start to end. 
	
				---- Worker1
	Delegator------- Worker2
				---- Worker3
	This model is most commonly used concurrency model in Java applications. [java.util.concurrent]

Advantages:
+) Easy to understand and To increase the parallelization of the application you just add more workers.

Disadvantages:
-) Shared state can get complex:
 The shared workers often need access to some kind of shared data, either in memory or in a shared database.
 Some of this shared state is in communication mechanisms like job queues. But some of this shared state is business data, data caches, connection pools to the database etc.
 The threads need to access the shared data in a way that makes sure that changes by one thread are visible to the others (pushed to main memory and not just stuck in the CPU cache of the CPU executing the thread). 
 Threads need to avoid race conditions, deadlock and many other shared state concurrency problems. 

 Additionally, part of the parallelization is lost when threads are waiting for each other when accessing the shared data structures. 
 Many concurrent data structures are blocking, meaning one or a limited set of threads can access them at any given time.
 This may lead to contention on these shared data structures. 
 Modern non-blocking concurrency algorithms may decrease contention and increase performance, but non-blocking algorithms are hard to implement. 

 A persistent data structure always preserves the previous version of itself when modified. 
 Thus, if multiple threads point to the same persistent data structure and one thread modifies it, the modifying thread gets a reference to the new structure. 
 All other threads keep a reference to the old structure which is still unchanged and thus consistent.

 While persistent data structures are an elegant solution to concurrent modification of shared data structures, persistent data structures tend not to perform that well.

-) Stateless Workers:
 Shared state can be modified by other threads in the system. Therefore workers must re-read the state every time it needs it, to make sure it is working on the latest copy. 
 This is true no matter whether the shared state is kept in memory or in an external database.
 A worker that does not keep state internally (but re-reads it every time it is needed) is called stateless . 
 Re-reading data every time you need it can get slow. Especially if the state is stored in an external database.

-) Job Ordering is Nondeterministic
 Another disadvantage of the parallel worker model is that the job execution order is nondeterministic. 
 There is no way to guarantee which jobs are executed first or last. Job A may be given to a worker before job B, yet job B may be executed before job A.
 	
	
	
	
2) Assembly Line concurrency model:(Shared Nothing Concurrent model):
	The second concurrency model is what I call the assembly line concurrency model. 
	The workers are organized like workers at an assembly line in a factory. Each worker only performs a part of the full job. When that part is finished the worker forwards the job to the next worker. 
	Each worker is running in its own thread, and shares no state with other workers. This is also sometimes referred to as a shared nothing concurrency model. 	
	
	Delegator---->Worker1--->Worker2--->Worker3

	Systems using the assembly line concurrency model are usually designed to use non-blocking IO. 
	Non-blocking IO means that when a worker starts an IO operation (e.g. reading a file or data from a network connection) the worker does not wait for the IO call to finish.
	
	In reality, the jobs may not flow along a single assembly line. Since most systems can perform more than one job, jobs flows from worker to worker depending on the job that needs to be done. 
	In reality there could be multiple different virtual assembly lines going on at the same time.
	
			 -----> Worker-----> Worker-----> Worker-----> Worker						 -----> Worker-----> Worker-----> --------->Worker
			 -----> Worker-----> Worker-----> Worker-----> Worker   					 -----> Worker-----> Worker-----> \-------->Worker
	Delegator-----> Worker-----> Worker-----> Worker-----> Worker			Or  Delegator-----> Worker-----> Worker-----> /--------> Worker 
			 -----> Worker-----> Worker-----> Worker-----> Worker						 -----> Worker-----> Worker-----> Worker
			 -----> Worker-----> Worker-----> Worker-----> Worker						 -----> Worker-----> Worker-----> Worker
			 
			 
	Reactive, Event Driven Systems:
		Systems using an assembly line concurrency model are also sometimes called reactive systems, or event driven systems.
	Actors vs. Channels	
		Actors and channels are two similar examples of assembly line (or reactive / event driven) models.
		In the actor model each worker is called an actor. Actors can send messages directly to each other. Messages are sent and processed asynchronously. 
		Actors can be used to implement one or more job processing assembly lines.
		
		In the channel model, workers do not communicate directly with each other. Instead they publish their messages (events) on different channels. 
		Other workers can then listen for messages on these channels without the sender knowing who is listening.
Advantages:
+) No Shared State: The fact that workers share no state with other workers means that they can be implemented without having to think about all the concurrency problems that may arise from concurrent access to shared state.		
   This makes it much easier to implement workers. You implement a worker as if it was the only thread performing that work - essentially a singlethreaded implementation. 
+) Stateful Workers: Since workers know that no other threads modify their data, the workers can be stateful.
+) Better Hardware Conformity: Singlethreaded code has the advantage that it often conforms better with how the underlying hardware works. 
   First of all, you can usually create more optimized data structures and algorithms when you can assume the code is executed in single threaded mode.
   
   Second, singlethreaded stateful workers can cache data in memory as mentioned above. When data is cached in memory there is also a higher probability that this data is also cached in the CPU cache of the CPU executing the thread. 
   This makes accessing cached data even faster.
+) Job Ordering is Possible:It is possible to implement a concurrent system according to the assembly line concurrency model in a way that guarantees job ordering.
   Job ordering makes it much easier to reason about the state of a system at any given point in time.
Disadvantages:
-) The main disadvantage of the assembly line concurrency model is that the execution of a job is often spread out over multiple workers, and thus over multiple classes in your project. Thus it becomes harder to see exactly what code is being executed for a given job. 


3) Functional Parallelism concurrency model:
The basic idea of functional parallelism is that you implement your program using function calls. Functions can be seen as "agents" or "actors" that send messages to each other.
All parameters passed to the function are copied, so no entity outside the receiving function can manipulate the data. This copying is essential to avoiding race conditions on the shared data. 
This makes the function execution similar to an atomic operation. Each function call can be executed independently of any other function call.

When each function call can be executed independently, each function call can be executed on separate CPUs. That means, that an algorithm implemented functionally can be executed in parallel, on multiple CPUs. 

With Java 7 we got the java.util.concurrent package contains the ForkAndJoinPool which can help you implement something similar to functional parallelism.
With Java 8 we got parallel streams which can help you parallelize the iteration of large collections.

The hard part about functional parallelism is knowing which function calls to parallelize. Coordinating function calls across CPUs comes with an overhead.
If the function calls are very small, attempting to parallelize them may actually be slower than a singlethreaded, single CPU execution. 
 
Which Concurrency Model is Best?

*) As is often the case, the answer is that it depends on what your system is supposed to do. If your jobs are naturally parallel, independent and with no shared state necessary, you might be able to implement your system using the parallel worker model. 
*) Many jobs are not naturally parallel and independent though. For these kinds of systems I believe the assembly line concurrency model has more advantages than disadvantages, and more advantages than the parallel worker model. 

You don't even have to code all that assembly line infrastructure yourself. Modern platforms like Vert.x has implemented a lot of that for you.




*/public class _1_ConcurrencyDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Mutithreading, benefits, Costs, Context Switching.");
		System.out.println("Concurrency models \n1. Parallel workers\n2. Assembly line \n3. Functional Parallelism ");
		System.out.println("Advantages and disadvantages of Concurrency models  and wich one is best. ");
		
		
		
	}

}
