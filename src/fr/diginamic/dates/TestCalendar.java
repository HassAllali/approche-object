package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {
        
        
        Calendar cal1 = new GregorianCalendar(2016, 4, 19, 23, 59, 30);
        Date date1 = cal1.getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate1 = sdf1.format(date1);
        System.out.println(formattedDate1);
        
      
        Calendar cal2 = Calendar.getInstance();
        Date date2 = cal2.getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedDate2 = sdf2.format(date2);
        System.out.println(formattedDate2);
        
       
        SimpleDateFormat sdfFrançais = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRENCH);
        SimpleDateFormat sdfRusse = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
        SimpleDateFormat sdfChinois = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
        SimpleDateFormat sdfAllemand = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
        SimpleDateFormat sdfJaponais = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss", Locale.JAPANESE);  //J'aime bien le Japonais
		
		
        
        
        
        String formattedDateFrançais = sdfFrançais.format(date2);
        String formattedDateRusse = sdfRusse.format(date2);
        String formattedDateChinois = sdfChinois.format(date2);
        String formattedDateAllemand = sdfAllemand.format(date2);
        String formattedDateJaponais = sdfJaponais.format(date2);
        
        System.out.println("Date en Français : " + formattedDateFrançais);
        System.out.println("Date en Russe : " + formattedDateRusse);
        System.out.println("Date en Chinois : " + formattedDateChinois);
        System.out.println("Date en Allemand : " + formattedDateAllemand);
        System.out.println("Date en Japonais : " + formattedDateJaponais);
        
    }

}
