package jenkov.concurrency;


class MySignal
{
	protected boolean hasDataToProcess=false;
	
	public synchronized boolean hasDataToProcess()
	{
		return this.hasDataToProcess;
	}
	public synchronized void setHasDataToProcess(boolean hasDataToProcess)
	{
		this.hasDataToProcess=hasDataToProcess;
	}
}

class MySignalThread implements Runnable
{
	protected MySignal signalObj=new MySignal();
	MySignalThread( MySignal signal)
	{
		this.signalObj=signal;		
	}

	@Override
	public void run() {
		
	}
	
}

class MonitorObj
{
}

class MonitorObjWaitNotify
{
	MonitorObj obj=new MonitorObj();
	
	public void doWait()
	{
		synchronized (obj) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	public void doNotify()
	{
		synchronized (obj) {
				obj.notify();
		}
	}
	
}

 class Lock{

	  private boolean isLocked = false;

	  public synchronized void lock()
	  throws InterruptedException{
	    while(isLocked){
	      wait();
	    }
	    isLocked = true;
	  }

	  public synchronized void unlock(){
	    isLocked = false;
	    notify();
	  }
	}
class Counter1
{
	private int count=0;
	private Lock lock=new Lock();
	
	
}
public class _8_ThreadSignaling {

	public static void main(String[] args) {
		Thread t1=new Thread();
		//System.out.println((char[])null);//null pointer Exception
		System.out.println((String)null);
		System.out.println((Object)null);
		//System.out.println(null); Compile time error

	}

}
