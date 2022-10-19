package fr.diginamic.dates;

import java.util.Date;
import java.text.SimpleDateFormat;


public class TestDates {

	public static void main(String[] args) {
		// Creation de l'instance avec la classe java.util.date à la date du jour
		Date dateHeure = new Date();
		System.out.println(dateHeure);

		// Formatage pour faire apparaitre la date sous le format classique
		SimpleDateFormat formatSansHeure = new SimpleDateFormat("dd/MM/yyyy"); // application du format
		String dateformateeSansHeure = formatSansHeure.format(dateHeure); // transformation en string

		System.out.println(dateformateeSansHeure);
		
		System.out.println("-----------");
		Date dateMai2016 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formatavecHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateP2 = formatavecHeure.format(dateMai2016);
		System.out.println(dateP2);
	}
}
