package bomberman.unser_tolles_bomberman;

public class CoordinationThread extends Thread {
	
	private Coordinater coord;
	
	protected CoordinationThread(LogicThread lInit) {
		coord.setLogic(lInit.getLogic());
	}
	
	public void run() {
	}
}
