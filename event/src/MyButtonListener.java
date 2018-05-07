import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

class MyButtonListener implements ActionListener  
{  
  
    @SuppressWarnings("deprecation")  
    @Override  
    public void actionPerformed(ActionEvent e)  
    {  
        // 输出信息  
        System.out.println("The Button is pressed!");  
  
        // 输出时间戳  
        Long time = e.getWhen();  
        System.out.println("timestamp: " + time);  
  
        // 日期时间  
        Date date = new Date(time);  
        System.out.println(date.toLocaleString());  
  
    }  
  
}  