package Yakitori;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;
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
import javax.swing.border.BevelBorder;


public class GUI extends JFrame {

	JLabel progressImg;
	JLabel yakitoriImg;
	
	java.util.Timer timer;  
		
	static YakitoriDAO dao = new YakitoriDAO();
	
	Scanner scan = new Scanner(System.in);
	
    int countdown;
	
	static String id;
	
	boolean gameStart=false;
    
    String[] Ingredient = {"select","chicken","vegetable"};
    
    ImageIcon stick= new ImageIcon("img/stick.png");
    ImageIcon chicken= new ImageIcon("img/chicken.png");
    ImageIcon vegetable= new ImageIcon("img/vegetable.png");
    ImageIcon soySauce= new ImageIcon("img/soySauce.png");
    ImageIcon salt= new ImageIcon("img/salt.png");
    
    ImageIcon yakitori_0= new ImageIcon("img/yakitori_0.png");
    ImageIcon yakitori_1= new ImageIcon("img/yakitori_1.png");
    ImageIcon yakitori_2= new ImageIcon("img/yakitori_2.png");
    ImageIcon yakitori_3= new ImageIcon("img/yakitori_3.png");
    ImageIcon yakitori_4= new ImageIcon("img/yakitori_4.png");
    ImageIcon yakitori_5= new ImageIcon("img/yakitori_5.png");
    ImageIcon yakitori_6= new ImageIcon("img/yakitori_6.png");
    ImageIcon yakitori_7= new ImageIcon("img/yakitori_7.png");
    
    ImageIcon progress_1= new ImageIcon("img/20%.png");
    ImageIcon progress_2= new ImageIcon("img/40%.png");
    ImageIcon progress_3= new ImageIcon("img/60%.png");
    ImageIcon progress_4= new ImageIcon("img/80%.png");
    ImageIcon progress_5= new ImageIcon("img/100.png");
    
	JLabel yakitori;
    
	boolean isGameStart = false;
	
	private JPanel contentPane;

	
	/**
	 * Launch the application.
	 */
	

	
	public void yakitoriSelectImg() {

		if(Yakitori.yakitoriSelect==0) yakitoriImg.setIcon(yakitori_0);
		else if (Yakitori.yakitoriSelect==1) yakitoriImg.setIcon(yakitori_1);
		else if (Yakitori.yakitoriSelect==2) yakitoriImg.setIcon(yakitori_2);
		else if (Yakitori.yakitoriSelect==3) yakitoriImg.setIcon(yakitori_3);
		else if (Yakitori.yakitoriSelect==4) yakitoriImg.setIcon(yakitori_4);
		else if (Yakitori.yakitoriSelect==5) yakitoriImg.setIcon(yakitori_5);
		else if (Yakitori.yakitoriSelect==6) yakitoriImg.setIcon(yakitori_6);
		else if (Yakitori.yakitoriSelect==7) yakitoriImg.setIcon(yakitori_7);
	}
	
	public void yakitoriProgressImg() {

		if(YakitoriScore.score==1) progressImg.setIcon(progress_1);
		else if (YakitoriScore.score==2) progressImg.setIcon(progress_2);
		else if (YakitoriScore.score==3) progressImg.setIcon(progress_3);
		else if (YakitoriScore.score==4) progressImg.setIcon(progress_4);
		else progressImg.setIcon(progress_5);
	}

   	public static void insertDB_check() {
   		
		
   		YakitoriScore yy = new YakitoriScore(YakitoriScore.id,YakitoriScore.score);
   		
		try {
			dao.insertScore(yy); // 이렇게 하면 데이터 전달을 위한 객체 생성 완료 dto(데이터 전송 객체)의 목적이며 만들어진 형태는 javabeen이다.
		} catch(Exception e) {
			System.out.println("값 저장 실패["+e.getMessage()+"]");
		}   		
   		
   	}

   	public void replay() {
   		YakitoriScore.id="";
   		YakitoriScore.score=0;
   		this.setVisible(false);
   		this.setVisible(true);
   	}
   	
   	public void out() {
   		try {
			dao.deleteScore(YakitoriScore.id);
		} catch (Exception e) {
			System.out.print("삭제 실패");
			e.printStackTrace();
		} 
   		this.setVisible(false);
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
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("\uC57C\uB07C\uD1A0\uB9AC\uB97C \uB9CC\uB4E4\uC5B4\uC8FC\uC138\uC694");
		lblNewJgoodiesLabel.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		
		JPanel panel_5 = new JPanel(){ ImageIcon i = new ImageIcon("img/stick.png");
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, -20, 400, 200, this);
		} 
	    }; 
	    panel_5.setBounds(0, 0, 800, 200); 
		
		
		JLabel time = DefaultComponentFactory.getInstance().createLabel("30");
		time.setFont(new Font("휴먼모음T", Font.BOLD, 30));
    
	   

		yakitoriImg = new JLabel();
		yakitoriImg.setSize(100, 100);
		yakitoriImg.setForeground(Color.RED);

		JButton btnNewButton = new JButton("START");
		
		btnNewButton.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent arg0) {
				
				gameStart=true;

				Yakitori.yakitoriSelect();
				yakitoriSelectImg();
				

				countdown = 30; //게임 시간 초기화
			    isGameStart = true;   //게임 시작을 알림				

			    timer = new Timer();
			    	timer.schedule(new TimerTask() {
			    
			     @Override
				     public void run() {
					      if (isGameStart) {    
						       
						       countdown--; //1초씩 카운트
						       
						       
						       if(countdown< 0)  {
							        timer.cancel();
							        isGameStart = false;
							        Yakitori.idInput();
									insertDB_check();
																	
						       }
						       time.setText("" + countdown);     
					      }
				     }
			    }, 0, 1000);
			    	

			}
		});

		JLabel label = DefaultComponentFactory.getInstance().createTitle("\uC218\uC815\uB178\uC57C\uB07C\uD1A0\uB9AC\uBBF8\uC138");
		label.setFont(new Font("휴먼모음T", Font.ITALIC, 15));
		label.setBackground(Color.ORANGE);
		
		JLabel label_1 = DefaultComponentFactory.getInstance().createLabel("\uC8FC\uBB38 \uBA54\uB274");
		label_1.setFont(new Font("굴림", Font.BOLD, 15));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(33)
									.addComponent(time, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
									.addGap(60))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(18)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewJgoodiesLabel)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
							.addComponent(label_1)
							.addGap(18)
							.addComponent(yakitoriImg, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(60))))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 677, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(35)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addComponent(yakitoriImg, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap(23, Short.MAX_VALUE)
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
									.addComponent(lblNewJgoodiesLabel)))
							.addGap(18)))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(time, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
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
	
		
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(first, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(second, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(third, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(165, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(third, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(second, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(first, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addContainerGap())))
		);
		panel_5.setLayout(gl_panel_5);
											
											JPanel panel_1 = new JPanel();
											panel_1.setBackground(Color.YELLOW);
											tabbedPane.addTab("Cooking", null, panel_1, null);
											
											JButton make = new JButton("makeButton");
											make.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {

													if(gameStart==true) {
													
														Yakitori.check();

														yakitoriProgressImg();
														
														Yakitori.yakitoriSelect();
														yakitoriSelectImg();
														
														
													} else {
														System.out.println("타이머를 눌려 게임을 시작해주세요!!");
													}
												}

											});
											
											JComboBox comboBox = new JComboBox(Ingredient);
											comboBox.addItemListener(new ItemListener() {
												public void itemStateChanged(ItemEvent e) {
													if(gameStart==true) {
														
														 if(comboBox.getSelectedItem().equals("chicken")) {
																first.setIcon(chicken);
																Yakitori.firstNum=0;
															} else if (comboBox.getSelectedItem().equals("vegetable")) {
																first.setIcon(vegetable);
																Yakitori.firstNum=1;
															}
														
													} else {
														System.out.println("타이머를 눌려 게임을 시작해주세요!!");
													}

												}
											});
											
													comboBox.setForeground(Color.RED);
													
													JComboBox comboBox_1 = new JComboBox(Ingredient);
													comboBox_1.addItemListener(new ItemListener() {
														public void itemStateChanged(ItemEvent e) {

															if(gameStart==true) {
																
																if(comboBox_1.getSelectedItem().equals("chicken")) {
																	second.setIcon(chicken);
																	Yakitori.secondNum=0;
																} else if (comboBox_1.getSelectedItem().equals("vegetable")) {
																	second.setIcon(vegetable);
																	Yakitori.secondNum=1;
																}
																
															} else {
																System.out.println("타이머를 눌려 게임을 시작해주세요!!");
															}

															
															
														}
													});
													comboBox_1.setForeground(new Color(255, 0, 0));
													
													JComboBox comboBox_2 = new JComboBox(Ingredient);
													comboBox_2.addItemListener(new ItemListener() {
														public void itemStateChanged(ItemEvent e) {
															
															
															if(gameStart==true) {
																
																if(comboBox_2.getSelectedItem().equals("chicken")) {
																	third.setIcon(chicken);
																	Yakitori.thirdNum=0;
																} else if (comboBox_2.getSelectedItem().equals("vegetable")) {
																	third.setIcon(vegetable);
																	Yakitori.thirdNum=1;
																}
																
															} else {
																System.out.println("타이머를 눌려 게임을 시작해주세요!!");
															}


														}
													});
													
														comboBox_2.setForeground(Color.RED);
														
														JLabel lblPro = DefaultComponentFactory.getInstance().createLabel("ProgressRate ");
														lblPro.setFont(new Font("휴먼둥근헤드라인", Font.BOLD | Font.ITALIC, 20));
														
														progressImg = DefaultComponentFactory.getInstance().createLabel("");
														progressImg.setSize(100, 100);
														progressImg.setForeground(Color.RED);
														
														
														GroupLayout gl_panel_1 = new GroupLayout(panel_1);
														gl_panel_1.setHorizontalGroup(
															gl_panel_1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addContainerGap()
																	.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addGap(18)
																	.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addGap(18)
																	.addComponent(make)
																	.addGap(51)
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(progressImg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(lblPro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																	.addGap(37))
														);
														gl_panel_1.setVerticalGroup(
															gl_panel_1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addGap(23)
																	.addComponent(lblPro)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(progressImg, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
																	.addContainerGap())
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addGap(41)
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
																		.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
																		.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
																		.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
																		.addComponent(make, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
																	.addContainerGap(31, Short.MAX_VALUE))
														);
														panel_1.setLayout(gl_panel_1);
											
											JPanel panel_2 = new JPanel();
											panel_2.setBackground(Color.LIGHT_GRAY);
											tabbedPane.addTab("Not Cooking", null, panel_2, null);
											
											JButton REPLAY = new JButton("REPLAY");
											REPLAY.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent arg0) {
													replay();
												}
											});
											
											JButton OUT = new JButton("OUT");
											OUT.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent arg0) {
													out();
												}
											});
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
