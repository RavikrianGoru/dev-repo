package javahungry;

public class ObjectClass_ThreadClass_Methods {

	public static void main(String[] args) {

		
		System.out.println("Object Class Methods:");
		System.out.println("---------------------");
		System.out.println("registerNatives()");
		System.out.println("getClass()");
		System.out.println("public native int hashCode()");
		System.out.println("public boolean equals(Object obj)");
		System.out.println("protected native Object clone() throws CloneNotSupportedException");
		System.out.println("public String toString()");
		System.out.println("public final native void notify()");
		System.out.println("public final native void notifyAll()");
		System.out.println("public final native void wait(long timeout) throws InterruptedException");
		System.out.println("protected void finalize() throws Throwable ");
		System.out.println("");
		System.out.println("Thread Class implements Runnable interface");
		System.out.println("--------------------");
		System.out.println("public static native Thread currentThread()");
		System.out.println("public synchronized void start()");
		System.out.println("private void exit() ");
		System.out.println("public static native void yield()");
		System.out.println("public static native void sleep(long millis) throws InterruptedException");
		
		System.out.println("public void interrupt()");
		System.out.println("public static boolean interrupted()");
		System.out.println("public boolean isInterrupted()");
		System.out.println("public final native boolean isAlive()");
		System.out.println("public final void setPriority(int newPriority)");
		System.out.println("public final int getPriority()");
		System.out.println("public final synchronized void setName(String name) ");
		System.out.println("public final String getName()");
		System.out.println("public final ThreadGroup getThreadGroup()");
		System.out.println("public static int activeCount()");
		System.out.println("public final synchronized void join(long millis)");
		System.out.println("public final void setDaemon(boolean on)");
		System.out.println("public final boolean isDaemon()");
		System.out.println("public long getId()");
		System.out.println("private static synchronized long nextThreadID()");
		System.out.println();
		
		System.out.println("private void init(ThreadGroup g, Runnable target, String name,long stackSize)");
		System.out.println("public void run() over riddend from Runnable interface");
		System.out.println("public final void stop()----Deprecated");
		System.out.println("public void destroy()-------Deprecated");
		System.out.println("public final void suspend()--Deprecated");
		System.out.println("public final void resume()---Deprecated");
		System.out.println("void blockedOn(Interruptible b)");
		System.out.println("private static native void registerNatives()");
		try {
			Thread.sleep(36*60*60*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
