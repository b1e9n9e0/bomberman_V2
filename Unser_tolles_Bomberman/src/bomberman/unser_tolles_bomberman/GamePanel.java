package bomberman.unser_tolles_bomberman;

import javax.swing.*;
import java.awt.*;
/**
 * Diese Klasse ist eine Erweiterung von JPanel, welche zunächst auf unsere Anwendung zugeschnitten ist. 
 * Hier werden auch Grafikobjekte zum JPanel hinzugefügt, die von JComponent erben um ihre grafische 
 * Fähigkeiten zu erhalten und welche dann mithilfe der add-Methode zum zeichenoperator des Panels 
 * hinzugefügt werden können. */

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L; //Default Version-ID	
	private Coordinator coord;		// Wird als KeyListener für das Panel benötigt. 
	
	// Koordinaten der Figur
	private int figX;
	private int figY;
	
	/* Erhält über diese Methode die aktuellen Positionswerte der Figur von der Steuerung (Coordination). */
	protected void setFigureCoordinates(int xIn, int yIn) {
		this.figX = xIn;
		this.figY = yIn;
	}
	
	protected void setCoordinator(Coordinator cInit) {
		this.coord = cInit;
	}
	
	public void paintComponent(Graphics g) {
		/* Ruft die paintComponent-Methode der Oberklasse auf, sodass auch sämtliche Objekte, welche
		 * in dieser Methode nicht behandelt werden auch standardmäßig in jedem Durchlauf gezeichnet
		 * werden. */
		super.paintComponent(g);
	}
}
