package Help;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingTest4 extends JFrame implements ChangeListener {
	
	Container cp;
	JPanel p, p1, p2, p3;
	JTabbedPane tp; 
	
	public SwingTest4() {
			super("JTabbedPane �׽�Ʈ");
			cp = getContentPane();
			
			p = new JPanel();
			p.setLayout(new BorderLayout());
			
			p1 = new JPanel();	
			p1.add(new JLabel("ù��° ��"));
			tp = new JTabbedPane();
			tp.addTab("first", p1);
	
			p2 = new JPanel();
			p2.add(new JLabel("�ι�° ��"));
			p2.add(new JButton("��ư"));
			tp.addTab("second", p2);
	
			p3 = new JPanel();
			p3.add(new JLabel("���̵� : "));
			p3.add(new JTextField(12));
			p3.add(new JLabel("��й�ȣ : "));
			p3.add(new JPasswordField(12));
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
		System.out.println("stateChanged() ȣ��");
	}
	
	public static void main(String args[]) {
		new SwingTest4();
	}
};
