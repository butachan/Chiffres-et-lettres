package coreGame;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ChiffresVisuel {
	public ChiffresVisuel(){
		JFrame frame = new JFrame("NumbersLayout"); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setTitle("Des chiffres et des lettres");
		frame.setFocusable(true);
		
		JPanel panel = new JPanel(); 
		
		
		//-------------------ajout des opérateur avec icones
		JLabel plus = new JLabel();
		JLabel moins = new JLabel();
		JLabel fois = new JLabel();
		JLabel divise = new JLabel();
		JLabel figures = new JLabel();
		
		//ImageIcon crée l'image à partir de l'URL, nom de fichier ou un tableau de bytes.
		
		//--stocker les images dans le Jlabel
		ImageIcon image_plus = new ImageIcon("images/plus.png");
		plus.setIcon(image_plus);
		ImageIcon image_moins = new ImageIcon("images/moins.png");
		moins.setIcon(image_moins);
		ImageIcon image_fois = new ImageIcon("images/fois.png");
		fois.setIcon(image_fois);
		ImageIcon image_divise = new ImageIcon("images/divise.png");
		divise.setIcon(image_divise);
		moins.setText("-");
		fois.setText("*");
		divise.setText("/");
		//--
		//--placement des éléments dans 
		panel.setLayout(new GridBagLayout());
		
		panel.add(plus);
		panel.add(moins);
		panel.add(fois);
		panel.add(divise);
		
		
		//frame.setLayout(null);
		//chiffres
		String figuresI[] = {"1" , "2" , "3" , "4" , " 5" , "6" ,"7", "8" , "9" ,"0"};
		
		JList b = new JList(figuresI);
		panel.add(b);
		
		/*panel.addKeyListener((KeyListener) new KeyListener() {

			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_NUMPAD0:
					
				}
			}
			public void keyReleased(KeyEvent e) {}
		
		});*/
		
		frame.add(panel);
		
		//------------------------letters
		Letters lettre= new Letters('o');
		lettre.print();
	}

}
