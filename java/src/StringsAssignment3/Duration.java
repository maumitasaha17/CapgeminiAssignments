package StringsAssignment3;

import java.time.*;
import java.util.*;

public class Duration {

	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2021, 01, 01);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

			System.out.printf("Difference = %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());

	}

}
