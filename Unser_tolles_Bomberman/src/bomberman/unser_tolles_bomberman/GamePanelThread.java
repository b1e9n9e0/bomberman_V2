package bomberman.unser_tolles_bomberman;

/** 
 * Der Thread erzeugt ein neues GamePanel, in welchem das Spiel samt aller Komponenten angezeigt wird. 
 * In der init-Methode wird dann erstmal alles an Grafikobjekten und nötigen Variablen erzeugt, in der run-
 * Methode wird rekursiv die paintComponent-Methode des Panels und somit aller Grafikobjekte aufgerufen. */

public class GamePanelThread extends Thread {
	
	private GamePanel gpanel;
	
	protected GamePanelThread() {
		gpanel = new GamePanel();
	}
	
	protected GamePanel getGamePanel() {
		return gpanel;
	}
	
	protected void setCoordinator(Coordinator cInit) {		//Übergibt dem Panel einen Coordinator
		gpanel.setCoordinator(cInit);
	}
	
	/* Ruft repaint() auf, welches sämtliche Objekte von gPanel wieder zeichnet, inklusive Hintergrund und
	 * aller angemeldeter Komponenten. Da dies alle 20 Millisekunden geschieht ensteht eine flüssige Animation. */
	public void run() {
		while(true) {
			gpanel.repaint();
			try {
				sleep(20);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
