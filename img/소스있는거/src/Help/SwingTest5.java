package Help;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingTest5 extends JFrame implements ChangeListener {
	
	Container cp;
	JPanel p, p1, p2, p3;
	JTabbedPane tp; 
	
	public SwingTest5() {
			super("JTabbedPane 테스트");
			cp = getContentPane();
			
			p = new JPanel();
			p.setLayout(new BorderLayout());
			
			p1 = new JPanel();	
			tp = new JTabbedPane();
			tp.addTab("first", p1);
	
			p2 = new JPanel();
			tp.addTab("second", p2);
	
			p3 = new JPanel();
			tp.addTab("third", p3);
			
			tp.addChangeListener(this); 
			tp.setSelectedIndex(2);
	
			p.add(tp);
			cp.add(p);
	
			display();
	}
	
	public void display() {
		setSize(200, 200);
		setVisible(true);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void stateChanged(ChangeEvent e) {
		System.out.println("stateChanged() 호출");
	}
	
	public static void main(String args[]) {
		new SwingTest5();
	}
};
