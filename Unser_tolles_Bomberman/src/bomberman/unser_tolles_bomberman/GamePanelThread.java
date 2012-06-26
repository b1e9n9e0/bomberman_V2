package bomberman.unser_tolles_bomberman;

public class GamePanelThread extends Thread {
	
	private GamePanel gpanel;
	
	protected GamePanelThread() {
		gpanel = new GamePanel();
	}
	
	protected GamePanel getGamePanel() {
		return gpanel;
	}
	
	public void run() {
		
	}
}
