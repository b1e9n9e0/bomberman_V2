package bomberman.unser_tolles_bomberman;

public class Game {

	/**
	 * @author Aiko
	 * 
	 * Die Klasse erzeugt drei Threads: 
	 * 1. LogicThread, hier wird die gesamte Logik des Spiels ausgeführt, z.B. Bomben legen, welche Steine 
	 * zerstört wurden, ob die Tür offen ist, bzw. diese schon erreicht wurde, etc.
	 * 
	 * 2. GamePanelThread, in diesem wird ein GamePanel erzeugt, in welchem das Spiel angezeigt wird. Das
	 * GamePanel erzeugt auch alle Objekte, welche dann im Spiel auftauchen, idealerweise wird die 
	 * Initialierung aller größeren Objekte natürlich vorm Spielstart durchgeführt, um nicht zur Laufzeit 
	 * das System zu belasten. 
	 * 
	 * 3. CoordinationThread, dieser erzeugt einen Coordinator, welcher auch Listener für die Eingabe auf
	 * der Tastatur ist. Hier wird die Bewegung der Figur, als auch die Kollisionsabfrage mit allen Randelementen
	 * durchgeführt. 
	 * 
	 * 
	 * */
	
	public Game() {
		LogicThread lThread = new LogicThread();
		GamePanelThread gpThread = new GamePanelThread();

		lThread.setLogicsGamePanel(gpThread.getGamePanel()); 	//GamePanel der Logic übergeben
		
		CoordinationThread coord = new CoordinationThread(lThread);
		gpThread.setCoordinator(coord.getCoordinator());
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
