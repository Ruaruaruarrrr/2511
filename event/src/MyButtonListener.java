import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

class MyButtonListener implements ActionListener  
{  
  
    @SuppressWarnings("deprecation")  
    @Override  
    public void actionPerformed(ActionEvent e)  
    {  
        // �����Ϣ  
        System.out.println("The Button is pressed!");  
  
        // ���ʱ���  
        Long time = e.getWhen();  
        System.out.println("timestamp: " + time);  
  
        // ����ʱ��  
        Date date = new Date(time);  
        System.out.println(date.toLocaleString());  
  
    }  
  
}  