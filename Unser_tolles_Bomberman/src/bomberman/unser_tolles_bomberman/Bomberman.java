package bomberman.unser_tolles_bomberman;

public class Bomberman {

	/**
	 * @author Aiko
	 *  
	 * */
	
	public Bomberman() {
		LogicThread lThread = new LogicThread();
		GamePanelThread gpThread = new GamePanelThread();
		new CoordinationThread(lThread);
		
		//GamePanel der Logic übergeben
		lThread.setLogicsGamePanel(gpThread.getGamePanel()); 
		
	}
	
	public static void main(String[] args) {
		new Bomberman();
	}

}
