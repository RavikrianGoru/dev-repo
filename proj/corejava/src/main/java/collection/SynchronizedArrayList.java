package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) throws Exception {

		ArrayList<String> al0 = new ArrayList<String>();
		List<String> al1 = Collections.synchronizedList(new ArrayList<String>());
		CopyOnWriteArrayList<String> al2 = new CopyOnWriteArrayList<String>();

		al0.add("Ravi01");
		al0.add("Ravi02");
		al0.add("Ravi03");
		al0.add("Ravi04");
		al0.add("Ravi05");
		al0.add("Ravi06");
		System.out.println(al0);
		al1.add("Ravi11");
		al1.add("Ravi12");
		al1.add("Ravi13");
		al1.add("Ravi14");
		al1.add("Ravi15");
		al1.add("Ravi16");
		al1.add("ghjgjgjh");
		System.out.println(al1);
		al2.add("Ravi21");
		al2.add("Ravi22");
		al2.add("Ravi23");
		al2.add("Ravi24");
		al2.add("Ravi25");
		al2.add("Ravi26");
		System.out.println(al2);

		Iterator itr0 = al0.iterator();
		Iterator itr1 = al1.iterator();
		Iterator itr2 = al2.iterator();

		boolean flag0 = true;
		boolean flag1 = true;
		boolean flag2 = true;

		while (itr0.hasNext()) {
			System.out.println(itr0.next());
			// if(flag0)
			// {
			// al0.add("Ravi000000");
			//flag0=false;
			// }
		}

		synchronized (al1) {

			while (itr1.hasNext()) {
				System.out.println(itr1.next());
//				if (flag1) {
//					al1.add("Ravi111111");
//					flag1=false;
//				}
			}
		}
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			if (flag2) {
				al2.add("Ravi222222");
				flag2=false;
			}
		}
		System.out.println(al2);

	}

}
