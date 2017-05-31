package WEtter;


public class AktuelleBedingungen implements Beobachter{
	@Override
	public void aktualisieren(MessDaten daten) {
		
		System.out.println("aktuell: " 
				+ daten.getTemperatur() + " C " 
				+ daten.getFeuchtigkeit() + "% "
				+ daten.getDruck() + " hPa ");
	}
}
