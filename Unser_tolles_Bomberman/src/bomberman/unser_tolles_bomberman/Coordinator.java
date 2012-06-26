package bomberman.unser_tolles_bomberman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/** Der Coordinator übernimmt zweierlei Aufgaben, zum einen ist er ein KeyListener (WASD-Steuerung,
 * SPACE für ne Bombe, weitere Tasten natürlich noch denkbar). Zum anderen verfügt die Klasse über 
 * die Methoden checkCollisions und checkMovement. Dabei setzten die Tasten nur Boolsche Werte, welche
 * dann in den obigen beiden genannten Methoden verwendet werden um die Bewegung der Figur zu prüfen. */

public class Coordinator implements KeyListener {
	
	/* Logic- und GamePanel-Objekte müssen vorliegen, sodass beide Klassen immer die aktuellsten 
	 * Positionswerte der Figur haben. */
	private Logic l;
	private GamePanel g;
	
	//Positionsdaten der Figur
	private int figX;
	private int figY;
	
	// Boolsche Werte für Bewegung der Figur
	private boolean figUp;
	private boolean figDown;
	private boolean figRight;
	private boolean figLeft;
	private final int speed = 50; 		// Geschwindigkeit der Figur
		
	/* Boolsche Werte für die Kollisionsabfrage, ist hier eine gesetzt kann die Figur sich nicht mehr
	 * in die entsprechende Richtung bewegen. */
	private boolean CollideLeft;
	private boolean CollideRight;
	private boolean CollideTop;
	private boolean CollideBottom;
	
	protected Coordinator(Logic lInit) {
		this.l = lInit;
		this.g = l.getGamePanel();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		/* Bleibt erstmal leer, da dies eine Funktion höherer Ordnung ist und
		 * die meisten Steuereingaben über KeyPressed und KeyReleased besser 
		 * gestaltet werden können. */
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int id = e.getKeyCode();		//KeyCode des KeyEvents auslesen
		
		// Mittels KeyEvent prüfen, was für eine Taste gedrückt wurde, Wahrheitswert setzen
		switch (id) {
			case (KeyEvent.VK_W):
				if(!CollideTop) {
					figUp = true;
				}
				break;
			case (KeyEvent.VK_A):
				if(!CollideLeft) {
					figLeft = true;
				}
				break;
			case (KeyEvent.VK_S):
				if(!CollideBottom) {
					figDown = true;
				}
				break;
			case (KeyEvent.VK_D):
				if(!CollideRight) {
					figRight = true;
				}
				break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int id = e.getKeyCode();		// KeyCode des KeyEvents auslesen
		
		// Mittels KeyEvent prüfen, was für eine Taste losgelassen wurde, Wahrheitswert setzen
		switch (id) {
			case (KeyEvent.VK_W):
				figUp = false;
				break;
			case (KeyEvent.VK_A):
				figLeft = false;
				break;
			case (KeyEvent.VK_S):
				figDown = false;
				break;
			case (KeyEvent.VK_D):
				figRight = false;
				break;
			case (KeyEvent.VK_SPACE):
				l.setBomb();
				break;
			case (KeyEvent.VK_ENTER):
				break;
			case (KeyEvent.VK_ESCAPE):
				break;
		}
	}
	
	protected void checkCollisions() {
		//TODO: Kollisionsverhütungsregeln entwickeln
	}
	
	/* Diese Methode prüft die Wahrheitswerte und verändert
	 * dementsprechend die Position der Figur. Bei Eingabe gegen-
	 * überliegender Tasten wird nichts unternommen. */
	protected void checkMovement() {
		if(figUp && !figDown) 		figY -= speed;
		if(figDown && !figUp) 		figY += speed;
		if(figRight && !figLeft)	figX += speed;
		if(figLeft && !figRight)	figX -= speed;
		
		l.setFigureCoordinates(figX, figY);
		g.setFigureCoordinates(figX, figY);
	}
}
