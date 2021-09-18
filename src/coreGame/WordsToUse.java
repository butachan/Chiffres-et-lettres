package coreGame;
import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class WordsToUse {

	private String[] wordsList;					
	
	//public String[] getWordsList() {return wordsList;}
	//public void setWordsList(String[] wordsList) {this.wordsList = wordsList;}


	public WordsToUse() throws IOException{
		Path wordsFile = Path.of("mots.txt");
		String wordsBase = Files.readString(wordsFile);
		String[] words = wordsBase.split("\\r?\n");
		this.wordsList = words;
	}
	
	
	public String[] getWordsList() {
		return wordsList;
	}


	public String generateRndWord() {
		Random rand = new Random();
		int index =  rand.nextInt(wordsList.length);
		return wordsList[index];
		
	}
	
	//créer un dictionnaire/ tableau qui relie les mots à des définitions/indices
	
	
}
