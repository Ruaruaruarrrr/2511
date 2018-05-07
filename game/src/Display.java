import java.awt.*;
import javax.swing.JFrame;


public class Display {
	private JFrame frame;
	private Canvas canvas;
	
	
	private String title;
	private int width, height;// in pixel
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height =height;
		
		createDisplay();
	}
	
	private void createDisplay(){
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the window ->close the program
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);// in the center of the screen
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack();
	}
	public Canvas getCanvas() {
		return canvas;
	}
	
}