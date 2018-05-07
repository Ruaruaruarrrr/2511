package listener;

import java.awt.event.ActionEvent ;  
import java.awt.event.ActionListener ;  
import java.awt.event.WindowListener ;  
import java.awt.event.WindowAdapter ;  
import java.awt.event.WindowEvent ;  
import java.awt.event.KeyEvent ;  
import java.awt.event.MouseEvent ;  
import java.awt.event.KeyAdapter ;  
import java.awt.event.KeyListener ;  
import java.awt.event.MouseListener ;  
import javax.swing.JTextArea ;  
import javax.swing.JFrame ;  
import javax.swing.JScrollPane ;  
import javax.swing.JPasswordField ;  
  
class MyMouse extends JFrame implements MouseListener  
{    
        JTextArea text = new JTextArea() ;  
        public MyMouse()  
        {  
            super.setTitle("��꾫��") ;  
            JScrollPane scr = new JScrollPane(text) ;  
            scr.setBounds(5,5,300,200) ;  
            super.add(scr) ;  
            text.addMouseListener(this) ;  
            super.addWindowListener(new WindowAdapter()  
           {  
             public void WindowClosing(WindowEvent e)  
            {  
               System.exit(1) ;  
            }  
           }) ;  
            
           super.setSize(400,300) ;  
           super.setVisible(true) ;     
        }  
         
        public void mouseClicked(MouseEvent e)    //�õ�����ֵ  
       {  
           int c = e.getButton() ;  
           String mouseinfo = null;  
           if(c==MouseEvent.BUTTON1)  
           {  
              mouseinfo = "���\n" ;  
           }  
           if(c==MouseEvent.BUTTON2)  
           {  
              mouseinfo = "����\n" ;  
           }  
           if(c==MouseEvent.BUTTON3)  
           {  
              mouseinfo = "�Ҽ�\n" ;  
           }  
           text.append("�����µ���"+mouseinfo) ;  
       }  
         
        public void mouseEntered(MouseEvent e)   //���������  
        {  
           text.append("���������\n") ;  
        }  
         
        public void mouseExited(MouseEvent e)     //����뿪���  
        {  
            text.append("����뿪���\n") ;  
        }  
         
        public void mousePressed(MouseEvent e)   //��걻����  
        {  
           text.append("��걻����\n") ;  
        }  
         
        public void mouseReleased(MouseEvent e)   //��걻�ſ�  
        {  
           text.append("��걻�ɿ�\n") ;  
        }  
        
     
} ;  
  
class Tester  
{  
   public static void main(String args[])  
   {  
      MyMouse mhk = new MyMouse() ;  
   }  
} ;