package bomberman.unser_tolles_bomberman;

/**Die Klasse erstellt einen neuen Coordinator (Steuereinheit) und übergibt diesem die Logic 
 * welche vorher in Game von LogicThread erzeugt wurde, da dieser die Positionen von Figur und Bomben 
 * haben muss. In der run-Methode werden bis Dato nur die Bewegungen überprüft. */

public class CoordinationThread extends Thread {
	
	private Coordinator coord;
	
	protected CoordinationThread(LogicThread lInit) {
		coord = new Coordinator(lInit.getLogic());
	}
	
	protected Coordinator getCoordinator() {	
		return coord;
	}
	
	/* In der run() werden alle Kollisionen mit Steinen und sämtliche Bewegungen geprüft, eine Bewegung
	 * erfolgt nur wenn die zugehörigen Booleschen Werte richtig gesetzt sind. */
	public void run() {
		while(true) {
			coord.checkCollisions();
			coord.checkMovement();
			
			try{
				sleep(20);
			} catch(InterruptedException e){
				
			}
		}
	}
}
