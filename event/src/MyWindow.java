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
        // ���ϴ��ڼ�������������Ҫʵ�����˳�����  
        frame.addWindowListener(new MyWindowListener());  
  
        // ��һ����ǩ  
        label = new Label("This is my Window");  
        frame.add(label, BorderLayout.NORTH);  
  
        // ��һ����ť  
        button = new Button("MyButton");  
        frame.add(button, BorderLayout.WEST);  
  
        // ���ð�ť�¼�����������ť����ʱ�������̨�����Ϣ  
        button.addActionListener(new MyButtonListener());  
  
        // ��һ���ı��༭��  
        textField = new TextField(40);  
        frame.add(textField, BorderLayout.SOUTH);  
  
        // ������궯��������,��Ϊ�౾��ʵ�����������ӿڣ����Բ�����this  
        frame.addMouseListener(this);  
        frame.addMouseMotionListener(this);  
        // ������Ӷ�������������Ի����Զ��������ģ���MyMouseListener�࣬Ȼ�����  
  
        // ���øպ���������Щ�ؼ��ĳߴ�  
        frame.pack();  
        // ����Ϊ�ɼ�  
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
  

  
 