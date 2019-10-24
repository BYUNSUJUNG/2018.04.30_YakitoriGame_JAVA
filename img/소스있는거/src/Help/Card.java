package Help;

import java.awt.*;
import java.awt.event.*;

public class Card {
	Frame f;
	
	CardLayout card;
	Panel card1;
	Panel card2;
	Panel card3;

	public Card() {
		f = new Frame("Card");
		
		card = new CardLayout();
		card1 = new Panel();
		card2 = new Panel();
		card3 = new Panel();
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
	});
}
	public void makeGUI() {
		f.setSize(200,200);
		f.setLayout(card);
		
		card1.add(new Label("Card1"));
		card1.setBackground(Color.lightGray);
		card1.addMouseListener(new Handler());
		
		card2.add(new Label("Card2"));
		card2.setBackground(Color.orange);
		card2.addMouseListener(new Handler());
		
		card3.add(new Label("Card3"));
		card3.setBackground(Color.red);
		card3.addMouseListener(new Handler());
		
		f.add(card1, "1");
		f.add(card2, "2");
		f.add(card3, "3");
		
		f.setVisible(true);
		card.show(f,"2");
	}
	
	class Handler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if(e.getModifiers() == e.BUTTON3_MASK) {
				card.previous(f);				
			} else {
				card.next(f);
			}
		}
	}
	
	public static void main(String[] args) {
		Card c = new Card();
		c.makeGUI();
	}
}
