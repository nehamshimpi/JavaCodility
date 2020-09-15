import java.util.Set;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

import java.util.TreeSet;

public class Assignment4UniqueElements {

	public static void main(String[] args) throws Exception {
		Set<Integer> ts = new TreeSet<Integer>();
		
		ts.add(104);
		ts.add(103);
		ts.add(102);
		ts.add(101);
		ts.add(100);

		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			Integer setorder = (Integer) it.next();
			System.out.println(setorder);
			ts.add(104);
			if (setorder.equals(104)) {
				throw new ConcurrentModificationException("Error exists: user trying to add duplicates");
			}
		}
	}
}
