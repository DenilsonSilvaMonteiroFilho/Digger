package Labirinto;

import java.util.Random;

public class Comands {
	private String movements[] = {"up","down","left","right"};
	private Random rand = new Random();
	private int range = movements.length;
	
	
	public String mov() {
		int numRandom = rand.nextInt(range);
		String movement = movements[numRandom];
		return movement;
	}
}
