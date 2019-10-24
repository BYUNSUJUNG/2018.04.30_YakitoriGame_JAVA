package Help;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
//import javax.swing.table.*;
//import javax.swing.tree.*;

class Exec_05_Sub extends JFrame {
 
 private BorderLayout bl = new BorderLayout();
 
 private JDesktopPane pane = new JDesktopPane();
 
 private JInternalFrame jif1 = new JInternalFrame("1번", true, true, true, true);
 private JInternalFrame jif2 = new JInternalFrame("2번", true, true, true, true);
 private JInternalFrame jif3 = new JInternalFrame("3번", true, true, true, true);

 public Exec_05_Sub(String title) {
  super(title);
  
  this.init();
  this.start();
  
  this.setSize(400, 400);
  Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
  Dimension frm = this.getSize();
  int xpos = (int)(screen.getWidth() / 2 - frm.getWidth() / 2);
  int ypos = (int)(screen.getHeight() / 2 - frm.getHeight() / 2);
  this.setLocation(xpos, ypos);
  this.setResizable(false);
  this.setVisible(true);
 }
 public void init() {
  Container con = this.getContentPane();
  con.setLayout(bl);
  jif1.setBounds(0, 0, 200, 150);
  jif2.setBounds(20, 20, 200, 150);
  jif3.setBounds(40, 40, 200, 150);
  pane.add(jif1);
  pane.add(jif2);
  pane.add(jif3);
  jif1.setVisible(true);
  jif2.setVisible(true);
  jif3.setVisible(true);
  con.add("Center", pane);
 }
 public void start() {
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public static void main(String[] ar) {
  Exec_05_Sub ex = new Exec_05_Sub("제목");
 }

}
