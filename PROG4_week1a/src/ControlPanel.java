import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.*;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel {
	private DrawPanel drawPanel;


	public ControlPanel(DrawPanel drawPanel) {
		this.drawPanel=drawPanel;// Implement your own constructor.
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		String red;
		String blue;
		String yellow;
		JRadioButton rb_yellow;
		JRadioButton rb_blue;
		JRadioButton rb_red;
		
		red="Red";
		blue="Blue";
		yellow="Yellow";
		rb_yellow = new JRadioButton(yellow);
		rb_red = new JRadioButton(red);
		rb_blue = new JRadioButton(blue);
		this.add(rb_yellow);
		this.add(rb_red);
		this.add(rb_blue);
		rb_yellow.setSelected(true);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rb_blue);
		buttonGroup.add(rb_red);
		buttonGroup.add(rb_yellow);
		
		rb_blue.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("blue");
				setDrawPanelColor(Color.blue);
			}
		});
		rb_red.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("red");
				setDrawPanelColor(Color.red);
			}
		});
		rb_yellow.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("yellow");
				setDrawPanelColor(Color.yellow);
			
			}
		});
			
		
		
		JSlider slider = new JSlider(JSlider.VERTICAL);
		slider.setMaximum(50);
		slider.setMinimum(-50);
		slider.setValue(0);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		this.add(slider);
	}

	private void setDrawPanelColor(Color color) {
		drawPanel.setColor(color);
		drawPanel.repaint();
	}

	private void setDrawPanelScaling(int size) {
		drawPanel.setScaling(size);
		drawPanel.repaint();
	}
}
