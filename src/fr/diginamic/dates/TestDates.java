package fr.diginamic.dates;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class TestDates {

	public static void main(String[] args) {
		Date dateDuJour = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dateDuJourFormattee = sdf.format(dateDuJour);
		System.out.println(dateDuJourFormattee);

		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, Calendar.MAY);
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 30);
		Date date19Mai2016 = cal.getTime();

		
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date19Mai2016Formattee = sdf.format(date19Mai2016);
		System.out.println(date19Mai2016Formattee);

		
		Date dateHeureSystème = new Date();
		String dateHeureSystèmeFormattee = sdf.format(dateHeureSystème);
		System.out.println(dateHeureSystèmeFormattee);
		
		


	}

}
