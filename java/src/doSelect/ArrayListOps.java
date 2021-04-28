package doSelect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListOps {
	public ArrayList<Integer> makeArrayList(int n) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(0);
		}
		System.out.print(al);
		return al;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		Collections.reverse(list);
		System.out.print(list);
		return list;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		Collections.replaceAll(list, m, n);
		return list;
	}

	public static void main(String[] args) {
		ArrayListOps alo = new ArrayListOps();

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		alo.makeArrayList(a);

		ArrayList<Integer> al1 = new ArrayList<>();
		int b = sc.nextInt();
		int[] c = new int[b];
		for (int i = 0; i < b; i++) {
			al1.add(sc.nextInt());
		}
		alo.reverseList(al1);
		int m = sc.nextInt();
		int n = sc.nextInt();
		alo.changeList(al1, m, n);
		System.out.println(al1);

	}

}