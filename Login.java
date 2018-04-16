package com.mcq1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
 JPanel jp;  
 JLabel lblid , lblpass;
 JTextField txtid;
 JPasswordField txtpass;
 JButton buttonok , buttoncancel;
 String id , pass;
 Login()   
 {
  //System.out.println("hello");
  jp = new JPanel(); 
  jp.setBounds(0,0,400,300);
  jp.setLayout(null);   
  
  lblid = new JLabel("Enter Username : ");    
  lblid.setForeground(Color.red);
  lblid.setBounds(20,30,250,70);
  Font f = new Font("Lucida Handwriting",Font.BOLD,14);
  lblid.setFont(f);
  jp.add(lblid);
  
  lblpass = new JLabel("Enter Password : ");
  lblpass.setForeground(Color.red);
  lblpass.setBounds(20,90,250,70);
  f = new Font("Lucida Handwriting",Font.BOLD,14);
  lblpass.setFont(f);
  jp.add(lblpass);

  txtid = new JTextField(50);
  txtid.setBounds(180,50,160,30);
  jp.add(txtid);
  
  txtpass = new JPasswordField();
  txtpass.setBounds(180,110,160,30);
  txtpass.setEchoChar('*');
  jp.add(txtpass);

  buttonok = new JButton("OK");
  buttonok.setBounds(110,170,70,30);
  buttonok.addActionListener(this);
  jp.add(buttonok);
  
  buttoncancel = new JButton("CANCEL");
  buttoncancel.setBounds(200,170,100,30);
  buttoncancel.addActionListener(this);
  jp.add(buttoncancel);

  setLayout(null);
  add(jp);   
  setSize(400,300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  setTitle("LOGIN PANEL");  
  setVisible(true);
  this.setResizable(false);  
  this.setLocationRelativeTo(null);  
  
 }

    public void actionPerformed(ActionEvent e) {
            id = txtid.getText();
            pass = txtpass.getText();
        if(e.getSource()==buttonok)
        {
           
           if(id.equals("hello")&&pass.equals("56789"))//id pass change v2
            {
           
        
                
                    Subject s = new Subject();  
                
            }
            else
            {
             JOptionPane.showMessageDialog(null,"INCORRECT CREDENTIALS"); 
             txtid.setText(null);
             txtpass.setText(null);
            }
            
        }
       
         if(e.getSource()==buttoncancel)
            {
             int result = JOptionPane.showConfirmDialog(this,"ARE YOU SURE YOU WANT TO CLOSE THE APPLICATION","PLEASE CONFIRM",JOptionPane.YES_NO_OPTION);
             if(result==JOptionPane.YES_OPTION)
             {
                 this.dispose();
             }
             else
             {
                 txtid.setText(null);
                 txtpass.setText(null);
             }
            }
        
    }
    
   
}
