package wiprokushagra.topic2.ass3;

import java.time.LocalDate;

public class YearAndMonth {
public static void main(String[] args) {
	LocalDate l1=LocalDate.of(1996, 7, 24);
	LocalDate l2=LocalDate.now();
	getBtYearnMonth(l1,l2);
}

private static void getBtYearnMonth(LocalDate l1, LocalDate l2) {
	double ms=l1.getYear();
	System.out.println(ms);
}
}
