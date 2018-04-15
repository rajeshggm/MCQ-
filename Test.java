
package com.mcq1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Test extends JFrame implements ActionListener{

    
   JLabel l1 , l2 , l3 , l4 , l5;
   JPanel currentPanel;
   JButton b1;
   JRadioButton r1 , r2 , r3 , r4;
   ButtonGroup bg;
   Container c;
   int score=0;
   int currentValue = 0;
   Vector<QuestionSet> localDataVariable;
  

   public JPanel ShowResult(int question,int score){
       JPanel jp;
       jp = new JPanel();
       jp.setBounds(0,0,900,900);
   
       jp.setLayout(null);
       String congo ="CONGRATULATIONS !!";
       
       l1 = new JLabel(congo);
       l1.setBounds(190,150,750,120);
       l1.setForeground(java.awt.Color.blue);
       Font f = new Font("Segoe Script",Font.BOLD,40);

       l1.setFont(f);
       jp.add(l1);  
       
       String textValue="TOTAL QUESTIONS : ";
       String scoreValue="\n"+"\nMARKS SCORED : ";
       
       l2 = new JLabel(textValue);
       l2.setBounds(120,350,420,120);
       l2.setForeground(java.awt.Color.black);
       f = new Font("Segoe Script",Font.BOLD,30);
       l2.setFont(f);
       jp.add(l2);  
       
       l3 = new JLabel(scoreValue);
       l3.setBounds(120,500,420,120);
       l3.setForeground(java.awt.Color.black);
       f = new Font("Segoe Script",Font.BOLD,30);
       l3.setFont(f);
       jp.add(l3);
       
       l4 = new JLabel(" "+question);
      
       l4.setBounds(500,350,100,120);
       l4.setForeground(java.awt.Color.red);
       f = new Font("Segoe Script",Font.BOLD,30);
       l4.setFont(f);
       jp.add(l4);  
       
       l5 = new JLabel(" "+score);
       
       l5.setBounds(500,500,100,120);
       l5.setForeground(java.awt.Color.red);
       f = new Font("Segoe Script",Font.BOLD,30);
       l5.setFont(f);
       jp.add(l5);  
       
       return jp;
       
   }
   
   public JPanel GeneratePanel(QuestionSet s){
    
       JPanel jp;
       jp = new JPanel();
       jp.setBounds(0,0,900,600);
      
       jp.setLayout(null);
    
       l1 = new JLabel(s.quest);
       l1.setBounds(50,125,750,140);
       l1.setForeground(java.awt.Color.red);
       Font f = new Font("Segoe Script",Font.BOLD,30);
       l1.setFont(f);
       jp.add(l1);  
       
        
       r1 = new JRadioButton(s.a);
       r1.setBounds(50,260,450,70);
     
       r1.setForeground(java.awt.Color.magenta);
       f = new Font("Segoe Script",Font.BOLD,22);
       r1.setFont(f);
       
       r2 = new JRadioButton(s.b);
       r2.setBounds(50,350,450,70);
  
      r2.setForeground(java.awt.Color.blue);
       f = new Font("Segoe Script",Font.BOLD,22);
       r2.setFont(f);
       
       
       r3 = new JRadioButton(s.c);
       r3.setBounds(50,450,450,70);
    
      r3.setForeground(java.awt.Color.orange);
       f = new Font("Segoe Script",Font.BOLD,22);
       r3.setFont(f);
       
        r4 = new JRadioButton(s.d);
       r4.setBounds(50,550,450,70);
  
     r4.setForeground(java.awt.Color.green);
       f = new Font("Segoe Script",Font.BOLD,22);
       r4.setFont(f);
       
       bg = new ButtonGroup();
       bg.add(r1);
       bg.add(r2);
       bg.add(r3);
       bg.add(r4);
       
       jp.add(r1);
       jp.add(r2);
       jp.add(r3);
       jp.add(r4);
   
       
       r1.addActionListener(this);
       r2.addActionListener(this);
       r3.addActionListener(this);
       r4.addActionListener(this);
     
       return jp;
   }

      public JPanel GenerateButton(){

          
       JPanel jp;
       jp = new JPanel();
       jp.setBounds(0,0,900,900);
      
       jp.setLayout(null);
    

  b1 = new JButton("NEXT > >");
       b1.setBounds(350,650,180,90);
  Font f = new Font("Segoe Script",Font.BOLD,28);
  b1.setFont(f);
      
       jp.add(b1);
        b1.addActionListener(this);
     

       return jp;
   }

      
Test(Vector<QuestionSet> a)
   {
       localDataVariable = a;
       setLayout(null);
       currentPanel = GeneratePanel(localDataVariable.get(currentValue));
       add(currentPanel,0);
       add(GenerateButton(),1);
       setSize(900,900);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setTitle("EXAM PANEL");
       c = getContentPane();
       c.setBackground(Color.BLACK);
       setVisible(true);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
   }
   

public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
    public void actionPerformed(ActionEvent ae) {
        try{
            if(ae.getSource()==b1)
            {
                if(localDataVariable.size()>currentValue){
                            
                             
                                String selectedAnswer = getSelectedButtonText(bg);
                                   System.out.println("SELECTED ANSWER : "+selectedAnswer);
                                if(selectedAnswer!=null){
                                    QuestionSet s = localDataVariable.get(currentValue);
                                    System.out.println("SCORE :"+score);
                                    System.out.println("ACTUAL ANSWER : "+s.answer);
                                    if(s.answer.equalsIgnoreCase(selectedAnswer)){
                                        score=score +1;
                                        System.out.println("NEW SCORE : "+score);
                                    }else{
                                        System.out.println("WRONG ANSWER SELECTED.");
                                    }
                                    
                                }else{
                                    System.out.println("NO ANSWER SELECTED");
                                    
                                }
                                
                                
                      
                             
                             currentValue = currentValue + 1;
                             getContentPane().remove(0);
                             currentPanel = GeneratePanel(localDataVariable.get(currentValue));
                             getContentPane().add(currentPanel,0);
                             validate();
                             repaint();
                             setVisible(true);
                        
                    
                }else{
                            getContentPane().removeAll();
                             currentPanel = ShowResult(localDataVariable.size(),score);
                             getContentPane().add(currentPanel,0);
                              
                             validate();
                             
                             repaint();
                            
                             setVisible(true);
                        
                        
                }

            }
        }catch(Exception ex){
            System.out.println("ERROR : "+ex.toString());
        }
    }
    
}
