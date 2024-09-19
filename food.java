package hotelmanagemmentsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class food extends JFrame implements ActionListener{
    
    JTextField hotelname,foodname,foodmfg,foodexp,fooddelivery;
    JButton submit;
    JComboBox foodtype;
       
   food(){
       
       getContentPane().setBackground(Color.WHITE);
       
       setBounds(0,0,1550,1000);
       setLayout(null);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/hotel.jpg"));
        Image i2=i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0,0,1550,1000);
        add(image);
        
       JLabel text=new JLabel("LEFTOVER FOOD MANAGEMENT");
       text.setBounds(370,220,1000,100);
       text.setFont(new Font("serif",Font.PLAIN,40));
       image.add(text);
       
       
        JLabel name=new JLabel("Hotel Name");
        name.setBounds(500,310,1000,30);
        name.setFont(new Font("serif",Font.PLAIN,20));
        image.add(name);
        
        hotelname=new JTextField();
        hotelname.setBounds(660,310,150,30);
        add(hotelname);
        
        JLabel type=new JLabel("Food Type");
        type.setBounds(500,350,1000,30);
        type.setFont(new Font("serif",Font.PLAIN,20));
        image.add(type);
        
       String availabletypes[]={"Veg","NonVeg"};
       foodtype=new JComboBox(availabletypes);
       foodtype.setBounds(660,350,150,30);
       foodtype.setBackground(Color.WHITE);
       image.add(foodtype);  
  
        JLabel item=new JLabel("Food Name");
        item.setBounds(500,390,1000,30);
        item.setFont(new Font("serif",Font.PLAIN,20));
        image.add(item);
        
        foodname=new JTextField();
        foodname.setBounds(660,390,150,30);
        add(foodname);
        
        JLabel mfg=new JLabel("MFG date");
        mfg.setBounds(500,430,1000,30);
        mfg.setFont(new Font("serif",Font.PLAIN,20));
        image.add(mfg);
        
        //Date date=new Date();
        foodmfg=new JTextField();
        foodmfg.setBounds(660,430,150,30);
        add(foodmfg);
        
        JLabel exp=new JLabel("Expiry date");
        exp.setBounds(500,470,1000,30);
        exp.setFont(new Font("serif",Font.PLAIN,20));
        image.add(exp);
        
        //Date expdate=new Date();
        foodexp=new JTextField();
        foodexp.setBounds(660,470,150,30);
        add(foodexp);
        
        JLabel delivery=new JLabel("Delivery Location");
        delivery.setBounds(500,510,1000,30);
        delivery.setFont(new Font("serif",Font.PLAIN,20));
        image.add(delivery);
      
        fooddelivery=new JTextField();
        fooddelivery.setBounds(660,510,150,30);
        add(fooddelivery);
        
          submit=new JButton("Submit");
          submit.setBounds(600, 550, 120, 30);
          submit.setBackground(Color.BLACK);
          submit.setForeground(Color.WHITE);
          submit.addActionListener(this);
          image.add(submit);
        
        
       setVisible(true);

   } 
   @Override
   public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==submit){
       String name=hotelname.getText();
       String type=(String)foodtype.getSelectedItem();
       String item=foodname.getText();
       String mfg=foodmfg.getText();
       String exp=foodexp.getText();
       String delivery=fooddelivery.getText();
       
       try{
            conn co=new conn();
            String query = "INSERT INTO hotel values( '"+name+"', '"+type+"', '"+item+"','"+mfg+"', '"+exp+"', '"+delivery+"')";
            co.s.executeUpdate(query);  
            JOptionPane.showMessageDialog(null,"Added successfully");
            setVisible(false);
            
       }catch(Exception e){
           e.printStackTrace();
       }
      }
   }
   public static void main(String[] args){
       new food();
   }
}
