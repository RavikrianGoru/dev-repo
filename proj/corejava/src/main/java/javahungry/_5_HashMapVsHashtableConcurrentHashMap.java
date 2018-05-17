package javahungry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.*;


class Ravi
{
	int eid;
	String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ravi(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ravi other = (Ravi) obj;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
public class _5_HashMapVsHashtableConcurrentHashMap {

/*
 Difference between hashmap and hashtable  includes five point 
 namely Synchronization,Null keys and values,Iterating values , Fail fast iterator ,Performance,Superclass.


HashMap:
0) HashMap ------ derived from AbstractMap
1)not synchronized/not Thread safe----not suitable for multi threaded env.
2) allows one null for key amd multiple null for value.
3) it uses Iterator to iterate entries.
4) HashMap is Fail-fast iterator. when we try to modify structure of HashMap while Iterating throws ConcurrentModificationException.
5) HashMap is much faster and less memory than Hashtable(unsynchronized)

Hashtable:
0) Hashtable ----- derived from Dictionary class(Deprecated)
1) synchronized/ Thread safe---- suitable for multi threaded env.
2) does not allow null for key and no null for value.
3) it uses enumerator to iterate entries  
4) Hashtable is not Fail-fast iterator.
5) Hastable is slower than HashMap(synchronized)

Both does not gives guarantee that the order of elements to be desplayed 
Both implements Map interface.
Both provides constant time for put() and get()methods.
Both internally uses Hashing mechanism.
 
*) only Vector and Hashtable uses Enumerator to iterate entries.

HashMap Vs ConcurrentHashMap
---------------------------

HashMap:
1) Not Thread Safe(unsynchronized)
2) new HashMap()
3) one null for Key ad many null for Value.
4) fast and suitable for single threaded env.

ConcurrentHashMap:
1) Thread Safe(synchronized)
2) Collections.synchronizedMap(hashMapObj)/new ConcurrentHashMap()---- it created Hashtable equivalent object.
3) Does not allow null for key and null for Value
4) slow and suitable for multiple threaded env.


*/
	
	public static void main(String[] args) {
		
		final ReentrantLock lock=new ReentrantLock();
		lock.lock();
		lock.unlock();
		final  ReentrantReadWriteLock rwLock=new java.util.concurrent.locks.ReentrantReadWriteLock();
		rwLock.writeLock();
		rwLock.readLock();
		rwLock.isWriteLockedByCurrentThread();
		
		
		
		System.out.println("Hashtable-----------------------");
		Hashtable ht=new Hashtable();
		System.out.println(ht.put(1, 1));
		System.out.println(ht.put(2, 2));
		System.out.println(ht.put(2, 2));
		System.out.println(ht);

		
		System.out.println("HashMap-----------------------");
		HashMap hm=new HashMap();
		System.out.println(hm.put(1, 1));
		System.out.println(hm.put(2, 2));
		System.out.println(hm.put(null, 2));
		//System.out.println(hm.put(null, null));
		hm.forEach((k,v)->{System.out.println(v+"--------"+k);});
		System.out.println(hm);
		
		
		System.out.println("ConcurrentHashMap------------");
		ConcurrentHashMap<Object, Object> chm=new ConcurrentHashMap<>();
		System.out.println(chm.put(1,1));
		System.out.println(chm.put(2,234));
		System.out.println(chm.put(1,345));
		System.out.println(chm);
		
		HashSet sh=new HashSet();
		sh.add(new Ravi(1,"ravi"));
		sh.add(new Ravi(2,"ravi"));
		sh.add(new Ravi(1,"ravi"));
		
		sh.add(new String("Ravi"));
		sh.add(new String("Ravi"));
		
		
		System.out.println(sh);
		
		
		
		
	}

}
