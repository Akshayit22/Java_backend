import java.util.*;
import java.lang.*;

class Array {
	void PrintArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	void PrintArray(String arr[]) {
		for (String i : arr) {
			System.out.print(i + " ");
		}
	}

	int[] ArrayReturn() {
		return new int[] { 10, 20, 30, 40, 50 };
	}
}

class Collection {
	List<String> l1 = new ArrayList<>();
	List<Integer> l2 = new LinkedList<>();

	ArrayList<String> list = new ArrayList<String>();
	LinkedList<Integer> llist = new LinkedList<>();

	Stack<Integer> st = new Stack<Integer>();
	Queue<String> q = new ArrayDeque<>();
	PriorityQueue<String> qp = new PriorityQueue<>();

	Set<Integer> s1 = new HashSet<Integer>();
	Set<Integer> s2 = new LinkedHashSet<Integer>();
	Set<Integer> s3 = new TreeSet<Integer>();
	SortedSet<Integer> s4 = new TreeSet<>();

	HashMap<String, Integer> map = new HashMap<String, Integer>();

	Collection() {
		list.add("Ak");
		list.add("Aka");

		st.push(1);
		st.push(2);
		st.push(4);
		st.push(7);
		st.pop();

		qp.add("zzz");
		qp.add("xxx");
		qp.add("eee");
		qp.add("aaa");

		map.put("India", 140);
		map.put("China", 135);
		map.put("USA", 100);
		map.put("Rusia", 125);
	}

	void showData() {
		Iterator<String> itr = qp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + "  ");
		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " ---> " + m.getValue());
		}
	}
}

public class Array_Collection {

	public static void main(String args[]) {

		// Arrays

		int[] arr = new int[5]; // zeros bby default
		int arr1[] = { 1, 2, 3, 4, 5 };
		String[] arr2 = { "a", "b", "c", "d", "e" };

		int[][] twoD = new int[3][3];

		int N = arr2.length;
		Array obj = new Array();

		/*
		 * obj.PrintArray(arr1);
		 * obj.PrintArray(arr2);
		 * obj.PrintArray(new int[] { 2, 3, 4, 5, 6 });
		 * obj.PrintArray(obj.ArrayReturn());
		 */

		// Collection
		Collection c = new Collection();
		c.showData();
	}

}