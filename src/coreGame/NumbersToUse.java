package coreGame;

import java.util.Random;

public class NumbersToUse 
{
	int[] numberList = new int[5];
	private static int RndNumberArea(int min, int max)
	{
		Random rndNumber = new Random();
		return rndNumber.ints(min , max+1).findFirst().getAsInt();
	}
	
	public NumbersToUse()
	{
		
	}

	public int[] getNumberList() {
		return numberList;
	}

	public void setNumberList(int[] numberList) {
		this.numberList = numberList;
	}
	
	
}
