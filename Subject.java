
package com.mcq1;

import java.awt.Color;
import java.awt.Container;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Subject extends JFrame implements ActionListener{

 JPanel jp;
 JComboBox pref;
 JButton b1;
 Container c;
 Vector v;
 Subject()
 {
     jp = new JPanel();
       jp.setBounds(0,0,400,300);
       jp.setLayout(null);
       
       v= new Vector(8,2);
         String options[] = {"JAVA","DATA STRUCTURES","GENERAL KNOWLEDGE","BASIC ARITHMETIC"};
         
       pref = new JComboBox(options);
       pref.setBackground(Color.ORANGE);
       pref.setBounds(100,70,200,40);
       jp.add(pref);
       
         b1 = new JButton("OK");
       b1.setBounds(150,170,100,30);
       jp.add(b1);
 
        b1.addActionListener(this);
       
        setLayout(null);
       add(jp);
       setSize(400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setTitle("SUBJECT PANEL");

       setVisible(true);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
 }
    public void actionPerformed(ActionEvent ae) {
       
        if(ae.getSource()==pref)
        {
        v.insertElementAt(pref.getSelectedItem(),0);
        }
        if(ae.getSource()==b1)
        {
            Vector<QuestionSet> v_sc = new Vector<QuestionSet>(8,2);
 
            if(pref.getSelectedItem().toString().equalsIgnoreCase("JAVA")){
                v_sc.add(new QuestionSet("<html>Which of these keyword must be \nused to inherit a class?</html>","super","this","extent","extends","extends"));
                v_sc.add(new QuestionSet("<html>Which of these method of class String is used to compare two String objects for their equality</html>?","equals()","Equals()","isequal()","Isequal()","equals()"));
                v_sc.add(new QuestionSet("<html>What is the return type of Constructors?</html>","int","float","void","<html>None of the mentioned","<html>None of the mentioned"));
                v_sc.add(new QuestionSet("<html>Which of the following is a method having same name as that of its class?</html>","finalize","delete","class","constructor","constructor"));
                v_sc.add(new QuestionSet("<html>Which of these is correct way of inheriting class A by class B?</html>","<html>class B + class A {}","<html>class B inherits class A {}","<html>class B extends A {}","<html>class B extends class A {}","<html>class B extends A {}"));
                v_sc.add(new QuestionSet("<html>Which of these class is related to all the exceptions that can be caught by using catch?</html>","Error","Exception","<html>RuntimeExecption","<html>All of the mentioned","Exception"));
                v_sc.add(new QuestionSet("<html>Which of these keywords is used by a class to use an interface defined previously?</html>","import","Import","implements","Implements","implements"));
                v_sc.add(new QuestionSet("<html>Which of these keywords can be used to prevent Method overriding?</html>","static","constant","protected","final","final"));
                v_sc.add(new QuestionSet("<html>Which of the following is correct way of importing an entire package ‘pkg’?</html>","import pkg.","Import pkg.","import pkg.*","Import pkg.*","import pkg.*"));
                v_sc.add(new QuestionSet("<html>Which of these functions is called to display the output of an applet?</html>","display()","paint()","<html>PrintApplet()","<html>displayApplet()","paint()"));
//               
                
            }else if(pref.getSelectedItem().toString().equalsIgnoreCase("DATA STRUCTURES")){
                v_sc.add(new QuestionSet("<html>Process of inserting an element in stack is called ____________</html>","push","pop","create","evaluation","push"));
                v_sc.add(new QuestionSet("<html>In a stack, if a user tries to remove an element from empty stack it is called _________</html>","empty collection","underflow","overflow","<html>garbage collection","underflow"));
                v_sc.add(new QuestionSet("<html>Which of the following is false about a binary search tree?</html>","<html>The left child is always lesser than its parent","<html>The right child is always greater than its parent","<html>The left and right sub-trees should also be binary search trees","<html>None of the mentioned","<html>None of the mentioned"));
                v_sc.add(new QuestionSet("<html>A linear collection of data elements where the linear node is given by means of pointer is called?</html>","Linked list","Node list","Primitive list","None of the mentioned","Linked list"));
                v_sc.add(new QuestionSet("<html>Which of the following c code is used to create new node ?</html>","<html>ptr = (NODE*)malloc(sizeof(NODE));","<html>ptr = (NODE*)malloc(NODE);","<html>ptr = (NODE*)malloc(sizeof(NODE*));","<html>ptr = (NODE)malloc(sizeof(NODE));","<html>ptr = (NODE*)malloc(sizeof(NODE));"));
                v_sc.add(new QuestionSet("<html>Which of the following properties is associated with a queue?</html>","<html>First In Last Out","<html>First In First Out","<html>Last In First Out","<html>None of the mentioned","<html>First In First Out"));
                v_sc.add(new QuestionSet("<html>The number of edges from the root to the node is called __________ of the tree.</html>","Height","Depth","Length","<html>None of the mentioned","Depth"));
                v_sc.add(new QuestionSet("<html>Which of the following is false about a doubly linked list?</html>","<html>We can navigate in both the directions","<html>It requires more space than a singly linked list","<html>The insertion and deletion of a node take a bit longer","<html>None of the mentioned","<html>None of the mentioned"));
                v_sc.add(new QuestionSet("<html>The type of expression in which operator succeeds its operands is _____________</html>","<html>Infix Expression","<html>Prefix Expression","<html>Postfix Expression","<html>None of the mentioned","<html>Postfix Expression"));
                v_sc.add(new QuestionSet("<html>If the elements “A”, “B”, “C” and “D” are placed in a stack and are deleted one at a time, what is the order of removal?</html>","ABCD","DCBA","DCAB","ABDC","DCBA"));
                 
            }
            else if(pref.getSelectedItem().toString().equalsIgnoreCase("GENERAL KNOWLEDGE")){
                v_sc.add(new QuestionSet("<html>Hitler party which came into power in 1933 is known as _____________","Labour Party","Nazi Party","<html>Democratic Party","<html>Ku-Klux-Klan","Nazi Party"));
                v_sc.add(new QuestionSet("<html>Entomology is the science that studies __________","<html>Behavior of human beings","Insects","<html>The origin and history of technical and scientific terms","<html>The formation of rocks","Insects"));
                v_sc.add(new QuestionSet("<html>Who was known as Iron man of India?","<html>Govind Ballabh Pant","<html>Jawaharlal Nehru","<html>Subhash Chandra Bose","<html>Sardar Vallabhbhai Patel","<html>Sardar Vallabhbhai Patel"));
                v_sc.add(new QuestionSet("<html>Golden Temple is situated in ___________","New Delhi","Agra","Amritsar","Mumbai","Amritsar"));
                v_sc.add(new QuestionSet("<html>What is part of a database that holds only one type of information?","File","Record","Report","Field","Field"));
                v_sc.add(new QuestionSet("<html>Sun Temple is situated at?","Konark","Bangalore","Haridwar","Kerala","Konark"));
                v_sc.add(new QuestionSet("<html>The nucleus of an atom consists of __________","<html>electrons and neutrons","<html>electrons and protons","<html>protons and neutrons","<html>All of the these","<html>protons and neutrons"));
                v_sc.add(new QuestionSet("<html>The National Song of India was composed by _____________","<html>Rabindranath Tagore","<html>Bankim Chandra Chatterji","<html>Jai Shankar Prasad","Iqbal","<html>Bankim Chandra Chatterji"));
                v_sc.add(new QuestionSet("<html>'DB' computer abbreviation usually means ?","Database","Double Byte","Driver Boot","Data Block","Database"));
                v_sc.add(new QuestionSet("<html>When is the International Workers' Day?","1st August","1st May","15th April","12th December","1st May"));
                 
            }
            else if(pref.getSelectedItem().toString().equalsIgnoreCase("BASIC ARITHMETIC")){
                v_sc.add(new QuestionSet("<html>What is the value of x^0 ?","zero","x","one","none of the above","one"));
                v_sc.add(new QuestionSet("<html>An acute angle is ... ?","90 degree","less than 90 degree","more than 90 degree","None of these","less than 90 degree"));
                v_sc.add(new QuestionSet("<html>Name a triangle whose two angles are equal.","Right angle triangle","Isosceles triangle","Scalene triangle","None of these","Isosceles triangle"));
                v_sc.add(new QuestionSet("<html>When we multiply an exact number by zero what will be the exact answer?","the exact number","cannot be multiplied","zero","None of the above","zero"));
                v_sc.add(new QuestionSet("<html>What is 999 times 100.0?","199.0","999.0","9990","99900","99900"));
                v_sc.add(new QuestionSet("<html>What is the unit of volume?","square units","cubic units","Only units","no units","cubic units"));
                v_sc.add(new QuestionSet("<html>How many times 1000 is bigger than 1?","1000 times","100 times","99 times","10 times","1000 times"));
                v_sc.add(new QuestionSet("<html>What is squareroot of 256?","16","17","15","19","16"));
                v_sc.add(new QuestionSet("<html>What is 1004 divided by 2?","52","502","5020","520","502"));
                v_sc.add(new QuestionSet(" 2 + 4 = ?","5","6","7","8","6"));
            }



	


            

            
            Test t = new Test(v_sc);   

        }
    }
   
    
}
