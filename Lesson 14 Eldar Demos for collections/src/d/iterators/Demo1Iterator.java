package d.iterators;

import java.util.Iterator;

public class Demo1Iterator {

	public static void main(String[] args) {
		Iterator<?> it = null;

//		Returns true if the iteration has more elements
		it.hasNext();

//		Returns the next element in the iteration.
		it.next();

//		Removes from the underlying collection the last element returned by this iterator.
//		This method can be called only once per call to next.
		it.remove();

	}

}
