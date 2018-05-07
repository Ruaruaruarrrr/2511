//</pre><pre name="code" class="java">按钮事件监听  
  
import java.awt.BorderLayout;  
import java.awt.Button;  
import java.awt.Frame;  
public class TestButton  
{  
    public static void main(String[] args)  
    {  
        Frame frame = new Frame("Test Button");  
        Button button = new Button("Press Me!");  
        // 增加事件处理器  
        button.addActionListener(new ButtonHandler());  
  
        // 将按钮加入frame  
        frame.add(button, BorderLayout.CENTER);  
  
        frame.pack();  
  
        frame.setVisible(true);  
    }  
  
}