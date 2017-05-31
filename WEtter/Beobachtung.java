package WEtter;

import java.util.ArrayList;

public class Beobachtung {
	Beobachter beobachter;
	public void setStrategy(Beobachter beobachter){
		this.beobachter=beobachter;
	}
	ArrayList<Beobachter> blist = new ArrayList<Beobachter>();
	//fügt Beobachter hinzu
		public void addBeobachter(Beobachter b){
			blist.add(b);
		}
		//entfernt Beobachter
		public void removeBeobachter(Beobachter b){
			blist.remove(b);
		}
		//Geht die Beobachterliste durch und nutz aktualisieren()
		public void beobachterakutalisieren(MessDaten daten){
			
			for(Beobachter beobachter:blist)
				  beobachter.aktualisieren(daten);
		}
		
	public void aktualisieren(MessDaten daten){
		beobachter.aktualisieren(daten);
		
	}
}
