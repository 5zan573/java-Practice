package Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteroatorAndListofIterator {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new <Integer>ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		Iterator<Integer> i = arr.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		ListIterator<Integer> il = arr.listIterator();
		while (il.hasNext()) {
			System.out.println(il.next());
		}
		while (il.hasPrevious()) {
			System.out.println(il.previous());
		}
	}
}
