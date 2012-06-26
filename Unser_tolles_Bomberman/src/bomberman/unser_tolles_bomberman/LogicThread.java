package bomberman.unser_tolles_bomberman;

public class LogicThread extends Thread {
	
	private Logic l;
	
	protected LogicThread() {
		l = new Logic();
	}
	
	protected void setLogicsGamePanel(GamePanel gInit) {
		l.setGamePanel(gInit);
	}
	
	protected Logic getLogic() {
		return l;
	}
	
	public void run(){
		
	}
}
