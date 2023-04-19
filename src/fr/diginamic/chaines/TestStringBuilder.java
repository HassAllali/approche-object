package fr.diginamic.chaines;
import java.util.concurrent.TimeUnit;
import java.lang.System;


public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();

		for(int i = 1; i <= 100000; i++) {
		    builder.append(i);
		}

		long startTime = System.nanoTime();

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;
		System.out.println("Temps écoulé en millisecondes : " + TimeUnit.MILLISECONDS.convert(timeElapsed, TimeUnit.NANOSECONDS));

		String chaine = "";

		for(int i = 1; i <= 100000; i++) {
		    chaine += i;
		}


	}

}
