package bomberman.unser_tolles_bomberman;

public class Logic {
	
	/* DIe Logic muss die Werte von Figur, Bomben und dergleichen 
	 * auch an die Zeichenoperationen des GamePanels übergeben. */
	private GamePanel gPanel;
	
	//Positionswerte der Figur
	private int figX;
	private int figY;
	
	protected void setGamePanel(GamePanel gInit) {
		this.gPanel = gInit;
	}
	
	protected GamePanel getGamePanel(){
		return gPanel;
	}
	
	/* Die Logik erhält über diese Methode die neuen Werte der Figur, um mit dieser die komplette Logik
	 * durchzuführen. */
	protected void setFigureCoordinates(int xIn, int yIn) {
		figX = xIn;
		figY = yIn;
	}
	
	protected void setBomb(){
		
	}
	
	protected void doLogic() {
		
	}
}
