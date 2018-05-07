import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable{
	
	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//testcode her
	private BufferedImage testImage;
	
	
	public Game(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		
		
	}
	public void init() {
		
		display = new Display(title,width, height);
		testImage = ImageLoader.loadImage("/textures/ubuntu-logo32.png");
	}
	
	private void tick() {
		
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		//Clear the screen
		
		g.clearRect(0, 0, width, height);
		//Draw Here!
		
		g.setColor(Color.black);
		g.fillRect(10,10,width/3,height/3);
		g.setColor(Color.green );
		g.fillRect(width/3 +10,width/3+10,width/3,height/3);
		g.drawImage(testImage,220,20,null);
		
		
		//End Drawing!
		
		bs.show();
		g.dispose();
	}
	
	/**
	 * while loop of the game
	 */
	public void run() {
		
		init();
		while(running) {
			tick();
			render();
			
		}
		stop();
	}
	public synchronized void start() {
		if (running == true) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(running == false) return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}