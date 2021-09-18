package coreGame;

import java.awt.GridBagLayout; //gestionnaire de placement
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("yo");
		new ChiffresVisuel();
		WordsToUse word = new WordsToUse();
		String wordGuess = word.generateRndWord();
		System.out.println(wordGuess);
	}
	
}

