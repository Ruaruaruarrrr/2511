import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonHandler implements ActionListener  
{  
  
    @Override  
    public void actionPerformed(ActionEvent e)  
    {  
        //�¼�������  
  
        System.out.println("Button is pressed!");  
          
        String label = e.getActionCommand();  
        System.out.println(label);  
    }  
}  