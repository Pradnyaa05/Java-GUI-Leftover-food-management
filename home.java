package hotelmanagemmentsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagemmentSystem extends JFrame implements ActionListener{

   HotelManagemmentSystem (){
       setSize(1366,768);
//       setLocation(100,100);
//setBounds(100,100,1366,565);
       setLayout(null);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/food.jpg"));
       JLabel image=new JLabel(i1);
       image.setBounds(0,0,1366,768);
       add(image);
       JLabel text=new JLabel("LEFTOVER FOOD MANAGEMENT");
       text.setBounds(30,140,1000,100);
       text.setFont(new Font("serif",Font.PLAIN,50));
       image.add(text);
       
       JButton next=new JButton("NEXT");
       next.setBounds(120,250,150,50);
       next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN,20));
       image.add(next);
       setVisible(true);
       
       while(true){
           text.setVisible(false);
           try{
               Thread.sleep(1000);
           }
           catch(Exception e){
               e.printStackTrace();
           }
           text.setVisible(true);
           try{
               Thread.sleep(1000);
           }
           catch(Exception e){
               e.printStackTrace();
           }
       }
       
   }
   public void actionPerformed(ActionEvent ae){
       setVisible(false);
       new Login();
       
   }
    public static void main(String[] args) {
        new HotelManagemmentSystem ();
    }
    
}
