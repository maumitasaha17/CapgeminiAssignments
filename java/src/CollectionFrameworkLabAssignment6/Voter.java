package CollectionFrameworkLabAssignment6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Voter {

	public static ArrayList<String> isEligible(HashMap<String, LocalDate> hm) {
		// TODO Auto-generated method stub
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		ArrayList<String> al = new ArrayList();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();

			LocalDate myObj = LocalDate.now();
			Period intervalPeriod = Period.between((LocalDate) me.getValue(), myObj);
			if (intervalPeriod.getYears() > 18) {
				al.add((String) me.getKey());
			}
		}
		return al;
	}

	public static void main(String ar[]) {

		HashMap<String, LocalDate> hm = new HashMap<String, LocalDate>();
		hm.put("satyam", LocalDate.of(1999, 02, 04));
		hm.put("ramesh", LocalDate.of(2001, 02, 04));
		ArrayList<String> hm1 = isEligible(hm);

		// print the sorted hashmap
		for (String elem : hm1) {
			System.out.println(elem + "  ");
		}
	}
}