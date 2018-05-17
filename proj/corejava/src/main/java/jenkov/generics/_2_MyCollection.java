package jenkov.generics;

import java.util.Iterator;

class MyCollection<E> implements Iterable<E> {
	
	@Override
	public Iterator<E> iterator() {
		return new MyIterator();
	}
}

class MyIterator<E> implements Iterator<E>
{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class _2_MyCollection {

	public static void main(String[] args) {
		System.out.println("Creating our own Cleection which implements Iterable Interface");
		MyCollection<String> myCollObj=new MyCollection<String>();
	}

}
