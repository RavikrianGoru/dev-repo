package jenkov.concurrency;

/*
 http://tutorials.jenkov.com/java-concurrency/same-threading.html
  
Same-threading is a concurrency model where a single-threaded systems are scaled out to N single-threaded systems. 
The result is N single-threaded systems running in parallel.
A same-threaded system is not a pure single-threaded system, because it contains of multiple threads. But - each of the threads run like a single-threaded system. 

+) Single-threaded systems have gained popularity because their concurrency models are much simpler than multi-threaded systems. 
+) Single-threaded systems do not share any data with other threads. This enables single thread to use non-concurrent data structures, and utilize the CPU and CPU caches better. 

Unfortunately, single-threaded systems do not fully utilize modern CPUs. A modern CPU often comes with 2, 4 or more cores. Each core functions as an individual CPU. A single-threaded system can only utilize one of the cores
*) One Thread Per CPU
*) No Shared State
*) Load Distribution
*) Services With Sharded Data
If your system does actually need to share data, or at least a database, you may be able to shard the database. Sharding means that the data is divided among multiple databases
*) Thread Communication:The thread communication can take place via queues, pipes, unix sockets, TCP sockets etc. Whatever fits your system

*/

public class _2_SameThreadModel {

	public static void main(String[] args) {
		System.out.println("Same-threading is a concurrency model where a single-threaded systems are scaled out to N single-threaded systems.");
		System.out.println("The result is N single-threaded systems running in parallel.");
		System.out.println("A same-threaded system is not a pure single-threaded system, because it contains of multiple threads. But - each of the threads run like a single-threaded system. ");
	}

}
