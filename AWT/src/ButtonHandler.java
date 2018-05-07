import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonHandler implements ActionListener  
{  
  
    @Override  
    public void actionPerformed(ActionEvent e)  
    {  
        //事件处理器  
  
        System.out.println("Button is pressed!");  
          
        String label = e.getActionCommand();  
        System.out.println(label);  
    }  
}  