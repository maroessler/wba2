package com.w3schools;
import java.io.*;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.*;

import com.w3schools.Chefkoch.Rezept.Zubereitung;
import com.w3schools.Chefkoch.Rezept.Zutatenliste.Zutat;

public class Main {

	private static JAXBContext jc;
	static File xmlfile = new File("Aufgabe3.xml");
	
	
	private static void ausgabe() throws Exception{
		
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		
		Chefkoch ck = (Chefkoch) unmarshaller.unmarshal(xmlfile);

	    for(int i = 0; i<ck.getRezept().size();i++){
	    	System.out.println("\nRezeptnummer: "+ck.getRezept().get(i).id);
	    	System.out.println(ck.getRezept().get(i).info.getUeberschrift());
	    	System.out.println(ck.getRezept().get(i).info.getBild());
	    	System.out.println("\n----Zutaten----\n");
	    	for(int j = 0;j<ck.getRezept().get(i).getZutatenliste().getZutat().size();j++){
	    		List<Zutat> zutaten = ck.getRezept().get(i).getZutatenliste().getZutat();
	    		System.out.println(zutaten.get(j).getBezeichnung()+": "+zutaten.get(j).getMenge()+" "+zutaten.get(j).getEinheit());
	    	}
	    	System.out.println("\n----Zubereitung----\n");
	    	Zubereitung zb = ck.getRezept().get(i).getZubereitung();
	    	System.out.println("Zubereitung: "+zb.getAnleitung());
	    	System.out.println("Schwierigkeitsgrad: "+ zb.getSchwierigkeitsgrad());
	    	System.out.println("Brennwert: "+zb.getBrennwert());
	    	System.out.println("Arbeitszeit: "+zb.getArbeitszeit());
	    	System.out.println("\n Kommentare:");
	    	for(int k=0;k<ck.getRezept().get(i).getKommentare().getNachricht().size();k++){
	    		System.out.println(ck.getRezept().get(0).getKommentare().getNachricht().get(k));
	    	}
	    }
	}
	private static void eintragen(int rezeptnr,String nachricht) throws Exception{
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		
		Chefkoch ck = (Chefkoch) unmarshaller.unmarshal(xmlfile);
		
		ck.getRezept().get(rezeptnr).getKommentare().getNachricht().add(nachricht);
		marshaller.marshal(ck, xmlfile);
	}
	
	public static void main(String[] args) throws Exception {
		jc = JAXBContext.newInstance(Chefkoch.class);
		
		Scanner in = new Scanner(System.in);
		Scanner in_string = new Scanner(System.in);
		int eingabe = 1;
		
		while (eingabe != 0) {
			System.out.println("\nWas wollen Sie machen?:\n 1 für eintragen\n 2 für ausgeben\n 0 für exit");
			eingabe = in.nextInt();
			if (eingabe == 1) {
				System.out.println("In welches Rezept soll die Nachricht eingetragen werden?\n RezeptID: ");
				int rezept = in.nextInt();
				System.out.println("Kommentar eingeben:");
				String nachricht = in_string.nextLine();
				eintragen(rezept-1,nachricht);
			} else if (eingabe == 2) {
				ausgabe();
			} else {
				eingabe = 0;
			}
		}		
	}

}
