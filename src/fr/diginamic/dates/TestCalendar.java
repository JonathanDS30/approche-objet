package fr.diginamic.dates;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		SimpleDateFormat formatClassique = new SimpleDateFormat("dd/MM/yyyy");

		Date date = cal.getTime();
		String DateFormatClassique = formatClassique.format(date);
		System.out.println(DateFormatClassique);

		System.out.println("---------");

		
		// Date du jour avec l'heure 
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		SimpleDateFormat formatYMDhms = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date2FormatYMDhms = formatYMDhms.format(date2);
		System.out.println(date2FormatYMDhms);
		
		// Date format Français
		SimpleDateFormat formatFr = new SimpleDateFormat("EEEE MMMM", Locale.FRANCE);
		String date2formatFR = formatFr.format(date2);
		System.out.println(date2formatFR);
		
		// Date format Chinois
		SimpleDateFormat formatCh = new SimpleDateFormat("EEEE MMMM", Locale.CHINESE);
		String date2FormatCh = formatCh.format(date2);
		System.out.println(date2FormatCh);
		
		// Date format Allemand
		SimpleDateFormat formatALL = new SimpleDateFormat("EEEE MMMM", Locale.GERMAN);
		String date2FormatALL = formatALL.format(date2);
		System.out.println(date2FormatALL);
		
		// Date format Russe
		SimpleDateFormat formatRUS = new SimpleDateFormat("EEEE MMMM", new Locale("ru", "RU"));
		String date2FormatRUS = formatRUS.format(date2);
		System.out.println(date2FormatRUS);
	}

}
