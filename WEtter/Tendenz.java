package WEtter;


public class Tendenz implements Beobachter{
	int lastTemp;
	int lastFeucht;
	int lastDruck;
	@Override
	public void aktualisieren(MessDaten daten) {
		int temp = daten.getTemperatur();
		int feucht = daten.getFeuchtigkeit();
		int druck = daten.getDruck();
		
		System.out.print("Tendenz: ");

		if (temp >= lastTemp){
			System.out.print("Temp + ");
		}
		else {
			System.out.print("Temp - ");
		}
		
		if (feucht >= lastFeucht){
			System.out.print("Feucht + ");
		}
		else {
			System.out.print("Feucht - ");
		}
		
		if (druck >= lastDruck){
			System.out.println("Druck + ");
		}
		else {
			System.out.println("Druck - ");
		}
		
		lastTemp = temp;
		lastFeucht = feucht;
		lastDruck = druck;
	}
}
