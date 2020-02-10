package presentation;
import java.io.*;
import Calci_BussinessLayer.Addition;
import Calci_BussinessLayer.Subtration;
import Calci_BussinessLayer.Multiply;
import Calci_BussinessLayer.Divide;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public  class Present implements ActionListener {
Addition o=new Addition();
Subtration su=new Subtration();
Multiply mu=new Multiply();
Divide di=new Divide();
	int s1,s2,ch,result;
JFrame frame;
JPanel p1,p2;
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmultiply,bdivide,benter,breset;
JTextArea t1;
Present(){

	frame=new JFrame("CALCULATOR");
	t1=new JTextArea(5,200);
	
	p1=new JPanel();
	//frame.add(p1);
	
	p2=new JPanel();
	
	frame.add(p2,BorderLayout.CENTER);
	frame.add(p1,BorderLayout.NORTH);
	b0=new Button("0");
	b1=new Button("1");
	b2=new Button("2");
	b3=new Button("3");
	b4=new Button("4");
	b5=new Button("5");
	b6=new Button("6");
	b7=new Button("7");
	b8=new Button("8");
	b9=new Button("9");
	bplus=new Button("+");
	bminus=new Button("-");
	bmultiply=new Button("*");
	bdivide=new Button("/");
	benter=new Button("=");
	breset=new Button("RESET");
	frame.setVisible(true);
	frame.setSize(400,400);
	p2.setVisible(true);
	p2.setSize(400,400);
	p1.setVisible(true);
	p1.setLayout(new FlowLayout(100));
	p2.setLayout(new GridLayout(4,4));
	p1.setSize(300,300);
	//frame.add(t1);
	p1.add(t1);
	p2.add(b0);p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);
	p2.add(b5);p2.add(b6);p2.add(b7);p2.add(b8);p2.add(b9);p2.add(bplus);
	p2.add(bminus);p2.add(bmultiply);p2.add(bdivide);p2.add(benter);p2.add(breset);
	b0.addActionListener(this);b3.addActionListener(this);b6.addActionListener(this);
	b1.addActionListener(this);b4.addActionListener(this);b7.addActionListener(this);
	b2.addActionListener(this);b5.addActionListener(this);b8.addActionListener(this);
	b9.addActionListener(this);bminus.addActionListener(this);bdivide.addActionListener(this);
	bplus.addActionListener(this);bmultiply.addActionListener(this);
	benter.addActionListener(this);breset.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource().equals(breset)) {
		t1.setText("");
	}
	if(ae.getSource().equals(b0)) 
		t1.setText(t1.getText().concat("0"));
	if(ae.getSource().equals(b1)) 
		t1.setText(t1.getText().concat("1"));
	if(ae.getSource().equals(b2)) 
		t1.setText(t1.getText().concat("2"));
	if(ae.getSource().equals(b3)) 
		t1.setText(t1.getText().concat("3"));
	if(ae.getSource().equals(b4)) 
		t1.setText(t1.getText().concat("4"));
	if(ae.getSource().equals(b5)) 
		t1.setText(t1.getText().concat("5"));
	if(ae.getSource().equals(b6)) 
		t1.setText(t1.getText().concat("6"));
	if(ae.getSource().equals(b7)) 
		t1.setText(t1.getText().concat("7"));
	if(ae.getSource().equals(b8)) 
		t1.setText(t1.getText().concat("8"));
	if(ae.getSource().equals(b9)) 
		t1.setText(t1.getText().concat("9"));
	if(ae.getSource().equals(bplus)) {
		s1=Integer.parseInt(t1.getText());
		t1.setText("");
		ch=1;
		}
	if(ae.getSource().equals(bminus)) {
		s1=Integer.parseInt(t1.getText());
		t1.setText("");
		ch=2;
	}
	if(ae.getSource().equals(bmultiply)) 
	{
		s1=Integer.parseInt(t1.getText());
		t1.setText("");
		ch=3;
	}
	if(ae.getSource().equals(bdivide)) 
	{
		s1=Integer.parseInt(t1.getText());
		t1.setText("");
		ch=4;
	}
	if(ae.getSource().equals(benter)) 
	{
		s2=Integer.parseInt(t1.getText());
		if(ch==1) {
			o.add(s1,s2);
			result=s1+s2;
		}
		if(ch==2) {
			su.sub(s1,s2);
			result=s1-s2;
		}
		if(ch==3) {
			mu.mul(s1,s2);
			result=s1*s2;
		}
		if(ch==4) {
			di.div(s1,s2);
			result=s1/s2;
		}
		String ss1=""+result;
		t1.setText(ss1);
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Present();
	}

}
