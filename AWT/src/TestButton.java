//</pre><pre name="code" class="java">��ť�¼�����  
  
import java.awt.BorderLayout;  
import java.awt.Button;  
import java.awt.Frame;  
public class TestButton  
{  
    public static void main(String[] args)  
    {  
        Frame frame = new Frame("Test Button");  
        Button button = new Button("Press Me!");  
        // �����¼�������  
        button.addActionListener(new ButtonHandler());  
  
        // ����ť����frame  
        frame.add(button, BorderLayout.CENTER);  
  
        frame.pack();  
  
        frame.setVisible(true);  
    }  
  
}