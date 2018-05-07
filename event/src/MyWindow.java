import java.awt.BorderLayout;  
import java.awt.Button;  
import java.awt.Frame;  
import java.awt.Label;  
import java.awt.TextField;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
import java.awt.event.MouseMotionListener;  
  
public class MyWindow implements MouseListener, MouseMotionListener  
{  
    private Frame frame;  
    private Label label;  
    private Button button;  
    private TextField textField;  
  
    public void go()  
    {  
        frame = new Frame("My Frame");  
        // 加上窗口监听器，其中主要实现了退出功能  
        frame.addWindowListener(new MyWindowListener());  
  
        // 加一个标签  
        label = new Label("This is my Window");  
        frame.add(label, BorderLayout.NORTH);  
  
        // 加一个按钮  
        button = new Button("MyButton");  
        frame.add(button, BorderLayout.WEST);  
  
        // 设置按钮事件监听器，按钮按下时会向控制台输出信息  
        button.addActionListener(new MyButtonListener());  
  
        // 加一个文本编辑框  
        textField = new TextField(40);  
        frame.add(textField, BorderLayout.SOUTH);  
  
        // 加上鼠标动作监听器,因为类本身实现了这两个接口，所以参数是this  
        frame.addMouseListener(this);  
        frame.addMouseMotionListener(this);  
        // 可以添加多个监听器，所以还可以定义其他的，如MyMouseListener类，然后加上  
  
        // 设置刚好能容纳这些控件的尺寸  
        frame.pack();  
        // 设置为可见  
        frame.setVisible(true);  
    }  
  
    public static void main(String[] args)  
    {  
        MyWindow window = new MyWindow();  
  
        window.go();  
    }  
  
    @Override  
    public void mouseDragged(MouseEvent e)  
    {  
  
    }  
  
    @Override  
    public void mouseMoved(MouseEvent e)  
    {  
        String str = "x = " + e.getX() + ", y = " + e.getY();  
        this.textField.setText(str);  
        System.out.println(str);  
    }  
  
    @Override  
    public void mouseClicked(MouseEvent e)  
    {  
  
    }  
  
    @Override  
    public void mouseEntered(MouseEvent e)  
    {  
  
    }  
  
    @Override  
    public void mouseExited(MouseEvent e)  
    {  
        this.textField.setText("the mouse has exited.");  
    }  
  
    @Override  
    public void mousePressed(MouseEvent e)  
    {  
  
    }  
  
    @Override  
    public void mouseReleased(MouseEvent e)  
    {  
  
    }  
  
}  
  

  
 