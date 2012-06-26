package bomberman.unser_tolles_bomberman;

/** 
 * Erzeugt ein neues Objekt der Logic, diese muss mit dem GamePanel sprechen, deshalb die GamePanel-setter
 * Methode. Im init wird dann alles initialisiert, was fürs Spiel im benötigt wird, in der run wird
 * ständig die doLogic-Methode des Logic-Objektes aufgerufen. */

public class LogicThread extends Thread {
	
	private Logic l;
	
	protected LogicThread() {
		l = new Logic();
	}
	
	protected void setLogicsGamePanel(GamePanel gInit) {	//Setze GamePanel der Logic
		l.setGamePanel(gInit);
	}
	
	protected Logic getLogic() {		//Logic-getter
		return l;
	}
	
	/* Hier wird die doLogic alle 20ms durchgeführt, dies ist zwar nicht synchron mit der Anzeige, reicht aber 
	 * dennoch um eine ordentliche Logiküberprüfung des Spiels durchzuführen. Auch dieser Thread ruht für 20ms. */
	public void run(){
		while(true) {
			l.doLogic();
			
			try{ 
				sleep(20);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
