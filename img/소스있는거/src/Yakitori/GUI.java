package Yakitori;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.Icon;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GUI extends JFrame {

	java.util.Timer timer;  
	
    int countdown;
	
    String[] Ingredient = {"chicken","vegetable"};
    String[] source = {"soySauce ","salt"};
    
    ImageIcon stick= new ImageIcon("img/stick.png");
    ImageIcon chicken= new ImageIcon("img/chicken.png");
    ImageIcon vegetable= new ImageIcon("img/vegetable.png");
    ImageIcon soySauce= new ImageIcon("img/soySauce.png");
    ImageIcon salt= new ImageIcon("img/salt.png");
	boolean isGameStart = false;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 676, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(521, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
		);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.info);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("\uC57C\uB07C\uD1A0\uB9AC\uB97C \uB9CC\uB4E4\uC5B4\uC8FC\uC138\uC694");
		lblNewJgoodiesLabel.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		
		JPanel panel_5 = new JPanel(){ ImageIcon i = new ImageIcon("img/stick.png");
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, -20, 400, 200, this);
		} 
	    }; 
	    panel_5.setBounds(0, 0, 800, 200); 
		
		JLabel label = DefaultComponentFactory.getInstance().createTitle("\uC218\uC815\uB178\uC57C\uB07C\uD1A0\uB9AC\uBBF8\uC138");
		label.setFont(new Font("휴먼모음T", Font.ITALIC, 15));
		label.setBackground(Color.ORANGE);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addGap(140)
									.addComponent(lblNewJgoodiesLabel)
									.addGap(50)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGap(38))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewJgoodiesLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
		);
		
		
		JLabel first = new JLabel();
		first.setSize(100, 100);
		first.setForeground(Color.RED);
		
		JLabel second = new JLabel();
		second.setSize(100, 100);
		second.setForeground(Color.RED);
		
		JLabel third  = new JLabel();
		third.setSize(100, 100);
		third.setForeground(Color.RED);
		
		JLabel sauce = new JLabel();
		sauce.setSize(100, 100);
		sauce.setForeground(Color.RED);
		
		
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(48)
					.addComponent(first, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(second, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(third, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(sauce, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(first, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(second, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(third, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(51, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(sauce, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JLabel time = DefaultComponentFactory.getInstance().createLabel("30");
		time.setFont(new Font("휴먼모음T", Font.BOLD, 30));
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				countdown = 30; //게임 시간 초기화
			    isGameStart = true;   //게임 시작을 알림				

			    timer = new Timer();
			    	timer.schedule(new TimerTask() {
			    
			     @Override
				     public void run() {
					      if (isGameStart) {    
						       
						       countdown--; //1초씩 카운트
						       
						    /*   시간이 다 되었을 때 각각 버거 5개씩 소비에 성공 - > clear
						       							소비에 실패 -> gameOver */
						       
						       if(countdown< 0)  {
							        timer.cancel();
							        isGameStart = false;
						       }
						       time.setText("" + countdown);     
					      }
				     }
			    }, 0, 1000);
			}
		});
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setForeground(new Color(255, 140, 0));
		
		JLabel label_2 = DefaultComponentFactory.getInstance().createLabel("\uC644\uC131");
		
		JPanel panel_4 = new JPanel();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(30, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(117, Short.MAX_VALUE)
					.addComponent(label_2)
					.addContainerGap())
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(time, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(25)
					.addComponent(time)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(103)
					.addComponent(label_2)
					.addGap(8)
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel label_3 = DefaultComponentFactory.getInstance().createLabel("\uBCF4\uAE30");
		
		JLabel lblNewLabel = new JLabel("New label");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(44)
							.addComponent(label_3)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3)
					.addGap(26)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JButton make = new JButton("makeButton");
		
		JComboBox comboBox = new JComboBox(Ingredient);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().equals("chicken")) {
					first.setIcon(chicken);
				} else if (comboBox.getSelectedItem().equals("vegetable")) {
					first.setIcon(vegetable);
				}
			}
		});
		
				comboBox.setForeground(Color.RED);
				
				JComboBox comboBox_1 = new JComboBox(Ingredient);
				comboBox_1.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						if(comboBox_1.getSelectedItem().equals("chicken")) {
							second.setIcon(chicken);
						} else if (comboBox_1.getSelectedItem().equals("vegetable")) {
							second.setIcon(vegetable);
						}
					}
				});
				comboBox_1.setForeground(Color.CYAN);
				
				JComboBox comboBox_2 = new JComboBox(Ingredient);
				comboBox_2.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						if(comboBox_2.getSelectedItem().equals("chicken")) {
							third.setIcon(chicken);
						} else if (comboBox_2.getSelectedItem().equals("vegetable")) {
							third.setIcon(vegetable);
						}
					}
				});
			
				comboBox_2.setForeground(Color.MAGENTA);
				
				JComboBox comboBox_3 = new JComboBox(source);
				comboBox_3.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) { 
						if(comboBox_2.getSelectedItem().equals("soySauce")) {
							sauce.setIcon(soySauce);
						} else if (comboBox_2.getSelectedItem().equals("salt")) {
							sauce.setIcon(salt);
						}
					}
				});
				
						GroupLayout gl_panel_1 = new GroupLayout(panel_1);
						gl_panel_1.setHorizontalGroup(
							gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addGap(35)
									.addComponent(make)
									.addGap(40))
						);
						gl_panel_1.setVerticalGroup(
							gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(50)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(make, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
									.addGap(65))
						);
						panel_1.setLayout(gl_panel_1);
						
						JPanel panel_2 = new JPanel();
						panel_2.setBackground(Color.YELLOW);
						tabbedPane.addTab("New tab", null, panel_2, null);
						
						JButton REPLAY = new JButton("REPLAY");
						
						JButton OUT = new JButton("OUT");
						GroupLayout gl_panel_2 = new GroupLayout(panel_2);
						gl_panel_2.setHorizontalGroup(
							gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(126)
									.addComponent(REPLAY, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
									.addGap(35)
									.addComponent(OUT, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(161, Short.MAX_VALUE))
						);
						gl_panel_2.setVerticalGroup(
							gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
									.addGap(49)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(OUT, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(REPLAY, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
									.addContainerGap(68, Short.MAX_VALUE))
						);
						panel_2.setLayout(gl_panel_2);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
