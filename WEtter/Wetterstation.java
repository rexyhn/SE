package WEtter;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;


public class Wetterstation {
	Beobachtung beobachtung = new Beobachtung();
	
	//Array von Beobachtern einfügen
	/*
	 * addBeobachter()
	 * removeBeobachter
	 * beobachteraktualisieren()
	 * 
	 * */
	MessDaten daten = new MessDaten();

	AktuelleBedingungen aktuelleBedingungen = new AktuelleBedingungen();
	Tendenz tendenz = new Tendenz();
	Aussichten aussichten = new Aussichten();
	
	// wird aufgerufen, wenn neue Messwerte da sind
	public void messwerteGeaendert(MessDaten daten){
//		aktuelleBedingungen.aktualisieren(daten);
//		tendenz.aktualisieren(daten);
//		aussichten.aktualisieren(daten);
		beobachtung.beobachterakutalisieren(daten);
		
	}
	
	// Simulation der Wetterdaten ...
	public void messungSimulieren(){
		beobachtung.addBeobachter(new Tendenz());
		beobachtung.addBeobachter(new Aussichten());
		beobachtung.addBeobachter(new AktuelleBedingungen());
		Thread thread = new Thread(new Runnable(){
			public void run(){
				while (true){
					daten.messen();
					messwerteGeaendert(daten);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
	}
	
	
	public Wetterstation(){
		messungSimulieren();
	}

	public static void main(String [] arg){
		new Wetterstation();
		
	}
}
