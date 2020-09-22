package Labirinto;

public class Digger {
	private int xLocal;
	private int yLocal;
	private String[] dna = {};
	
	Comands comand = new Comands();
	
	public Digger(int x, int y) {
		this.xLocal = x;
		this.yLocal = y;
	}
	
	public int getXLocal() {
		return this.xLocal;
	}
	public void setXLocal(int x) {
		this.xLocal = x;
	}
	public int getYLocal() {
		return this.yLocal;
	}
	public void setYLocal(int y) {
		this.yLocal = y;
	}
	
	//nextPosition need a limits of map
	public void nextPosicion(int xLimit, int yLimit) {
		String mov = comand.mov();
		
		switch(mov) {
			case "up":if(this.yLocal > 0) {
						this.yLocal--;
					}
				break;
			
			case "down":if(this.yLocal < yLimit - 1) {
							this.yLocal++;
						}
				break;
				
			case "left":if(this.xLocal > 0) {
							this.xLocal--;
						}
				break;
				
			case"right":if(this.xLocal < xLimit - 1) {
							this.xLocal++;
						}
				break;
		}
		
	}
	public boolean isColisonDigger(int xObj, int yObj) {
		if(xObj == this.xLocal & yObj == this.yLocal) {
			return true;
		}
		return false;
	}
	
}
