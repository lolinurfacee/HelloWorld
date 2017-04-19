import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel {

	private Color myColor;	
	private double scaling = 1.0;
	private int width=300;
	private int height=300;
	
	public DrawPanel() {
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);
	}

	public void setColor(Color c) {
		myColor = c;
	}

	public void setScaling(int scale) {
		scaling = 1.0 + ((double) scale) / 100;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(myColor);
		g.fillRect(width/2-90, height/2-90, 180, 180);
	}
}
